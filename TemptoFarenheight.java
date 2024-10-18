import java.util.Scanner;
public class TemptoFarenheight {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Temp in C:");
        float tempC=sc.nextFloat();
        
        float fahrenheit=(tempC*9/5)+32;
        System.out.println("Tempreture in Celsius:"+tempC);
        System.out.println("Tempreture In Fahrenheit:"+fahrenheit);
        

    }
}
