/* 
12. Reverse a Number
Write a Java program that takes a number as input and prints the reverse of that number.
Test Data:
 Input number: 12345
Expected Output:
The reverse of 12345 is 54321. */

public class Reverse {

        public static void main(String[] args) {
            int number = 12345;  // Predefined number
            int reversedNumber = 0;
            
            while (number != 0) {
                int digit = number % 10;  // Extract last digit
                reversedNumber = reversedNumber * 10 + digit;  // Append digit to reversed number
                number /= 10;  // Remove last digit from number
            }
            
            System.out.println("The reverse of 12345 is: " + reversedNumber);
        }
    }
     
    /* Expected Output:
    The reverse of 12345 is: 54321
 */

