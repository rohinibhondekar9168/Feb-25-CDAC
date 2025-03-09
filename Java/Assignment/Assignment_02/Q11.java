import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
   

        // Check if n is a power of 2
        boolean isPowerOf2 = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println(n + " is a power of 2: " + isPowerOf2);
    }
}
