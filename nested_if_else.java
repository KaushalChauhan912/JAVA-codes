public class nested_if_else {

    public static void main(String[] args) {
        // Defining two integer variables for demonstration
        int age = 25;
        int weight = 70;

        // Outer if statement to check the age
        // This is the first condition
        if (age >= 18) {
            // If age is 18 or greater, this block gets executed
            System.out.println("You are an adult.");

            // Nested if-else structure to check the weight
            // This is the second condition
            if (weight > 50) {
                // If weight is greater than 50, this block gets executed
                System.out.println("You are eligible to donate blood.");

                // This is the third condition
                if (weight >= 70) {
                    // If weight is 70 or greater, this block gets executed
                    System.out.println("You are in a healthy weight range.");
                } else {
                    // If weight is less than 70, this block gets executed
                    System.out.println("You are slightly underweight but still eligible.");
                }
            } else {
                // If weight is 50 or less, this block gets executed
                System.out.println("You are not eligible to donate blood due to low weight.");
            }
        } 
        // This is the fourth condition
        else {
            // If age is less than 18, this block gets executed
            System.out.println("You are a minor and not eligible for certain activities.");
        }
    }
}