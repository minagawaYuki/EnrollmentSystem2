public class Enroller {
    public static int findStudentById(Student[] student, int studentId) {

        for (int i = 0; i < student.length; i++) {
            if (student[i].getStudentId() == studentId) {
                return i;
            }
        }
        return -1;
    }

    public static void findStudentByName(Student[] student, String lastName, int size) {

        for (int i = 0; i < size; i++) {
            if (student[i].getLastName().equals(lastName)) {
                System.out.println("---------------------------------------");
                System.out.println("Name: " + student[i].getFirstName() + student[i].getLastName());
                System.out.println("Age: " + student[i].getAge());
                System.out.println("Course: " + student[i].getCourse());
                System.out.println("---------------------------------------");
            }
        }
    }
    public static void findStudentByCourse(Student[] student, String course, int size) {
        boolean studentFound = false;

        for (int i = 0; i < size; i++) {
            if (student[i].getCourse().equals(course)) {
                System.out.println("---------------------------------------");
                System.out.println("Name: " + student[i].getFirstName() + student[i].getLastName());
                System.out.println("Age: " + student[i].getAge());
                System.out.println("Course: " + student[i].getCourse());
                System.out.println("---------------------------------------");
            }
        }
    }
}
