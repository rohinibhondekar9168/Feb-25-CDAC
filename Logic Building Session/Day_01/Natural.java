/* 17. Print the First N Natural Numbers
Write a Java program to print the first N natural numbers, where N is provided by the user.
Test Data:
 Input a number: 6
Expected Output:
1 2 3 4 5 6 */

import java.util.Scanner;
public class Natural {
    public static void main(String[]args)
    {
        int n;
        System.out.println("Enter any number:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1; i<=n; i++)
        {
        
            System.out.println(i+ " ");
        }


    }
    
}

/* Output:

Enter any number:
6
1 
2
3
4
5
6 */
