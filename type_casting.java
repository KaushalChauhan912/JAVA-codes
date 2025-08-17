public class type_casting {
    public static void main(String[] args) {
        //Implicit casting 
        //byte -> short -> int -> long -> float -> double 
        short x =3;
        int a = x+4;
        System.out.println(a);

        //Explicit casting 
        double b = 4.4;
        int c = (int)b + 4;
        System.out.println("answer will be in integer form i.e.  " + c); 
        //these castings can be done only in compatable datatypes like mentioned above


        //if we want to convert string to integer or types similer to integer
        //so we do 

        String s ="121";
        int d = Integer.parseInt(s) + 76;
        System.out.println("After converting to integer the answer is : " + d);
        //Similar methods that are used are as follows 
        // Float.parseFloat()
        // Short.parseShort()
        // Byte.parseByte()
        // Long.parseLong()
        // Double.parseDouble()
        

    }    
}
