package Day_01;

public class Recursion1 {
	
	static int i = 0;
	static void show()
	{
	 //++i; //print 5 times hello world
	   if(i<=5)
		{
			System.out.println("Hello world"); 
			i++;//// print hello 6 times
			show();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();

	}

}
