import java.util.Scanner;

public class Primitives {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);  
        int rollno=64;
        System.out.println(rollno);
        //string is not primitive
        String name="Chaitany";
        System.out.println(name);
        //to stjjoring characters
        char letter='A';
        System.out.println(letter);
        //for storing floating or decimal numbers
        float marks=98.67f;
        System.out.println(marks);
        //to storing large decimal m=numbers
        double large_decimal_numbers=475959448737.784;
        System.out.println(large_decimal_numbers);
        //to storing large integer numbers
        long large_integer=384994484849l;
        System.out.println(large_integer);
        System.out.println("Enter Roll NO:");
        int rno=in.nextInt();
        System.out.println("After taking an input:"+rno);
        //write in milion
        


 
    }
    
}
