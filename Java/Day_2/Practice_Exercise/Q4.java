//4. Write a program to calculate the average of three int numbers using typecasting to display the result in double.

import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int a = ref.nextInt();//3
        int b = ref.nextInt();//5
        int c = ref.nextInt();//2

        // Corrected formula with proper typecasting
        double average = (a + b + c) / 3.0; // Using 3.0 ensures floating-point division

        System.out.println("The average of 3 numbers is: " + average);//The average of 3 numbers is: 3.3333333333333335

	}
}

