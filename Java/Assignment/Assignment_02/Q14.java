import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        // Swap odd and even bits
        int evenBits = (n & 0xAAAAAAAA) >> 1;  // Mask and shift even bits right
        int oddBits = (n & 0x55555555) << 1;   // Mask and shift odd bits left
        int swapped = evenBits | oddBits;      // Combine swapped bits

        System.out.println("Number after swapping odd and even bits: " + swapped);
    }
}
