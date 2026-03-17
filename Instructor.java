// Instructor class also extends the Person class
public class Instructor extends Person {

    // Variable to store the instructor's department
    private String department;

    // Constructor for creating an Instructor object
    public Instructor(String name, String email, String department) {

        // Call the Person constructor to set name and email
        super(name, email);

        // Set the department
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Displays instructor information
    @Override
    public void displayInfo() {

        System.out.println("Instructor Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Department: " + department);
        System.out.println("--------------------------");
    }
}