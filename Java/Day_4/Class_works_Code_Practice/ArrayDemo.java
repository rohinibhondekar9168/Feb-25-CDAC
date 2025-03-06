import java.util.Scanner;

class ArrayDemo {
    public static void main(String args[]) {
    System.out.println("Enter array element");
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];// size is 5

        // Input in the array
        for (int i = 0; i < 3; i++) { // Takes input for first 3 elements only
            arr[i] = sc.nextInt(); // 4 6 8
        }

        // Displaying elements
        for (int i = 0; i < 3; i++) { // Prints only first 3 elements
            System.out.println(arr[i]); // 4 6 8
        }
    }
}
/* Output:
Enter array element
4
6
8
4
6
8 */