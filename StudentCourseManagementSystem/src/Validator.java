import java.util.regex.Pattern;

// This class checks if certain inputs are valid
public class Validator {

    // Checks if the email format is valid
    public static boolean validateEmail(String email) {

        // Basic email pattern
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        return Pattern.matches(regex, email);
    }

    // Checks if the student ID follows the format S-1234
    public static boolean validateStudentId(String studentId) {

        String regex = "S-\\d{4}";

        return Pattern.matches(regex, studentId);
    }
}