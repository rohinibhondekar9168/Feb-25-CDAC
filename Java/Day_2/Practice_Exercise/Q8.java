// 8. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.

import java.util.Scanner;
class Q8{
	
public static void main(String[]args){
	
	System.out.println("Enter two numbers:");
	
	     Scanner ref = new Scanner(System.in);
		 
		 int a = ref.nextInt();
		  
		 int b = ref.nextInt();
	
	System.out.println("Addition: " +(a+b));
	System.out.println("Subtraction: "+(a-b));
	System.out.println("Multiplication: "+(a*b));
	System.out.println("Division: "+(a/b));
	System.out.println("Modulus: "+(a%b));
}
}
	
/*Output:
	
Enter two numbers:
3 2
Addition: 5
Subtraction: 1
Multiplication: 6
Division: 1
Modulus: 1
*/