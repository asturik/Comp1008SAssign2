// Person is the parent class for Student and Instructor
public abstract class Person {

    // Basic information that every person has
    private String name;
    private String email;

    // Constructor to set name and email
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Returns the person's name
    public String getName() {
        return name;
    }

    // Returns the person's email
    public String getEmail() {
        return email;
    }

    // Abstract method that child classes must implement
    public abstract void displayInfo();
}