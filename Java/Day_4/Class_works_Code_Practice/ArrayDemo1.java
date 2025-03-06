import java.util.Scanner;

class ArrayDemo1{
			
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//length : Array
		//length() : String
		
		int arr[] = new int[5]; //size=5
		//Input in the array
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("Enter element:");
			arr[i] = sc.nextInt(); // we can input only 5 elements according to size
		}
	    // display array 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
		
		
}

/* Enter element:
3
Enter element:
4
Enter element:
5
Enter element:
6
Enter element:
7
3
4
5
6
7 */