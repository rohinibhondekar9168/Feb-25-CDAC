import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
    

        int min = (a < b) ? (a < c ? (a < d ? a : d) : (c < d ? c : d)) 
                          : (b < c ? (b < d ? b : d) : (c < d ? c : d));

        System.out.println("Minimum number is: " + min);
    }
}

