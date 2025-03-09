//Q5: Write a Java program to swap two numbers using the += and -= operators only.


public class Q5{
	public static void main(String[] args){
      
        int a = 23, b = 40;

        System.out.println("Before swapping: a = "+ a+", b = " +b);

        a+=b; // a=a+b
        b = a-b;   // b=a-b
        a-=b;      //a = a-b; 
      
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
/*   Output:
Before swapping: a = 23, b = 40
After swapping: a = 40, b = 23 */