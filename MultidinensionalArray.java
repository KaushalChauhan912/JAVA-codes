import java.util.Arrays;

public class MultidinensionalArray {
    public static void main(String[] args) {
        //two dimensional array
        int[][] numbers = new int[3][3];
        numbers[0][0] = 34;
        numbers[0][1] = 43;
        numbers[0][2] = 34;
        numbers[1][0] = 65;
        numbers[1][1] = 84;
        numbers[1][2] = 56;
        numbers[2][0] = 94;
        numbers[2][1] = 41;
        numbers[2][2] = 50;
        //printing two dinensional array
        //deepToString is used to print multidimentional array
        System.out.println(Arrays.deepToString(numbers));

        //another method
        int[][] numb = {{45,67,45,87,98},{54,67,56,45,67}};
        System.out.println(Arrays.deepToString(numb));
        //similarly we can create 3D array
    }
}
