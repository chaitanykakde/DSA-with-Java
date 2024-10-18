import java.util.Scanner;
public class FibbonacchiSeries {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int a=0;
       int b=1;
       int temp=0;
       for(int i=2;i<=n;i++){
        temp=b;
         b=a+b;
        a=temp;
        System.out.println(b); 
      
      }
     
}
}
