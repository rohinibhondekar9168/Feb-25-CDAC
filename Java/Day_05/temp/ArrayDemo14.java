import java.util.Scanner;

class ArrayDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3]; // Matrix 1
        int b[][] = new int[3][3]; // Matrix 2
        int c[][] = new int[3][3]; // Resultant Matrix

        // Input: Matrix 1
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input: Matrix 2
        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        System.out.println("Matrix Addition:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Subtraction
        System.out.println("Matrix Subtraction:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication (Fixed)
        System.out.println("Matrix Multiplication:");
        int multiply[][] = new int[3][3]; // New matrix for multiplication result
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiply[i][j] = 0;
                for (int k = 0; k < 3; k++) { // Row of A × Column of B
                    multiply[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose of Matrix 2 (Fixed)
        System.out.println("Transpose of Matrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[j][i] + " ");
            }
            System.out.println(); // Corrected formatting
        }

 
    }
}
	
	