//Q9: Check If a Number is Within the Range (20 to 50) Without Using If-Else
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();//23
        System.out.println("Number within range (20 to 50):" + (num>=20 && num<=50));//true

    
}
}