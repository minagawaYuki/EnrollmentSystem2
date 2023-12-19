import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        int studentInput;
        int done = 0;
        int size = 0;
        int studentID;
        boolean studentFound = false;
        int infoInput = 1;
        int accessType;

        Student[] student = new Student[25];

        System.out.println("Enrollment System");
        System.out.println("Login menu");
        System.out.println();

        int loginType = 1;

        do {
            try {
                Menu.displayLoginMenu();
                loginType = scanner.nextInt();
            } catch(Exception e) {
                System.out.println("Exiting program...");
                break;
            }
            if (loginType == 1) {
                while (input != 5 || input!= 3) {
                    Menu.display();
                    try {
                        System.out.print("Enter your choice: ");
                        input = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        input = 1;
                        scanner.nextLine();
                        continue;
                    }
                    if(input == 3 || input == 5) {
                        break;
                    }
                    switch (input) {
                        case 1:
                            Menu.displayStudentMenu();
                            studentInput = scanner.nextInt();
                            if (studentInput == 1) {
                                scanner.nextLine();
                                student[size] = new Student();
                                System.out.println("Enter student details");
                                System.out.print("First name: ");
                                student[size].setFirstName(scanner.nextLine());
                                System.out.print("Last name: ");
                                student[size].setLastName(scanner.nextLine());
                                System.out.print("Middle name: ");
                                student[size].setMiddleName(scanner.nextLine());
                                System.out.print("Age: ");
                                student[size].setAge(scanner.nextInt());
                                Menu.displayCourses();
                                System.out.print("Course: ");
                                student[size].setCourse(scanner.nextInt());
                                System.out.print("Student ID: ");
                                student[size].setStudentId(scanner.nextInt());
                                size++;
                            } else if (studentInput == 2) {
                                while (done != 1) {
                                    scanner.nextLine();
                                    student[size] = new Student();
                                    System.out.println("Enter student details");
                                    System.out.print("First name: ");
                                    student[size].setFirstName(scanner.nextLine());
                                    System.out.print("Last name: ");
                                    student[size].setLastName(scanner.nextLine());
                                    System.out.print("Middle name: ");
                                    student[size].setMiddleName(scanner.nextLine());
                                    System.out.print("Age: ");
                                    student[size].setAge(scanner.nextInt());
                                    Menu.displayCourses();
                                    System.out.print("Course: ");
                                    student[size].setCourse(scanner.nextInt());
                                    System.out.print("Student ID: ");
                                    student[size].setStudentId(scanner.nextInt());
                                    System.out.print("Done? ");
                                    done = scanner.nextInt();
                                    size++;
                                }
                            }
                            break;
                        case 2:
                            int viewInput = 0;
                            Menu.displayStudentViewMenu();
                            studentInput = scanner.nextInt();
                            System.out.println("View and modify");
                            System.out.print("View student by: ");
                            if (studentInput == 1) {
                                System.out.println("Id");
                            } else if (studentInput == 2) {
                                System.out.println("Name");
                            } else {
                                System.out.println("Course");
                            }
                            if (studentInput == 1) {
                                System.out.print("Enter ID: ");
                                viewInput = Enroller.findStudentById(student, scanner.nextInt());
                                Student.display(student[viewInput]);
                            } else if (studentInput == 2) {
                                scanner.nextLine();
                                System.out.print("Enter Name: ");
                                Enroller.findStudentByName(student, scanner.nextLine(), size);
                            } else if (studentInput == 3) {
                                scanner.nextLine();
                                System.out.print("Enter Course: ");
                                Enroller.findStudentByCourse(student, scanner.nextLine(), size);
                            }
                            Student.displayStudentOptions();
                            studentInput = scanner.nextInt();
                            switch (studentInput) {
                                case 1:
                                    System.out.println("Modify details");
                                    System.out.println("Modify student ");
                                    System.out.print("Enter Student ID: ");
                                    studentID = scanner.nextInt();
                                    for (int i = 0; i < size; i++) {
                                        if (studentID == student[i].getStudentId()) {
                                            studentID = i;
                                            break;
                                        }
                                    }
                                    while (infoInput != 7) {
                                        Student.displayForm();
                                        System.out.println("7. Exit");
                                        System.out.print("Enter info to change: ");
                                        infoInput = scanner.nextInt();
                                        switch (infoInput) {
                                            case 1:
                                                scanner.nextLine();
                                                System.out.println(("First name: "));
                                                student[studentID].setFirstName(scanner.nextLine());
                                                break;
                                            case 2:
                                                scanner.nextLine();
                                                System.out.println("Last name: ");
                                                student[studentID].setLastName(scanner.nextLine());
                                                break;
                                            case 3:
                                                scanner.nextLine();
                                                System.out.println("Middle name: ");
                                                student[studentID].setMiddleName(scanner.nextLine());
                                                break;
                                            case 4:
                                                System.out.println("Age: ");
                                                student[studentID].setAge(scanner.nextInt());
                                                break;
                                            case 5:
                                                scanner.nextLine();
                                                Menu.displayCourses();
                                                System.out.println("Course: ");
                                                student[studentID].setCourse(scanner.nextInt());
                                                break;
                                            case 6:
                                                System.out.println("Student ID: ");
                                                student[studentID].setStudentId(scanner.nextInt());
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    boolean studentFound1;
                                    System.out.print("Enter Student ID: ");
                                    studentID = scanner.nextInt();
                                    studentFound = Student.remove(student, studentID, size);
                                    if(studentFound) {
                                        System.out.println("Student removed");
                                        size--;
                                    }
                                    else {
                                        System.out.println("Student not found");
                                    }
                            }
                            break;

                        case 3:
                            input = 3;
                            System.out.println("Sign in");
                            break;
                        case 4:
                            for (int i = 0; i < size; i++) {
                                System.out.println("Student " + (i + 1));
                                System.out.println("First name: " + student[i].getFirstName());
                                System.out.println("Last name: " + student[i].getLastName());
                                System.out.println("Middle name: " + student[i].getMiddleName());
                                System.out.println("Age: " + student[i].getAge());
                                System.out.println("Course: " + student[i].getCourse());
                                System.out.println("Student ID: " + student[i].getStudentId());
                                System.out.println();
                            }
                            break;
                        case 5:
                            continue;

                    }
                }
            }
            else {
                Menu.displayApproverMenu();
                scanner.nextLine();
                studentID = scanner.nextInt();
                for (int i = 0; i < size; i++) {
                    if (studentID == student[i].getStudentId()) {
                        studentID = i;
                        break;
                    }
                }
                if(studentID > size - 1) {
                    System.out.println("Student not found");
                    continue;
                }
                scanner.nextLine();
                Menu.displayCourses();
                System.out.println("Course: ");
                student[studentID].setCourse(scanner.nextInt());
                scanner.nextLine();
            }
        }while(loginType == 1 || loginType == 2);
    }

}