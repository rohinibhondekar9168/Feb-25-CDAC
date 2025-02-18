/*6. Basic Arithmetic Operations
Write a Java program to print the sum, multiplication, subtraction, division, and remainder of two numbers.
Test Data:
 Input first number: 125
 Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */



import java.util.Scanner;
class Test4{
public static void main(String[]args)
{
int a,b;
System.out.println("Enter two numbers:");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();


System.out.println("Sum : "+(a+b));
System.out.println("Multiplication : "+(a*b));
System.out.println("Subtraction: "+(a-b));
System.out.println("Division : "+(a/b));
System.out.println("Remainder of two no : "+(a%b));

}
}

Output: 
Enter two numbers:
125
24
Sum : 149
Multiplication : 3000
Subtraction: 101
Division : 5
Remainder of two no : 5