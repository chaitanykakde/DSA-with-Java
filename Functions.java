import java.util.Scanner;

 public class Functions{

   public static int sum(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Num 1:");
        int num1=in.nextInt();
        System.out.println("Enter Num 2:");
        int num2=in.nextInt();
        int  num3=num1+num2;
       return num3;
}
    public static void main(String[] args) {
      int v= sum();
      System.out.println(v);
    } 
 }