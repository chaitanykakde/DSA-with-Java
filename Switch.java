import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
        String fruit=in.next();
        switch (fruit) {
            case "Apple" -> System.out.println("Sweet...");
            case "Mango" -> System.out.println("King of fruits...");
            case "Grapes" -> System.out.println("Much more Sweet...");
            case "Orange" -> System.out.println("Round Friut");    
            default -> System.out.println("Please Enter a valid choice...");        
           
        }    
    
    }
    
}
