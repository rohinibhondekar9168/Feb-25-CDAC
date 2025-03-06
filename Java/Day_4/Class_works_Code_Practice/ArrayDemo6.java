import java.util.Scanner;

class ArrayDemo6{
			
	public static void main(String args[]){
		int a[] = {1,2,3};
		int b[] = {11,12,13};
		int c[] = {21,22,23};
		
		int arr[][] = new int[3][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		for(int ar[] : arr)
		{
			for(int x : ar)
			{
				System.out.print(" "+x);
			}
			System.out.println();
		}
	}
		
		
}

/* 1 2 3
11 12 13
21 22 23 


✅ Breakdown of the Code
Declaring and Initializing Single-Dimensional Arrays:


int a[] = {1,2,3};
int b[] = {11,12,13};
int c[] = {21,22,23};
Three 1D arrays a, b, and c are created.
Creating a Jagged Array:


int arr[][] = new int[3][];
arr[0]=a;
arr[1]=b;
arr[2]=c;
The 2D array arr[][] is initialized with 3 rows, but column sizes are not defined initially.
Each row points to a different 1D array (a, b, c).
Using an Enhanced for Loop to Print Elements:


for(int ar[] : arr)//rows
{
    for(int x : ar)
    {
        System.out.print(" "+x);
    }
    System.out.println();
}
Outer loop iterates over rows (ar[]).
Inner loop iterates over elements (x) in each row.
Prints the matrix-like structure of the array.
Expected Output

 1 2 3
 11 12 13
 21 22 23
🔹 Key Takeaways
✅ The code correctly demonstrates a 2D array using individual 1D arrays.
✅ Uses enhanced for loop for better readability.
✅ This is a flexible approach—each row can have a different number of elements (jagged array).

🔹 Want to modify it further?

You can take user input to make it dynamic.
You can assign different lengths to each row to truly make it a jagged array.
*/
