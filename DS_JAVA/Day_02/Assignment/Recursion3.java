//Find the Factorial of n number
class Recursion3
{
	static int fact(int n){
		if(n<=1)
		{
			return n;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	

public static void main(String[]args){
	System.out.println(fact(3));

}
}