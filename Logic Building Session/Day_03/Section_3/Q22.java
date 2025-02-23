public class Q22 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the upper part

        // Upper part
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

