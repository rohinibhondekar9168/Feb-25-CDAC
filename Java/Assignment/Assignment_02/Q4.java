/* Q4: Write a program to find whether a given number is divisible by 3 without using the
modulus ( % ) or division ( / ) operators.
Hint : Use subtraction and bitwise shifts . */

public class Q4{
	public static void main(String[] args){
		int n = 15;
		
		if(n<0){
			n = -n;
		}
		
		while(n>3){// 15 binary= 1111 , 3=11
			n = (n & 3) + (n >> 2); //(1111 & 11) + (1111 >> 2)=3+3=6                  (1111 >> 2)=15 right shift by 2=0000 0011
		}
		
		if(n==0 || n==3)// 
			System.out.println("Division by 3");
		else
			System.out.println("Not division by 3");
	
	}
}

/* Dry Run (Step-by-Step Execution)
 n = 15
Initial Value: n = 15 (Binary: 1111)
Step 1: Check if negative
n is already positive.

Step 2: Apply the loop

Iteration	Value of n	Binary Representation	n & 3 (Last 2 Bits)	n >> 2 (Shift Right by 2)	New Value of n
1st	15	1111 (15)	11 (3)	11 (3)	3 + 3 = 6
2nd	6	110 (6)	10 (2)	1 (1)	2 + 1 = 3
Step 3: Final Check
Since n = 3, output: "Division by 3"
 */