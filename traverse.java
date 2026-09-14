// ============================================================
//  Student.java  –  Data model for a Student record
// ============================================================
public class Student {

    private int    id;
    private String name;
    private String department;
    private double cgpa;
    private String status;   // "Pending", "Enrolled", "Removed"

    // ── Constructor ──────────────────────────────────────────
    public Student(int id, String name, String department, double cgpa) {
        this.id         = id;
        this.name       = name;
        this.department = department;
        this.cgpa       = cgpa;
        this.status     = "Pending";
    }

    // ── Getters & Setters ────────────────────────────────────
    public int    getId()           { return id; }
    public String getName()         { return name; }
    public String getDepartment()   { return department; }
    public double getCgpa()         { return cgpa; }
    public String getStatus()       { return status; }

    public void setStatus(String status) { this.status = status; }
    public void setCgpa(double cgpa)     { this.cgpa  = cgpa;   }

    // ── Pretty-print one row ─────────────────────────────────
    @Override
    public String toString() {
        return String.format("| %-4d | %-20s | %-12s | %-4.2f | %-10s |",
                id, name, department, cgpa, status);
    }
}
// ============================================================
//  AdmissionQueue.java  –  Queue of students waiting for
//  admission processing  (uses java.util.LinkedList as Queue)
// ============================================================
import java.util.LinkedList;
import java.util.Queue;

public class AdmissionQueue {

    // ── Internal Queue (FIFO) ────────────────────────────────
    private Queue<Student> queue = new LinkedList<>();

    // ── Add a student to the end of the queue ────────────────
    public void enqueue(Student s) {
        queue.offer(s);
        System.out.println("  ✔  " + s.getName()
                + " added to admission queue  (position " + queue.size() + ")");
    }

    // ── Process (remove) the first student in the queue ──────
    public Student dequeue() {
        if (isEmpty()) {
            System.out.println("  ✘  Admission queue is empty.");
            return null;
        }
        Student s = queue.poll();
        s.setStatus("Enrolled");
        System.out.println("  ✔  " + s.getName()
                + " has been enrolled successfully!");
        return s;
    }

    // ── Peek at who's next without removing ──────────────────
    public Student peek() {
        return queue.peek();
    }

    // ── Show everyone currently waiting ──────────────────────
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("  (No students in admission queue)");
            return;
        }
        System.out.println("\n  Students waiting for admission  [FIFO order]:");
        printHeader();
        int pos = 1;
        for (Student s : queue) {
            System.out.println("  " + pos++ + ". " + s);
        }
        printFooter();
    }

    public boolean isEmpty() { return queue.isEmpty(); }
    public int     size()    { return queue.size();    }

    // ── Helpers ───────────────────────────────────────────────
    private void printHeader() {
        System.out.println("  +------+----------------------+--------------+------+------------+");
        System.out.println("  | ID   | Name                 | Department   | CGPA | Status     |");
        System.out.println("  +------+----------------------+--------------+------+------------+");
    }
    private void printFooter() {
        System.out.println("  +------+----------------------+--------------+------+------------+");
    }
}
// ============================================================
//  UndoStack.java  –  Stack that records every action so the
//  user can undo the last operation  (uses java.util.Stack)
// ============================================================
import java.util.Stack;

public class UndoStack {

    // ── An action record stored on the stack ─────────────────
    static class Action {
        String  type;     // "ADD", "ENROLL", "REMOVE", "UPDATE_CGPA"
        Student student;  // snapshot of the student involved
        double  prevCgpa; // used only for UPDATE_CGPA

        Action(String type, Student student) {
            this.type    = type;
            this.student = student;
        }

        Action(String type, Student student, double prevCgpa) {
            this.type     = type;
            this.student  = student;
            this.prevCgpa = prevCgpa;
        }

        @Override
        public String toString() {
            return type + " → " + student.getName()
                    + " (ID " + student.getId() + ")";
        }
    }

    // ── Internal Stack (LIFO) ────────────────────────────────
    private Stack<Action> stack = new Stack<>();

    // ── Push a new action ────────────────────────────────────
    public void push(Action action) {
        stack.push(action);
    }

    // ── Pop the most recent action for undo ──────────────────
    public Action pop() {
        if (isEmpty()) {
            System.out.println("  ✘  Nothing to undo.");
            return null;
        }
        return stack.pop();
    }

    // ── Peek without removing ────────────────────────────────
    public Action peek() {
        if (isEmpty()) return null;
        return stack.peek();
    }

