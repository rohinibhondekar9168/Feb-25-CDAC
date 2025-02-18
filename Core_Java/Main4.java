/*
Snippet 5:
public class Main {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
}
 Can you have multiple main methods? What do you observe?
*/

public class Main4 {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
}

Output:

PS D:\CDAC\Core Java\Codes\Day_2> javac Main4.java
PS D:\CDAC\Core Java\Codes\Day_2> java Main4
Main method with String[] args

 Can you have multiple main methods? What do you observe?

Yes,have multiple main method, but excuted only first entry point of main method. 