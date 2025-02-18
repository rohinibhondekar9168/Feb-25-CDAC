/* Write a Java program that calculates the area of a rectangle using the formula
area = length * width. Use predefined values for length and width.
 */
import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
        
        int length,width,area;
        System.out.println("Enter the value of length & breadth:");
        Scanner obj=new Scanner(System.in);
        length=obj.nextInt();
        width=obj.nextInt();

        area=length*width;

        System.out.println("The area of square is:" +area);

    }
    
}

/* Output:
Enter the value of length & breadth:
3
5
The area of square is:15 */

