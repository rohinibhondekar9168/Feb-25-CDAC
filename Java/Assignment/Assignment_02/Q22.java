import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
       

        switch (op) {
            case '+': System.out.println("Result: " + (a + b));
             break;
            case '-': System.out.println("Result: " + (a - b)); 
            break;
            case '*': System.out.println("Result: " + (a * b)); 
            break;
            case '/': System.out.println((b != 0) ? "Result: " + (a / b) : "Cannot divide by zero"); 
            break;
            default: System.out.println("Invalid operator");
        }
    }
}

/* Enter first number: 4 - 6
Enter operator (+, -, *, /): Enter second number: Result: -2 */