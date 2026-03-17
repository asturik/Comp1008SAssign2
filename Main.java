import java.util.Scanner;

// This is the main class that runs the program
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice = 0;

        // Keep showing the menu until the user chooses 5
        while (choice != 5) {

            System.out.println("\n===== Student Course Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(input.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("Enter student name: ");
                        String name = input.nextLine();

                        System.out.print("Enter email: ");
                        String email = input.nextLine();

                        if (!Validator.validateEmail(email)) {
                            System.out.println("Invalid email format.");
                            break;
                        }

                        System.out.print("Enter student ID (S-1234): ");
                        String studentId = input.nextLine();

                        if (!Validator.validateStudentId(studentId)) {
                            System.out.println("Invalid student ID format.");
                            break;
                        }

                        System.out.print("Enter course: ");
                        String course = input.nextLine();

                        Student student = new Student(name, email, studentId, course);
                        manager.addStudent(student);
                        break;

                    case 2:
                        manager.displayStudents();
                        break;

                    case 3:
                        System.out.print("Enter student ID to search: ");
                        String searchId = input.nextLine();

                        Student foundStudent = manager.searchStudent(searchId);

                        if (foundStudent != null) {
                            foundStudent.displayInfo();
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter student ID to remove: ");
                        String removeId = input.nextLine();
                        manager.removeStudent(removeId);
                        break;

                    case 5:
                        System.out.println("Program closed.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter 1 to 5.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        input.close();
    }
}