    // ── Display full history ──────────────────────────────────
    public void displayHistory() {
        if (isEmpty()) {
            System.out.println("  (No action history)");
            return;
        }
        System.out.println("\n  Action History  [most recent on top]:");
        System.out.println("  +-----+------------------------------------------+");
        System.out.println("  | #   | Action                                   |");
        System.out.println("  +-----+------------------------------------------+");

        Object[] arr = stack.toArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("  | %-3d | %-40s |%n",
                    (arr.length - i), arr[i]);
        }
        System.out.println("  +-----+------------------------------------------+");
    }

    public boolean isEmpty() { return stack.isEmpty(); }
    public int     size()    { return stack.size();    }
}
// ============================================================
//  StudentManager.java  –  Core logic layer
//  Manages enrolled student records, delegates to
//  AdmissionQueue (Queue) and UndoStack (Stack).
// ============================================================
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    // ── Enrolled student records ──────────────────────────────
    private List<Student>   enrolledStudents = new ArrayList<>();

    // ── DS instances ─────────────────────────────────────────
    private AdmissionQueue  admissionQueue   = new AdmissionQueue();
    private UndoStack       undoStack        = new UndoStack();

    // ── Auto-increment ID counter ────────────────────────────
    private int nextId = 1001;

    // ══════════════════════════════════════════════════════════
    //  1. ADD  –  enqueue a new student
    // ══════════════════════════════════════════════════════════
    public void addStudentToQueue(String name, String dept, double cgpa) {
        Student s = new Student(nextId++, name, dept, cgpa);
        admissionQueue.enqueue(s);
        undoStack.push(new UndoStack.Action("ADD", s));
    }

    // ══════════════════════════════════════════════════════════
    //  2. ENROLL  –  dequeue next student and move to records
    // ══════════════════════════════════════════════════════════
    public void enrollNextStudent() {
        Student s = admissionQueue.dequeue();
        if (s != null) {
            enrolledStudents.add(s);
            undoStack.push(new UndoStack.Action("ENROLL", s));
        }
    }

    // ══════════════════════════════════════════════════════════
    //  3. REMOVE  –  remove an enrolled student by ID
    // ══════════════════════════════════════════════════════════
    public void removeStudent(int id) {
        Student found = findEnrolledById(id);
        if (found == null) {
            System.out.println("  ✘  No enrolled student found with ID " + id);
            return;
        }
        found.setStatus("Removed");
        enrolledStudents.remove(found);
        undoStack.push(new UndoStack.Action("REMOVE", found));
        System.out.println("  ✔  " + found.getName() + " removed from records.");
    }

    // ══════════════════════════════════════════════════════════
    //  4. UPDATE CGPA
    // ══════════════════════════════════════════════════════════
    public void updateCgpa(int id, double newCgpa) {
        Student found = findEnrolledById(id);
        if (found == null) {
            System.out.println("  ✘  No enrolled student found with ID " + id);
            return;
        }
        double old = found.getCgpa();
        found.setCgpa(newCgpa);
        undoStack.push(new UndoStack.Action("UPDATE_CGPA", found, old));
        System.out.printf("  ✔  CGPA updated: %.2f  →  %.2f%n", old, newCgpa);
    }

    // ══════════════════════════════════════════════════════════
    //  5. UNDO  –  reverse the last action
    // ══════════════════════════════════════════════════════════
    public void undo() {
        UndoStack.Action action = undoStack.pop();
        if (action == null) return;

        switch (action.type) {
            case "ADD":
                System.out.println("  ↩  Undo ADD: "
                        + action.student.getName()
                        + " removed from consideration.");
                break;

            case "ENROLL":
                enrolledStudents.remove(action.student);
                action.student.setStatus("Pending");
                admissionQueue.enqueue(action.student);
                System.out.println("  ↩  Undo ENROLL: "
                        + action.student.getName()
                        + " moved back to admission queue.");
                break;

            case "REMOVE":
                action.student.setStatus("Enrolled");
                enrolledStudents.add(action.student);
                System.out.println("  ↩  Undo REMOVE: "
                        + action.student.getName()
                        + " restored to enrolled records.");
                break;

            case "UPDATE_CGPA":
                double current = action.student.getCgpa();
                action.student.setCgpa(action.prevCgpa);
                System.out.printf("  ↩  Undo UPDATE_CGPA: CGPA reverted %.2f → %.2f%n",
                        current, action.prevCgpa);
                break;

            default:
                System.out.println("  ✘  Unknown action type; cannot undo.");
        }
    }

    // ══════════════════════════════════════════════════════════
    //  6. SEARCH enrolled students by name
    // ══════════════════════════════════════════════════════════
    public void searchByName(String keyword) {
        boolean found = false;
        printHeader();
        for (Student s : enrolledStudents) {
            if (s.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("  " + s);
                found = true;
            }
        }
        printFooter();
        if (!found) System.out.println("  (No match found for \"" + keyword + "\")");
    }

    // ══════════════════════════════════════════════════════════
    //  7. DISPLAY helpers
    // ══════════════════════════════════════════════════════════
    public void displayEnrolled() {
        if (enrolledStudents.isEmpty()) {
            System.out.println("  (No enrolled students yet)");
            return;
        }
        System.out.println("\n  Enrolled Students:");
        printHeader();
        for (Student s : enrolledStudents) {
            System.out.println("  " + s);
        }
        printFooter();
        System.out.println("  Total enrolled: " + enrolledStudents.size());
    }

    public void displayQueue()   { admissionQueue.displayQueue();   }
    public void displayHistory() { undoStack.displayHistory();      }

    public void showNextInQueue() {
        Student s = admissionQueue.peek();
        if (s == null) System.out.println("  (Queue is empty)");
        else System.out.println("  Next to be enrolled: "
                + s.getName() + "  (ID " + s.getId() + ")");
    }

    // ── Utility ───────────────────────────────────────────────
    private Student findEnrolledById(int id) {
        for (Student s : enrolledStudents)
            if (s.getId() == id) return s;
        return null;
    }

    private void printHeader() {
        System.out.println("  +------+----------------------+--------------+------+------------+");
        System.out.println("  | ID   | Name                 | Department   | CGPA | Status     |");
        System.out.println("  +------+----------------------+--------------+------+------------+");
    }
    private void printFooter() {
        System.out.println("  +------+----------------------+--------------+------+------------+");
    }
}
// ============================================================
//  StudentManager.java  –  Core logic layer
//  Manages enrolled student records, delegates to
//  AdmissionQueue (Queue) and UndoStack (Stack).
// ============================================================
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    // ── Enrolled student records ──────────────────────────────
    private List<Student>   enrolledStudents = new ArrayList<>();

    // ── DS instances ─────────────────────────────────────────
    private AdmissionQueue  admissionQueue   = new AdmissionQueue();
    private UndoStack       undoStack        = new UndoStack();

    // ── Auto-increment ID counter ────────────────────────────
    private int nextId = 1001;

    // ══════════════════════════════════════════════════════════
    //  1. ADD  –  enqueue a new student
    // ══════════════════════════════════════════════════════════
    public void addStudentToQueue(String name, String dept, double cgpa) {
        Student s = new Student(nextId++, name, dept, cgpa);
        admissionQueue.enqueue(s);
        undoStack.push(new UndoStack.Action("ADD", s));
    }

    // ══════════════════════════════════════════════════════════
    //  2. ENROLL  –  dequeue next student and move to records
    // ══════════════════════════════════════════════════════════
    public void enrollNextStudent() {
        Student s = admissionQueue.dequeue();
        if (s != null) {
            enrolledStudents.add(s);
            undoStack.push(new UndoStack.Action("ENROLL", s));
        }
    }

    // ══════════════════════════════════════════════════════════
    //  3. REMOVE  –  remove an enrolled student by ID
    // ══════════════════════════════════════════════════════════
    public void removeStudent(int id) {
        Student found = findEnrolledById(id);
        if (found == null) {
            System.out.println("  ✘  No enrolled student found with ID " + id);
            return;
        }
        found.setStatus("Removed");
        enrolledStudents.remove(found);
        undoStack.push(new UndoStack.Action("REMOVE", found));
        System.out.println("  ✔  " + found.getName() + " removed from records.");
    }

    // ══════════════════════════════════════════════════════════
    //  4. UPDATE CGPA
    // ══════════════════════════════════════════════════════════
    public void updateCgpa(int id, double newCgpa) {
        Student found = findEnrolledById(id);
        if (found == null) {
            System.out.println("  ✘  No enrolled student found with ID " + id);
            return;
        }
        double old = found.getCgpa();
        found.setCgpa(newCgpa);
        undoStack.push(new UndoStack.Action("UPDATE_CGPA", found, old));
        System.out.printf("  ✔  CGPA updated: %.2f  →  %.2f%n", old, newCgpa);
    }

    // ══════════════════════════════════════════════════════════
    //  5. UNDO  –  reverse the last action
    // ══════════════════════════════════════════════════════════
    public void undo() {
        UndoStack.Action action = undoStack.pop();
        if (action == null) return;

        switch (action.type) {
            case "ADD":
                System.out.println("  ↩  Undo ADD: "
                        + action.student.getName()
                        + " removed from consideration.");
                break;

            case "ENROLL":
                enrolledStudents.remove(action.student);
                action.student.setStatus("Pending");
                admissionQueue.enqueue(action.student);
                System.out.println("  ↩  Undo ENROLL: "
                        + action.student.getName()
                        + " moved back to admission queue.");
                break;

            case "REMOVE":
                action.student.setStatus("Enrolled");
                enrolledStudents.add(action.student);
                System.out.println("  ↩  Undo REMOVE: "
                        + action.student.getName()
                        + " restored to enrolled records.");
                break;

            case "UPDATE_CGPA":
                double current = action.student.getCgpa();
                action.student.setCgpa(action.prevCgpa);
                System.out.printf("  ↩  Undo UPDATE_CGPA: CGPA reverted %.2f → %.2f%n",
                        current, action.prevCgpa);
                break;

            default:
                System.out.println("  ✘  Unknown action type; cannot undo.");
        }
    }

    // ══════════════════════════════════════════════════════════
    //  6. SEARCH enrolled students by name
    // ══════════════════════════════════════════════════════════
    public void searchByName(String keyword) {
        boolean found = false;
        printHeader();
        for (Student s : enrolledStudents) {
            if (s.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("  " + s);
                found = true;
            }
        }
        printFooter();
        if (!found) System.out.println("  (No match found for \"" + keyword + "\")");
    }

    // ══════════════════════════════════════════════════════════
    //  7. DISPLAY helpers
    // ══════════════════════════════════════════════════════════
    public void displayEnrolled() {
        if (enrolledStudents.isEmpty()) {
            System.out.println("  (No enrolled students yet)");
            return;
        }
        System.out.println("\n  Enrolled Students:");
        printHeader();
        for (Student s : enrolledStudents) {
            System.out.println("  " + s);
        }
        printFooter();
        System.out.println("  Total enrolled: " + enrolledStudents.size());
    }

    public void displayQueue()   { admissionQueue.displayQueue();   }
    public void displayHistory() { undoStack.displayHistory();      }

    public void showNextInQueue() {
        Student s = admissionQueue.peek();
        if (s == null) System.out.println("  (Queue is empty)");
        else System.out.println("  Next to be enrolled: "
                + s.getName() + "  (ID " + s.getId() + ")");
    }

    // ── Utility ───────────────────────────────────────────────
    private Student findEnrolledById(int id) {
        for (Student s : enrolledStudents)
            if (s.getId() == id) return s;
        return null;
    }

    private void printHeader() {
        System.out.println("  +------+----------------------+--------------+------+------------+");
        System.out.println("  | ID   | Name                 | Department   | CGPA | Status     |");
        System.out.println("  +------+----------------------+--------------+------+------------+");
    }
    private void printFooter() {
        System.out.println("  +------+----------------------+--------------+------+------------+");
    }
}
// ============================================================
//  Main.java  –  Entry point & interactive console menu
//
//  DATA STRUCTURES USED:
//   • Queue (java.util.LinkedList) → AdmissionQueue  [FIFO]
//   • Stack (java.util.Stack)      → UndoStack       [LIFO]
// ============================================================
import java.util.Scanner;

