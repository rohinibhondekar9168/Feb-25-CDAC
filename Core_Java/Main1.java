/*
Snippet 2:
public class Main {
static void main(String[] args) {
System.out.println("Hello, World!");
}
}
 What happens when you compile and run this code?
*/

Error code:

public class Main1 {
static void main(String[] args) //missing public
{
System.out.println("Hello, World!");
}
}

Corrected code:

public class Main1 {
public static void main(String[] args) 
{
System.out.println("Hello, World!");
}
}

Output: Hello, World!


 What happens when you compile and run this code?
PS D:\CDAC\Core Java\Codes\Day_2> javac Main1.java
PS D:\CDAC\Core Java\Codes\Day_2> java Main1
Error: Main method not found in class Main1, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application