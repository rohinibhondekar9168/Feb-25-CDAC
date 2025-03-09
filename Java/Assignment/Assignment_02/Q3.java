/* Q3: Implement a program that calculates the sum of digits of an integer using modulus
( % ) and division ( / ) operators .
 */
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        int sum = 0;  // Variable to store the sum
        
        // Loop to extract and sum the digits
        while (num != 0) { //(1234!=0)
            sum += num % 10; // sum=sum+num%10 // Get the last digit and add to sum
            num = num / 10;   // Remove the last digit
        }
        
        System.out.println("Sum of digits: " + sum);
        
   
    }
}

/* Enter an integer: 1234

1234 % 10 = 4  → sum = 4, num = 123
123 % 10 = 3   → sum = 4 + 3 = 7, num = 12
12 % 10 = 2    → sum = 7 + 2 = 9, num = 1
1 % 10 = 1     → sum = 9 + 1 = 10, num = 0

Sum of digits: 10 */