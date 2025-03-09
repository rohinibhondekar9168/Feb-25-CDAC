import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student percentage: ");
        int percentage = sc.nextInt();
 

        
        String result = (percentage >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}

/* Enter student percentage: 34
   Result: Fail */