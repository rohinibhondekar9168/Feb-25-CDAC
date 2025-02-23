// Program 11: Demonstrate pre-increment and post-decrement in a single expression
public class Q11 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int result = ++a + b--;
        System.out.println("Result: " + result);
        System.out.println("Updated a: " + a);
        System.out.println("Updated b: " + b);
    }
}
