/* Write a Java program that calculates the area of a square using the formula
area = side * side. Use a predefined side length. */
import java.util.Scanner;
public class AreaSquare {
    public static void main(String[] args) {
        int side,area;
        System.out.println("Enter side of square:");
        Scanner obj=new Scanner(System.in);
        side=obj.nextInt();

        area=side*side;

        System.out.println("The area of square is:" +area);

    }
    
}

/* Output:
Enter side of square:
5
The area of square is:25 */