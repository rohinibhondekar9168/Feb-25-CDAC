import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
    

        // Multiply by 8 using left shift
        int result = n << 3; //5 << 3  5 in binary:   00000101
       // 5 << 3        : 00101000  

        System.out.println(n + " multiplied by 8 is: " + result);
    }
}
/* Enter a number: 8
8 multiplied by 8 is: 64 */