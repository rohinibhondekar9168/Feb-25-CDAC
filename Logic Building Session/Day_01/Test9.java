/* 13. Calculate the Average of Three Numbers
Write a Java program to calculate the average of three numbers.
Test Data:
 Input first number: 20
 Input second number: 40
 Input third number: 60
Expected Output:
The average is: 40.0 */

import java.util.Scanner;
class Test9
{
public static void main(String[]args)
{
int a,b,c,sum;
double avg;
System.out.println("Enter three number:");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();
c=obj.nextInt();

sum=a+b+c;
System.out.println("The sum of three number is:"+sum);

avg=sum/3;
System.out.println("The average of three number is: "+avg);

}
}

Output:
PS C:\Users\Rohini\OneDrive\Desktop\Java> javac Test9.java
PS C:\Users\Rohini\OneDrive\Desktop\Java> java Test9
Enter three number:
20
40
60
The sum of three number is:120
The average of three number is: 40.0