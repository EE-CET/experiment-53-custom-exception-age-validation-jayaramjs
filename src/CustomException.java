import java.util.Scanner;

// Step 1: Create the custom exception class
// It must extend 'Exception' to be a checked exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        // Pass the message to the parent Exception constructor
        super(message);
    }
}

public class CustomException {
    
    // Step 2: Use the 'throws' keyword in the method signature
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            // Step 3: Use 'throw' to trigger the exception
            throw new InvalidAgeException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Read input
            if (sc.hasNextInt()) {
                int age = sc.nextInt();
                
                // Call the method that might throw the exception
                validate(age);
            }
        } catch (InvalidAgeException e) {
            // Step 4: Catch the specific exception and print required format
            // e.getMessage() returns the "Not eligible to vote" string
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
