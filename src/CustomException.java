import java.util.Scanner;

// Step 1: Create the custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        // Pass the error message to the parent Exception class
        super(message);
    }
}

public class CustomExceptionDemo {
    
    // Step 2: Create a method that throws the custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Manually trigger the exception
            throw new InvalidAgeException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Read age from input
            int age = sc.nextInt();
            
            // Call the validation logic
            validateAge(age);
            
        } catch (InvalidAgeException e) {
            // Step 3: Handle the custom exception as per the requirement
            // getMessage() retrieves the string we passed to super()
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
