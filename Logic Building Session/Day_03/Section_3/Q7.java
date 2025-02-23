// Program 7: Sum of digits of 9876
public class Q7 {
    public static void main(String[] args) {
        int num = 9876, sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
