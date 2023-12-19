import javax.swing.text.html.parser.TagElement;

public class Student {
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String course;
    private int studentId;
    private boolean isDeleted;

    public Student() {}

    public Student(String firstName, String lastName, String middleName, int age, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCourse(int course) {
        switch (course) {
            case 1:
                this.course = "Civil Engineering";
                break;
            case 2:
                this.course = "Computer Engineering";
                break;
            case 3:
                this.course = "Computer Science";
                break;
            case 4:
                this.course = "Information Technology";
                break;
            case 5:
                this.course = "Multimedia";
                break;
        }
    }

    public String getCourse() {
        return course;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public static void displayForm() {
        System.out.println("1. First name");
        System.out.println("2. Last name");
        System.out.println("3. Middle name");
        System.out.println("4. Age");
        System.out.println("5. Course");
        System.out.println("6. Student ID");
    }
    public static void display(Student student) {
        System.out.println("---------------------------------------");
        System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Course: " + student.getCourse());
        System.out.println("---------------------------------------");
    }
    public static void displayStudentOptions() {
        System.out.println("[1] Modify details");
        System.out.println("[2] Delete Student");
        System.out.println("[3] Graduate Student");
        System.out.println("[4] Dismiss Student");
        System.out.println("[5] Exit");
    }
    public static boolean remove(Student[] student, int studentId, int size) {
        boolean studentFound = false;
        for(int i = 0; i < size; i++) {
            if(studentId == student[i].getStudentId()) {
                studentFound = true;
                student[i].setIsDeleted(true);
                for(int j = i; j < size - 1; j++) {
                    student[i] = student[i + 1];
                }
            }
        }
        return studentFound;

    }

}