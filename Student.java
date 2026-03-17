// Student class extends the Person class
public class Student extends Person {

    // Variables that store student-specific information
    private String studentId;
    private String course;

    // Constructor for creating a Student object
    public Student(String name, String email, String studentId, String course) {

        // Call the constructor from the Person class
        super(name, email);

        // Set the student ID and course
        this.studentId = studentId;
        this.course = course;
    }

    // Returns the student's ID
    public String getStudentId() {
        return studentId;
    }

    // Returns the student's course
    public String getCourse() {
        return course;
    }

    // Displays the student's information
    @Override
    public void displayInfo() {

        System.out.println("Student Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("--------------------------");
    }
}