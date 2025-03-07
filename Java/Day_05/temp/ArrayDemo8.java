import java.util.Scanner;

class ArrayDemo8{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int arr[][] = new int[3][3]; // 2D array with 3 rows, 3 columns
	
	//Input
	for(int i=0;i<3;i++){//row
	 for(int j=0; j<3; j++){ //column
	 System.out.println("Enter element:");
	 arr[i][j]=sc.nextInt();
	 }
	}
	
	//output:Printing the array using enhanced for loop:
	System.out.println("----------------");
	for(int ar[]:arr)  // Row-wise traversal
	{
	for(int x: ar)
	{ 
	System.out.print(x);
	}
	System.out.println();
	}
	}
	}