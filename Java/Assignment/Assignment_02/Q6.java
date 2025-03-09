/* Q6: Write a program to find the largest of three numbers using only the ternary operator
( ? : ) . */
 
public class Q6 {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15; // Example values

        // Using nested ternary operator to find the largest number
        int largest = (a > b) ?                                      //(Exp1 > exp2) ? (a:b)
                        ((a > c) ? a : c)  // If a > b, check if a > c
                        : ((b > c) ? b : c); // If b > a, check if b > c

        // Output result
        System.out.println("The largest number is: " + largest);//25
    }
}

