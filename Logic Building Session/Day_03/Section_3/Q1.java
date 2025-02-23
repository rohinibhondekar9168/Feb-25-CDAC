/* 1. Write a program to calculate the sum of the first 50 natural numbers. */
class Q1 {
    public static void main(String[] args) {
        int sum = 0;  // Initialize sum

        // Loop to calculate the sum of first 50 natural numbers
        for (int i = 1; i <= 50; i++) {//i=1 2
            sum = sum + i;//sum=1 + 2 + 3...=1275
        }

        // Correct print statement
        System.out.println("Addition: " + sum);//1275
    }
}

/* Output:
PS D:\CDAC\Core_Java1\Day_3\Section_3> javac Q1.java
PS D:\CDAC\Core_Java1\Day_3\Section_3> java Q1
Addition: 1275 */