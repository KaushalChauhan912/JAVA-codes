import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        //Scanner is a class in java which is used to take input from the user
        //here we have taken the input from the user 
        //examplre of taking string input
        Scanner sc = new Scanner(System.in);
        System.out.print("Name :");//here I use print instesd of println because println move input field to the next line but with print it remains in the same line
        //nextLine() is a method used to take string input
        String name = sc.nextLine().trim();//trim() method is esed to remove the unwanted space from the input
        System.out.println("Thats a good name you have i.e. " + name);



        //examplre of taking integer input
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Age :");
        //nextInt() is a method used to take string input
        int age = sc1.nextInt();
        System.out.println("you are " + age + " years old");

        //similarly we can take input in various datatypes
        //e.g.
        // for byte -> nextByte()
        // for short -> nextShort()
        // for long -> nextLong()
        // for float -> nextFloat()
        // for double -> nextDouble()
        // for boolean -> nextBoolean()
        

    }
}
