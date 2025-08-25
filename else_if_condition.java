// Import the Scanner class from the java.util package to allow user input.
import java.util.Scanner;

// The public class that holds our main method.
public class else_if_condition {
    
    // The main method, where the execution of the program begins.
    public static void main(String[] args) {
        
        // Create a new Scanner object to read input from the standard input stream (the console).
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter their age.
        System.out.print("Enter your age: ");
        
        // Read the integer value entered by the user and store it in the 'age' variable.
        int age = sc.nextInt();
        
        // The 'if-else if-else' ladder checks conditions sequentially.
        // Once a condition is true, its code block is executed, and the rest of the ladder is skipped.
        
        // Condition 1: Checks if the age is greater than 0 AND less than or equal to 15.
        if ((age > 0) && (age <= 15)) {
            System.out.println("You are a child.");
        
        // Condition 2: If the first condition was false, this checks if age is between 16 and 18.
        } else if ((age > 15) && (age <= 18)) {
            System.out.println("You are a teenager.");
            
        // Condition 3: If the previous conditions were false, this checks if age is between 19 and 35.
        } else if ((age > 18) && (age <= 35)) {
            System.out.println("You are an adult.");
            
        // Condition 4: If the previous conditions were false, this checks if age is between 36 and 60.
        } else if ((age > 35) && (age <= 60)) {
            System.out.println("You are a responsible citizen.");
            
        // Condition 5: If the previous conditions were false, this checks if age is greater than 60.
        } else if (age > 60) {
            // Corrected "seniar" to "senior" and added the missing semicolon.
            System.out.println("You are a senior citizen.");
        
        // Final 'else' block: If none of the above conditions are met (e.g., age is 0 or negative).
        } else {
            System.out.println("Wrong input. Age cannot be zero or negative.");
        }
        
        // Close the scanner to prevent resource leaks.
        sc.close();
    }
}
