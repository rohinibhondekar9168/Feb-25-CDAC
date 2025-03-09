import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
  

        System.out.println(num + " is " + ((num & 1) == 0 ? "Even" : "Odd"));
    }
}

/* Enter a number: 24
24 is Even */
