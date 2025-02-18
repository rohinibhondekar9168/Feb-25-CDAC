/*10. Check If a Number Is Even or Odd
Write a Java program that checks if a number is even or odd.
Test Data:
 Input a number: 15
Expected Output:
The number 15 is Odd. */

import java.util.Scanner;
class EvenOdd
{
public static void main(String[]args)
{
int num;
System.out.println("Enter any number:");
Scanner r=new Scanner(System.in);
num=r.nextInt();
if(num%2==0)
{
System.out.println("Even number");
}
System.out.println("The number 15 is Odd");

}
}

Output:

PS C:\Users\Rohini\OneDrive\Desktop\Java> java EvenOdd
Enter any number:
15
The number 15 is Odd
PS C:\Users\Rohini\OneDrive\Desktop\Java>