import java.util.Scanner;
public class Loops {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;
       if(a==10){
        System.out.println("A is 10");
       }
       int count=1;
       
       while(count<=10){
        System.out.println(count);
        count++;
       }
       for(int i=1;i<=10;i++){
        System.out.println("For loop loppin:"+i);
       }
        
    } 
    
}
