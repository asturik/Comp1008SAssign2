import java.util.ArrayList;

// This class manages the list of students
public class StudentManager {

  // ArrayList to store all student objects
  private ArrayList<Student> students = new ArrayList<>();

  // Adds a student to the list
  public void addStudent(Student student) {
    students.add(student);
    System.out.println("Student added successfully.");
  }
