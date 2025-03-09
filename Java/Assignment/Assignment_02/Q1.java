/* Q1: Write a program to swap two numbers without using a third variable and without
using arithmetic operators like + or - .
Hint : Use bitwise XOR ^ operator. */

import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);

        int a = ref.nextInt();
        int b= ref.nextInt();

   System.out.println("Before swapping: a = " + a + ", b = " + b);

     // Swapping using bitwise XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

  System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}

/* PS D:\CDAC\Core_Java_Kiran_Maam\Assignment\Assignment_Answer\Assign_02> javac Q1.java
PS D:\CDAC\Core_Java_Kiran_Maam\Assignment\Assignment_Answer\Assign_02> java Q1
1 2
Before swapping: a = 1, b = 2
After swapping: a = 2, b = 1 */