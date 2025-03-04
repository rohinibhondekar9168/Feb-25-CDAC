class DataDemo4
{
public static void main(String[]args){
	int x=0;
	if(true){ //  The condition in if(true) is always true, so the statement inside the block executes.
      System.out.println(x); prints 0 to the console.
		System.out.println(x); //0
	}

}
}

class DataDemo4 {
    public static void main(String[] args) {
        int x = 0;
        if (false) { // ❌ This block will never execute
            System.out.println(x);
        }
    }
}