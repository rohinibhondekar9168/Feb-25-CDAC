import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        int n,fact=1;
        System.out.println("Enter any number:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("The fatorial is: " +fact);
    }
    
}
/* 
Output:
Enter any number:
5
The fatorial is: 120 */