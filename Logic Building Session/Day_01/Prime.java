/* 16. Check Whether a Number Is Prime
Write a Java program to check whether a number is prime or not.
Test Data:
 Input number: 17
Expected Output:
The number 17 is Prime. */

import java.util.Scanner;
class Prime{
    public static void main(String[]args)
    {
        int n,count=0;
        System.out.println("Enter any number : ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1; i<=n;i++)
        {

            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
         System.out.println("Prime Number");
         else
         System.out.println("Not prime number");
    }
}
/* 
Output: 
Enter any number : 
17
Prime Number */
