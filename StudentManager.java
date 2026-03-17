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

  // Displays all students in the list
  public void displayStudents() {
    
    if (students.isEmpty()) {
      System.out.println("No students found.");
      return;
    }

    for (Student student : students) {
      student.displayInfo();
    }
  }

  // Searches for a student by ID
  public Student searchStudent(String studentId) {
    
    for (Student student : students) {
      if (student.getStudentId().equals(studentId)) {
        return student;
      }
    }

    return null;
  }
