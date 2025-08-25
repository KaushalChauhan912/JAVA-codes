public class if_else {

    public static void main(String[] args) {
        // Here, we declare an integer variable named 'number' and initialize it with the value 10.
        // This variable will be used in our conditional check.
        int number = 10;

        // This is the start of the if-else statement.
        // The condition `number > 0` checks if the value of the 'number' variable is greater than 0.
        if (number > 0) {
            // This block of code is executed if the condition in the 'if' statement is true.
            // In this case, since 10 is greater than 0, this line will be executed.
            System.out.println("The number is positive.");
        } else {
            // This block of code is executed if the condition in the 'if' statement is false.
            // For example, if the 'number' was -5, this line would be executed.
            System.out.println("The number is not positive.");
        }
    }
}