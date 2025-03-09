/* Q2: Write a program to check whether a given number is even or odd using only bitwise
operators .
Hint : Use n & 1 to check. */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Checking even or odd using bitwise AND
        if ((n & 1) == 0) { // 6 & 1 = 110 & 001 = 000 → Even 
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd"); //7 & 1 = 111 & 001 = 001 → Odd 
        }
        
        sc.close();
    }
}

/* Output:
PS D:\CDAC\Core_Java_Kiran_Maam\Assignment\Assignment_Answer\Assign_02> javac Q2.java                              
PS D:\CDAC\Core_Java_Kiran_Maam\Assignment\Assignment_Answer\Assign_02> java Q2
Enter a number: 6
6 is Even */