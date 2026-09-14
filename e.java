import random
import time
import os

DIFFICULTIES = {
    "1": {"name": "Easy", "range": (1, 50), "max_attempts": 10, "multiplier": 1.0},
    "2": {"name": "Medium", "range": (1, 100), "max_attempts": 7, "multiplier": 1.5},
    "3": {"name": "Hard", "range": (1, 200), "max_attempts": 5, "multiplier": 2.5},
    "4": {"name": "Expert", "range": (1, 500), "max_attempts": 8, "multiplier": 3.0}
}

session_stats = {
    "games_played": 0,
    "games_won": 0,
    "total_attempts": 0,
    "best_score": 0,
    "leaderboard": []
}

def clear():
    os.system("cls" if os.name == "nt" else "clear")

def get_proximity(guess, secret, low, high):
    distance = abs(guess - secret)
    span = high - low

    if distance <= span * 0.05:
        return "Very close!"
    elif distance <= span * 0.15:
        return "Getting warm."
    elif distance <= span * 0.30:
        return "Not quite."
    else:
        return "Way off."

def calculate_score(attempts, elapsed, multiplier):
    base = 1000 * multiplier
    attempt_penalty = (attempts - 1) * (50 * multiplier)
    time_penalty = min(elapsed * 2, 200)
    return max(0, int(base - attempt_penalty - time_penalty))

def choose_difficulty():
    print("\nSelect a Difficulty Level:\n")

    for key, val in DIFFICULTIES.items():
        low, high = val["range"]
        print(f"{key}. {val['name']} - Guess between {low} and {high} "
              f"({val['max_attempts']} attempts)")

    while True:
        choice = input("\nEnter 1, 2, 3 or 4: ").strip()

        if choice in DIFFICULTIES:
            return DIFFICULTIES[choice]

        print("Invalid Choice! Try Again.")

def play_game(player_name, difficulty):

    low, high = difficulty["range"]
    max_attempts = difficulty["max_attempts"]

    secret = random.randint(low, high)

    attempts = 0
    history = []

    clear()

    print(f"===== {difficulty['name']} MODE =====")
    print(f"Guess a number between {low} and {high}")
    print(f"You have {max_attempts} attempts.\n")

    start_time = time.time()

    while attempts < max_attempts:

        remaining = max_attempts - attempts

        if history:
            print("Previous Guesses:", history)

        print("Attempts Remaining:", remaining)

        try:
            guess = int(input("Enter Your Guess: "))
        except ValueError:
            print("Please Enter a Valid Number!\n")
            continue

        if not (low <= guess <= high):
            print(f"Enter a number between {low} and {high}\n")
            continue

        attempts += 1
        history.append(guess)

        if guess == secret:

            elapsed = round(time.time() - start_time, 1)

            score = calculate_score(
                attempts,
                elapsed,
                difficulty["multiplier"]
            )

            print("\nCORRECT!")
            print("The Number Was:", secret)
            print("Attempts:", attempts)
            print("Time:", elapsed, "seconds")
            print("Score:", score)

            return True, attempts, score

        elif guess < secret:
            print("Too Low!", get_proximity(guess, secret, low, high), "\n")

        else:
            print("Too High!", get_proximity(guess, secret, low, high), "\n")

    print("\nGAME OVER!")
    print("The Correct Number Was:", secret)

    return False, attempts, 0

def show_stats(player_name):

    games = session_stats["games_played"]

    if games == 0:
        return

    win_rate = round(
        (session_stats["games_won"] / games) * 100
    )

    avg = round(
        session_stats["total_attempts"] / games,
        1
    )

    print("\n===== SESSION STATS =====")
    print("Player:", player_name)
    print("Games Played:", games)
    print("Games Won:", session_stats["games_won"])
    print("Win Rate:", str(win_rate) + "%")
    print("Average Attempts:", avg)
    print("Best Score:", session_stats["best_score"])

    if session_stats["leaderboard"]:

        print("\nTop Scores")

        top = sorted(
            session_stats["leaderboard"],
            key=lambda x: x[1],
            reverse=True
        )[:5]

        for i, (level, score, att) in enumerate(top, 1):
            print(f"{i}. {level} - {score} points ({att} attempts)")

def main():

    clear()

    print("===== NUMBER GUESSING GAME =====\n")

    player_name = input("Enter Your Name: ").strip()

    if player_name == "":
        player_name = "Player"

    while True:

        difficulty = choose_difficulty()

        won, attempts, score = play_game(
            player_name,
            difficulty
        )

        session_stats["games_played"] += 1
        session_stats["total_attempts"] += attempts

        if won:

            session_stats["games_won"] += 1

            if score > session_stats["best_score"]:
                session_stats["best_score"] = score

            session_stats["leaderboard"].append(
                (difficulty["name"], score, attempts)
            )

        show_stats(player_name)

        print("\n1. Play Again (Same Difficulty)")
        print("2. Play Again (New Difficulty)")
        print("3. Quit")

        choice = input("\nEnter Choice: ")

        if choice == "1":
            continue

        elif choice == "2":
            clear()
            continue

        else:
            print(f"\nThanks For Playing, {player_name}!")
            print("Best Score:", session_stats["best_score"])
            break

if __name__ == "__main__":
    main()