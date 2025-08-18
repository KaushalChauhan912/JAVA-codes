import java.text.NumberFormat;

public class Fornatting_Number {

    public static void main(String[] args) {
        // NumberFormat is a class in java use to format the numbers onto the different
        // formats like currency ,percentage ,etc
        // for currency getCurrencyInstance class is used to convert any number into
        // currency format
        NumberFormat curency = NumberFormat.getCurrencyInstance();
        // it always return the value in the String datatype
        String result = curency.format(45646456.45646);
        System.out.println("The price is " + result);
        //Another method
        //This is also a short method
        String result1 = NumberFormat.getCurrencyInstance().format(45646456.45646);
        System.out.println("The price is " + result1);//same method can be used for other types of NumberFormat

        // for currency getPercentInstance class is used to convert any number into
        // percentage format
        NumberFormat percentage = NumberFormat.getPercentInstance();
        // it always return the value in the String datatype
        String result2 = percentage.format(0.45);
        System.out.println("The percentage is " + result2);
    }
}
