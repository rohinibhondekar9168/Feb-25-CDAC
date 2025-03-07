// Cloning array

class ArrayDemo13{

    public static void main(String[]args){
	
	int arr[] = {10,20,30};
	
	int clonearr[]=arr.clone(); //false
	
	System.out.println(arr == clonearr){ //true
	
	for(int x : arr){
	System.out.println(x);
	}
	System.out.println("------------");
	for(int x : clonearr){
	System.out.println(x);
	}

}
}