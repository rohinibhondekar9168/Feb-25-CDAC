public class Q18 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows for the upper part

        // Upper part of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

