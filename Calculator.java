import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You Data Number:");    
        int n = sc.nextInt();  // It's unclear how you want to use `n`, consider removing if not needed

        while (true) {
            // Input operator
            char op = sc.next().trim().charAt(0);
            
            // Check for valid operators
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                
                int ans = 0;  // Initialize answer
                
                // Perform operations
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;  // Skip the current iteration
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println("The result is: " + ans);
            } 
            // Exit condition
            else if (op == 'x' || op == 'X') {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid operator.");
            }
        }

        sc.close();  // Close the Scanner
    }
}
