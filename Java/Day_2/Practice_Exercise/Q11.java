//12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.

class Q11 {
    public static void main(String[] args) {
        int a = 10, b = 5;


        a += b;  // a = a + b
        System.out.println("After a += b: " + a);

        a -= b;  // a = a - b
        System.out.println("After a -= b: " + a);

        a *= b;  // a = a * b
        System.out.println("After a *= b: " + a);

        a /= b;  // a = a / b
        System.out.println("After a /= b: " + a);

        a %= b;  // a = a % b
        System.out.println("After a %= b: " + a);
    }
}
/* Output:

After a += b: 15
After a -= b: 10
After a *= b: 50
After a /= b: 10
After a %= b: 0

*/