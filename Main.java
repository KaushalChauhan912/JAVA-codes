import java.util.Date;

public class Main {
    public static void main(String[] args) {

//PRIMITIVE DATATYPES


        byte age = 25;
        //byte can hold values from -128 to 127
        short year = 2023;
        //short can hold values from -32k to 32k
        int population = 780000000;//int can hold values from -2 billion to 2 billion
        //In JAVA int can hold a value containing 8 digits
        long distanceToMoon = 384400000L;
        //long should be suffixed with 'L' to indicate it's a long literal
        float pi = 3.14f;
        //float should be suffixed with 'f' to indicate it's a float literal
        double e = 2.718281828459045;
        //double can hold more precision than float, no suffix needed
        char initial = 'A';
        //char can hold a single character
        boolean isJavaFun = true;
        //boolean can hold true or false
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Distance to Moon: " + distanceToMoon + " meters");
        System.out.println("Value of Pi: " + pi);
        System.out.println("Value of e: " + e);
        System.out.println("Initial: " + initial);
        System.out.println("Is Java fun? " + isJavaFun);
   

//NON-PRIMITIVE  or  REFERENCES DATATYPES


        Date now = new Date();
        System.out.println("\n\n\n"+now);
        //it is just an example
        //there are many of this kind

    }
}
