/*7. Multiplication Table
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
 Input a number: 8
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80  */



import java.util.Scanner;
class Test5{
public static void main(String[]args)
{
int num;
System.out.println("Enter the number:");
Scanner r=new Scanner(System.in);
num=r.nextInt();

for(int i=1; i<=10; i++)
{
System.out.println(num+"*"+i+"="+num*i);
}

}
}

