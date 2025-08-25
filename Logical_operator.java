public class Logical_operator {
    public static void main(String[] args) {
        // Logical AND (&&) operator
        // Returns true if both statements are true
        int temperature = 25;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println("Is it warm? " + isWarm);

        // Another example for AND operator
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligibleForLoan = hasHighIncome && hasGoodCredit;
        System.out.println("Is eligible for loan? " + isEligibleForLoan);

        // Logical OR (||) operator
        // Returns true if at least one of the statements is true
        boolean hasHighIncome2 = false;
        boolean hasGoodCredit2 = true;
        boolean isEligibleForLoan2 = hasHighIncome2 || hasGoodCredit2;
        System.out.println("Is eligible for loan? " + isEligibleForLoan2);

        // Logical NOT (!) operator
        // Reverses the boolean value of a condition
        boolean isStudent = false;
        System.out.println("Is not a student? " + !isStudent);
    }
}
