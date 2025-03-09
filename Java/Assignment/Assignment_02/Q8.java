import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking three boolean inputs
        System.out.print("Enter first boolean value (true/false): ");
        boolean a = sc.nextBoolean();
        
        System.out.print("Enter second boolean value (true/false): ");
        boolean b = sc.nextBoolean();
        
        System.out.print("Enter third boolean value (true/false): ");
        boolean c = sc.nextBoolean();

        sc.close(); // Closing scanner to avoid memory leak

        // Check if at least two out of three values are true
        boolean result = (a && b) || (b && c) || (a && c);

        // Printing the result
        System.out.println("At least two values are true: " + result);
    }
}

