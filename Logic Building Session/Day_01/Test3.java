/*5. Multiply Two Numbers
Write a Java program that takes two numbers as input and displays the product of the two numbers.
Test Data:
 Input first number: 25
 Input second number: 5
Expected Output:
25 x 5 = 125 */

import java.util.Scanner;
class Test3{
public static void main(String[]args)
{
int a,b,product;
System.out.println("Enter two numbers:");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();

product=a*b;


System.out.println("The product of two number is: " +product);
}
}

Output:
Enter two numbers:
25
5
The product of two number is: 125