public class Main {

    static Scanner        sc  = new Scanner(System.in);
    static StudentManager mgr = new StudentManager();

    // ── Colour constants ──────────────────────────────────────
    static final String RESET  = "\u001B[0m";
    static final String CYAN   = "\u001B[36m";
    static final String YELLOW = "\u001B[33m";
    static final String GREEN  = "\u001B[32m";
    static final String RED    = "\u001B[31m";
    static final String BOLD   = "\u001B[1m";

    // ════════════════════════════════════════════════════════
    //  MAIN
    // ════════════════════════════════════════════════════════
    public static void main(String[] args) {
        printBanner();
        loadDemoData();

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("  Enter choice: ");
            System.out.println();

            switch (choice) {
                case 1  -> addStudent();
                case 2  -> mgr.enrollNextStudent();
                case 3  -> mgr.displayQueue();
                case 4  -> mgr.showNextInQueue();
                case 5  -> mgr.displayEnrolled();
                case 6  -> removeStudent();
                case 7  -> updateCgpa();
                case 8  -> searchStudent();
                case 9  -> mgr.undo();
                case 10 -> mgr.displayHistory();
                case 0  -> {
                    System.out.println(GREEN + "\n  Goodbye! Exiting system.\n" + RESET);
                    running = false;
                }
                default -> System.out.println(RED + "  ✘  Invalid option.\n" + RESET);
            }
        }
        sc.close();
    }

    // ════════════════════════════════════════════════════════
    //  MENU ACTIONS
    // ════════════════════════════════════════════════════════
    private static void addStudent() {
        System.out.print("  Student name       : ");
        String name = sc.nextLine().trim();
        System.out.print("  Department         : ");
        String dept = sc.nextLine().trim();
        double cgpa = readDouble("  CGPA (0.0 – 10.0) : ");
        mgr.addStudentToQueue(name, dept, cgpa);
        System.out.println();
    }

    private static void removeStudent() {
        int id = readInt("  Enter Student ID to remove: ");
        mgr.removeStudent(id);
        System.out.println();
    }

    private static void updateCgpa() {
        int    id      = readInt(  "  Enter Student ID  : ");
        double newCgpa = readDouble("  New CGPA          : ");
        mgr.updateCgpa(id, newCgpa);
        System.out.println();
    }

    private static void searchStudent() {
        System.out.print("  Enter name to search: ");
        String keyword = sc.nextLine().trim();
        mgr.searchByName(keyword);
        System.out.println();
    }

    // ════════════════════════════════════════════════════════
    //  DEMO DATA  (pre-loaded on startup)
    // ════════════════════════════════════════════════════════
    private static void loadDemoData() {
        System.out.println(YELLOW + "  Loading demo data…" + RESET);
        mgr.addStudentToQueue("Arjun Sharma",  "Computer Science", 8.5);
        mgr.addStudentToQueue("Priya Nair",    "Electronics",      7.9);
        mgr.addStudentToQueue("Rahul Verma",   "Mechanical",       8.1);
        mgr.addStudentToQueue("Sneha Iyer",    "Computer Science", 9.0);
        mgr.enrollNextStudent();   // enroll Arjun
        mgr.enrollNextStudent();   // enroll Priya
        System.out.println(GREEN + "  Demo data ready!\n" + RESET);
    }

    // ════════════════════════════════════════════════════════
    //  UI HELPERS
    // ════════════════════════════════════════════════════════
    private static void printBanner() {
        System.out.println(CYAN + BOLD);
        System.out.println("  ╔══════════════════════════════════════════════════╗");
        System.out.println("  ║       STUDENT MANAGEMENT SYSTEM  v1.0           ║");
        System.out.println("  ║   Data Structures: Queue (Admission) +          ║");
        System.out.println("  ║                    Stack  (Undo / History)      ║");
        System.out.println("  ╚══════════════════════════════════════════════════╝");
        System.out.println(RESET);
    }

    private static void printMenu() {
        System.out.println(BOLD + CYAN
                + "  ─── MAIN MENU ────────────────────────────────────" + RESET);
        System.out.println(YELLOW + "  [ QUEUE – Admission Processing ]" + RESET);
        System.out.println("   1. Add student to admission queue  (enqueue)");
        System.out.println("   2. Enroll next student             (dequeue)");
        System.out.println("   3. View admission queue");
        System.out.println("   4. Peek – who's next in queue?");
        System.out.println(YELLOW + "  [ RECORDS – Enrolled Students ]" + RESET);
        System.out.println("   5. View all enrolled students");
        System.out.println("   6. Remove a student");
        System.out.println("   7. Update student CGPA");
        System.out.println("   8. Search student by name");
        System.out.println(YELLOW + "  [ STACK – Undo & History ]" + RESET);
        System.out.println("   9. Undo last action                (pop)");
        System.out.println("  10. View action history             (stack view)");
        System.out.println(RED + "   0. Exit" + RESET);
        System.out.println(CYAN
                + "  ────────────────────────────────────────────────────" + RESET);
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println(RED + "  Please enter a valid integer." + RESET);
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println(RED + "  Please enter a valid number." + RESET);
            }
        }
    }
}