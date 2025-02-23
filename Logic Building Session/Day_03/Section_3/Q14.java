public class Q14 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        
        for (int i = 1; i <= rows; i++) { // Loop for each row
            for (int j = 1; j <= (2 * i - 1); j++) { // Loop for stars in each row
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}


/* Explanation:
The outer loop controls the number of rows.
The inner loop prints stars (*), following the pattern:
Row 1 → 1 star
Row 2 → 2 stars
Row 3 → 3 stars
Row 4 → 5 stars
Row 5 → 7 stars
Row 6 → 9 stars
The formula for the number of stars in each row is (2 * row - 1). */