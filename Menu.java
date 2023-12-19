public class Menu {
    public static void display() {
        System.out.println("1. Add student");
        System.out.println("2. View student");
        System.out.println("3. Log out Enroller");
        System.out.println("4. Print all enrolled students");
        System.out.println("5. Exit");
    }
    public static void displayCourses() {
        System.out.println("1. Civil Engineering");
        System.out.println("2. Computer Engineering");
        System.out.println("3. Computer Science");
        System.out.println("4. Information Technology");
        System.out.println("5. Multimedia");
    }
    public static void displayStudentMenu() {
        System.out.println("Student menu");
        System.out.println("[1] Add a student");
        System.out.println("[2] Add batch of students");
        System.out.println("[3] Exit to main menu");
    }
    public static void displayStudentViewMenu() {
        System.out.println("View Menu");
        System.out.println("[1] Id");
        System.out.println("[2] Name");
        System.out.println("[3] Course");
    }
    public static void displayLoginMenu() {
        System.out.println("Log in");
        System.out.println("[1] Enroller");
        System.out.println("[2] Approver");
        System.out.print(">");
    }
    public static void displayApproverMenu() {
        System.out.println("Approver Menu");
        System.out.println("[1] Student Course Change");
        System.out.print("Student ID: ");
    }
}