import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Roll Number:");
        int rollno=sc.nextInt();
        System.out.println("Enter Your Name");
        String name=sc.next();
        System.out.println("Enter Your Percentage:");
        float percentage=sc.nextFloat();
        System.out.println("Enter Your Bio:");
        String bio=sc.nextLine();
        System.out.println("*********************************************");
        System.out.println("Your Name:"+name);
        System.out.println("Your Roll Number:"+rollno);
        System.out.println("Your Diploma Percentage:"+percentage);
        System.out.println("Bio:"+bio);
    }
    
}ll
