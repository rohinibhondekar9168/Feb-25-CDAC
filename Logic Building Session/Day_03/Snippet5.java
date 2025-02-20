/* Snippet 5:
public class WrongInitializationForLoop {
public static void main(String[] args) {
for (int i = 10; i >= 0; i++) {
System.out.println(i);
}
}
}
// Error to investigate: Why does this loop not print numbers in the expected order? 
What is the problem with the initialization and update statements in the `for` loop? */

//Corrected code:
public class Snippet5 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) { // i=10, 9  Decrement i instead of incrementing
        System.out.println(i);// 10 9 8 7 6 5 4 3 2 1 0
        }
        }
    
}
