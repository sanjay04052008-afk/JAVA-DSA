import java.util.Scanner;

class ShootingGame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int bullets = 5;
        int enemyLife = 3;
        int choice;

        while(bullets > 0 && enemyLife > 0)
        {
            System.out.println("Bullets Left: " + bullets);
            System.out.println("Enemy Life: " + enemyLife);
            System.out.println("Enter 1 to HIT or 0 to MISS:");
            
            choice = sc.nextInt();

            if(choice == 1)
            {
                System.out.println("Hit!");
                enemyLife--;
            }
            else
            {
                System.out.println("Miss!");
            }

            bullets--;
        }

        if(enemyLife == 0)
        {
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("Game Over!");
        }
    }
}