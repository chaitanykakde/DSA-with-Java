import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter You Data Number:");    
        int n=sc.nextInt();
        int orignal=n;
       
        int sum=0;
        while(n>0){
          int  rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println("Orignal Number:"+orignal);
        
        System.out.println("Reverse Number:"+sum);
        if(sum==orignal){
            System.out.println("Number is palindrome...");
        }else{
            System.out.println("Number is not a palindrome Number...");

        }
       
      
      }
     
}

