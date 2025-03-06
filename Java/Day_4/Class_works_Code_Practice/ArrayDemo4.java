import java.util.Scanner;

class ArrayDemo4{
			
	public static void main(String args[]){  
        // 1D ARRAY
		//int []arr = new int[5];
		int arr[]={1,2,3,4,5};//compile time
		//Initialization of array
		char arr1[] = {'c','d','a','c','m'}; 
		
		byte arr2[] = {1,13,0,0,1,1,0,0,1,1};
		
		//For-each loop
		
		for(int a : arr){
			System.out.print(a+" ");
		}
		
		for(char a1 : arr1){
			System.out.print(a1+" ");
		}
        for(byte b1 : arr2){
			System.out.print(b1+" ");
		}
	}
		
		
}

//1 2 3 4 5 c d a c m 1 13 0 0 1 1 0 0 1 1 