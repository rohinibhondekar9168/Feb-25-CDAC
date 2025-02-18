/*
Snippet 12:
public class Main {
public static void main(String[] args) {
while (true) {
System.out.println("Infinite Loop");
}
}
}
 What happens when you run this code? How can you avoid infinite loops?

Ensure a Termination Condition: Make sure the loop condition will eventually become false.

int i = 0;
while (i < 5) {  // Loop will stop after 5 iterations
    System.out.println("Iteration " + i);
    i++;
}
*/



public class Main12 {
public static void main(String[] args) {
while (true) {
System.out.println("Infinite Loop"); // Infinite times executed
}
}
}