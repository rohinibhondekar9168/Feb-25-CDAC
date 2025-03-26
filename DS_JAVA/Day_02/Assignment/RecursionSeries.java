class RecursionSeries {
    public static void printNumbers(int n) { // Change return type to void
        if (n == 0) {
            return; // Base case: stop recursion when n reaches 0
        }
        printNumbers(n - 1); // Recursive call
        System.out.print(n + " "); // Print after recursion (ascending order)
    }

    public static void main(String[] args) {
        int n = 5; // Print numbers from 1 to 5
        printNumbers(n);
    }
}
