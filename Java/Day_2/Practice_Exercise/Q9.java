//9. Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.

import java.util.Scanner;
class Q9{
	
public static void main(String[]args){
	
	System.out.println("Enter two numbers:");
	
	     Scanner ref = new Scanner(System.in);
		 
		 int a = ref.nextInt();
		  
		 int b = ref.nextInt();
		 
		 	System.out.println(a==b); 
			 	System.out.println(a!=b); 
				        System.out.println(a>b); 
									 	System.out.println(a<b); 
												 	System.out.println(a>=b); 
															 	System.out.println(a<=b); 
																
}
}

/*Output:
Enter two numbers:
5
7
false
true
false
true
false
true
*/