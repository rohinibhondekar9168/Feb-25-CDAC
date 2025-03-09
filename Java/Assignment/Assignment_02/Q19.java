import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
      

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";

        System.out.println("Character type: " + result);
    }
}

/* Enter a character: a
Character type: Lowercase */