/*
Snippet 9:
public class Main {
public static void main(String[] args) {
int class = 10;
System.out.println(class);
}
}
 What error occurs? Why can't reserved keywords be used as identifiers?

Reserved keywords in Java have specific meanings that define the language's syntax and behavior.
Using them as identifiers would cause ambiguity and make it difficult for the compiler and developers to understand the program.

*/

Corrected code:

public class Main {
public static void main(String[] args) {
int a = 10;
System.out.println(a);//10
}
}

Output: 10

Error code:

public class Main9 {
public static void main(String[] args) {
int class = 10;
System.out.println(class);
}
}

Output:

PS D:\CDAC\Core Java\Codes\Day_2> javac Main9.java
Main9.java:15: error: not a statement
int class = 10;
^
Main9.java:15: error: ';' expected
int class = 10;
   ^
Main9.java:15: error: <identifier> expected
int class = 10;
         ^
Main9.java:16: error: <identifier> expected
System.out.println(class);
                  ^
Main9.java:16: error: illegal start of type
System.out.println(class);
                   ^
Main9.java:16: error: <identifier> expected
System.out.println(class);
                        ^
Main9.java:18: error: reached end of file while parsing
}
 ^
7 errors