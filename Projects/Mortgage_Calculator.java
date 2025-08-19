
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
        final byte months_in_year = 12;
        final byte percent = 100;
        // Mortgage Calculator
        // Principal input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount (loan amount): ");
        int principal = sc.nextInt();

        // interest input
        System.out.print("Enter the annual interest rate : ");
        float Interest_annually = sc.nextFloat();
        float Interest_monthly = Interest_annually / (months_in_year * percent);


        // no. of payments input
        System.out.print("Enter time period (in years) : ");
        byte years = sc.nextByte();
        int total_number_of_paymemts  = years*months_in_year;

        // formula -> P(r(r+1)^n)/((r+1)^n - 1)
        // for (r+1)^n
     
        double Mortgage = principal*(Interest_monthly*Math.pow(Interest_monthly + 1, total_number_of_paymemts))/(Math.pow(Interest_monthly + 1, total_number_of_paymemts)-1);

        NumberFormat curency = NumberFormat.getCurrencyInstance();
        String amount = curency.format(Mortgage);
        System.out.println("Your annual Mortgage will be : " + amount);

    }

}
