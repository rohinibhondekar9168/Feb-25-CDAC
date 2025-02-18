//Write a Java program that checks if a predefined number is positive using an
//if-else statement and prints the appropriate message.

import java.util.Scanner;
class Positive{
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
34
Positive Number */

