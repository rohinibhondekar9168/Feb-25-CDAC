/* Write a Java program that checks if a predefined number is negative using an
if-else statement and displays the result. */

import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
            int num;
        System.out.println("Enter any number");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();

        if(num>0)
        {
            System.out.println("Positive Number");

        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}
    
/* Output:
Enter any number
-1
Negative Number */