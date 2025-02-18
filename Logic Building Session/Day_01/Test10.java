/*14. Print the Fibonacci Series
Write a Java program to print the Fibonacci series up to the 10th number.
Expected Output:
0 1 1 2 3 5 8 13 21 34 */

import java.util.Scanner;
class Test10
{
public static void main(String[]args)
{
int term,a=0,b=1,c;
System.out.println("Enter term ");
Scanner obj=new Scanner(System.in);
term=obj.nextInt(); //10

for(int i=1; i<=term; i++)//i=1,2
{
System.out.println(a);//0 1
c=a+b;//1 2
a=b;//1 
b=c;//1 
}


}
}
