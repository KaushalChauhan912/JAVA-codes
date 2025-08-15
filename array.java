import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //arrays are used to store list of items like numbers or strings or characters....
        //method 1 to initialise the array
        int[] numbers = new int[5];
        numbers[0] = 34;
        numbers[1] = 43;
        numbers[2] = 34;
        numbers[3] = 65;
        numbers[4] = 56; 
        //"Arrays" is a default class on Java for arrays
        //and "tostring" is a method inside the Arrays
        System.out.println(Arrays.toString(numbers));


        //method 2 to initialise the array
        int[] numb = {23,45,56,76,65};
        //printing the length of the array
        System.out.println("\nlength of array is " +numb.length);
        //sorting arrys using sort method 
        Arrays.sort(numb);
        System.out.println("\n"+"sorted array is "+Arrays.toString(numb));

    }
}

