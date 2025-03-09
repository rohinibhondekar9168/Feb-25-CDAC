//Q10: Determine If a Character is a Vowel or Consonant Using the Ternary Operator

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        
        // Using ternary operator to check for vowels
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonant";

        System.out.println(ch + " is a " + result);
    }
}

