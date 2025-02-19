/* 19. Calculate the Power of a Number
Write a Java program that calculates the power of a number. Take two numbers as input: the base and the exponent, and compute the result of base raised to the power of exponent.
Test Data:
 Input base number: 3
 Input exponent number: 4
Expected Output:
3 raised to the power 4 is 81
 */

 import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        int n,p,result=1;
        System.out.println("Enter base number: "); //3
        // Create r object for user input
        Scanner r = new Scanner(System.in);
        n=r.nextInt(); //3
        System.out.println("Enter power: ");
        p=r.nextInt();//4

        for(int i=1; i<=p; i++)
        {
            result=n*result;
        }
        System.out.println("3 raised to the power 4 is "+result);//81
        
    }
}

/* Output:

Enter base number: 
3
Enter power: 
4
3 raised to the power 4 is 81 */
