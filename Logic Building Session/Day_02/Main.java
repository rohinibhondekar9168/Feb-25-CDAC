/*
Snippet 1:
public class Main {
public void main(String[] args) {
System.out.println("Hello, World!");
}
}
 What error do you get when running this code?
*/

Error code: 

public class Main {
public void main(String[] args)//missing static
 {
System.out.println("Hello, World!");
}
}

Corrected code:

public class Main {
public static void main(String[] args)
 {
System.out.println("Hello, World!");
}
}

 What error do you get when running this code?

PS D:\CDAC\Core Java\Codes\Day_2> javac Main.java
PS D:\CDAC\Core Java\Codes\Day_2> java Main
Error: Main method is not static in class Main, please define the main method as:
   public static void main(String[] args)

