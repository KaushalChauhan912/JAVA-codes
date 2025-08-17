public class math_class_operations {
    public static void main(String[] args) {
        // round method converts
        // float to int and
        // double to float
        int result = Math.round(4.3f);
        System.out.println("round of result is : " + result);

        // floor
        // floor gives the largest number which is smaller or equal to the input
        int result1 = (int) Math.floor(34.34f);
        System.out.println("floor of result1 is : " + result1);

        // ciel
        // ciel gives the smallest number which is greater than or equal to the input
        int result2 = (int) Math.ceil(76.65f);
        System.out.println("ciel of result2 is : " + result2);

        // max
        // max method gives us the maximum of the given inputs
        int maximum = Math.max(45, 76);
        System.out.println("Maximum is " + maximum);

        // min
        // min method gives us the minimum of the given inputs
        int minimum = Math.min(45, 76);
        System.out.println("Minimum is " + minimum);

        // random
        // random method gives the random no. between 0 and 1
        // it only returns the value in double
        double random1 = Math.random();
        System.out.println("Random number between 0 and 1 is : " + random1);

        // random number between 0 and 100
        // we simply multiply the number by 100
        double random2 = Math.random() * 100;
        System.out.println("Random number between 0 and 100 is : " + random2);

        // random no without decimal values
        double random3 = Math.round(Math.random() * 100);
        System.out.println("Random number between 0 and 100 is : " + random3);

        // it still give the value with zero in decimal
        // to remove it
        // we have to convert the value to integer
        // But it doesn't support implicit conversion
        // so wed perform explicit conversion
        int random4 = (int) Math.round(Math.random() * 100);
        System.out.println("Random number between 0 and 100 is : " + random4);

        // without round method
        int random5 = (int) ((Math.random() * 100));
        System.out.println("Random number between 0 and 100 without round method is : " + random5);
    }
}
