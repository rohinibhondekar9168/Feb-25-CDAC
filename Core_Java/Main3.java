/*
Snippet 4:
public class Main {
public static void main() {
System.out.println("Hello, World!");
}
}
 What happens when you compile and run this code? Why is String[] args needed?
*/

public class Main3 {
public static void main() //missing string[]args
{
System.out.println("Hello, World!");
}
}

Output:

PS D:\CDAC\Core Java\Codes\Day_2> javac Main3.java
PS D:\CDAC\Core Java\Codes\Day_2> java Main3
Error: Main method not found in class Main3, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application


Corrected code:

public class Main3 {
public static void main(String[]args) {
System.out.println("Hello, World!");
}
}

Output: Hello, World!


 What happens when you compile and run this code? Why is String[] args needed?

Why String[] args is needed: It's part of the standard method signature that the JVM expects to start the program and also allows passing command-line arguments.
Without it, the JVM will not be able to identify your main method as the entry point of your program.

