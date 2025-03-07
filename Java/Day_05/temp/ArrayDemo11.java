class ArrayDemo11{

      static int[] getArray(){
	  return new int[] {10,20,30,40};
}

    public static void main(String[]args){
	
 int[] a = getArray();// 10 20 30 40 50
 
 // Printing output for loop
 for( int x : a){
	 System.out.println(x);
 }
}
}