/* 11. Find the Largest of Three Numbers
Write a Java program that takes three numbers as input and finds the largest of the three.
Test Data:
 Input first number: 12
 Input second number: 45
 Input third number: 22
Expected Output:
The largest number is 45. */

import java.util.Scanner;
class Test7
{
public static void main(String[]args)
{
int a,b,c;
System.out.println("Enter any number:");
Scanner r=new Scanner(System.in);
a=r.nextInt(); //12
b=r.nextInt(); //45
c=r.nextInt(); //22

if(a>b && a>c)
{
System.out.println(a+ " is Largest Number");
}
else if(b>a && b>c)
{
System.out.println(b + "is largest number");
}
else
{
System.out.println(c+ "is largest number");
}

}
}

Output:
PS C:\Users\Rohini\OneDrive\Desktop\Java>  javac Test7.java
PS C:\Users\Rohini\OneDrive\Desktop\Java> java Test7
Enter any number:
12
45
22
45is largest number