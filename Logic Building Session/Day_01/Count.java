/* 20. Count the Number of Digits in a Number
Write a Java program that counts the number of digits in a given number.
Test Data:
 Input number: 123456
Expected Output:
The number 123456 has 6 digits. */

import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("Enter any number: ");
        // Create r object for user input
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        
        while(n>0)
        {
          n=n/10;
          count++;
        }
        System.out.println("The number 123456 has: " + count + " digits" );
}
}

/* Output:
Enter any number: 
123456
The number 123456 has: 6 digits */