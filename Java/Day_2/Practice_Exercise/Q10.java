//11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).

import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();//22

        // Checking if the number is positive and even
        if(num > 0 && num % 2 == 0) { //22 
            System.out.println(num + " is positive and even.");
        } else {
            System.out.println(num + " is not both positive and even.");
        }

    
    }
}
/*
Output:
Enter a number: 22
22 is positive and even.
*/