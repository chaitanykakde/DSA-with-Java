import java.util.Scanner;
public class DigitOccurance{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter You Data Number:");    
        int n=sc.nextInt();
        System.out.println("Enter Number to find occurences:");    
        int checknum=sc.nextInt();
        int rem=0;
        int occurences=0;
        while(n!=0){
            rem=n%10;
            if(rem==checknum){occurences++;}
            n=n/10;
        }
        System.out.println(checknum+" is Repeated for "+occurences+" times.");
      
      
      }
     
}

