/*9. Calculate the Area of a Circle
Write a Java program that calculates the area of a circle.
Test Data:
 Input the radius: 7
Formula: Area = π * radius²
Expected Output:
Area of the circle: 153.93804 */


import java.util.Scanner;
class Test8
{
public static void main(String[]args)
{
final double PI=3.14,area;
int r;

System.out.println("Enter radius of circle :");
Scanner obj=new Scanner(System.in);
r=obj.nextInt();
area=PI*r*r;
System.out.println("The area of circle is: "+area);

}
}

Output:

PS C:\Users\Rohini\OneDrive\Desktop\Java> javac Test8.java
PS C:\Users\Rohini\OneDrive\Desktop\Java> java Test8
Enter radius of circle :
7
The area of circle is: 153.86