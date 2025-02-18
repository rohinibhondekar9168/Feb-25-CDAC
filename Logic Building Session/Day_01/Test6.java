/*8. Swap Two Numbers
Write a Java program to swap the values of two variables without using a third variable.
Test Data:
 Input first number: 10
 Input second number: 20
Expected Output:
Before swapping:
First number: 10
Second number: 20
After swapping:
First number: 20
Second number: 10  */ 


import java.util.Scanner;
class Test6{
public static void main(String[]args)
{
int a,b; // a=10 b=20
System.out.println("Enter the two number:");
Scanner ref=new Scanner(System.in);
a=ref.nextInt();//10
b=ref.nextInt();//20
System.out.println("Before swapping :" +a+" "+b); //10  20
a=a+b; // a=30
b=a-b; //b=30-20=10
a=a-b; //a=30-10=20

System.out.println("After swapping :" +a+" "+b); //20  10

}
}

Output:                                         
PS C:\Users\Rohini\OneDrive\Desktop\Java> java Test6
Enter the two number:
10
20
Before swapping :10 20
After swapping :20 10