/*
Snippet 6:
public class Main {
public static void main(String[] args) {
int x = y + 10;
System.out.println(x);
}
}
 What error occurs? Why must variables be declared?
*/

Error code:

public class Main6 {
public static void main(String[] args) {
int x = y + 10; 
System.out.println(x); // occur error not initialize value for y
}
}


Output:

PS D:\CDAC\Core Java\Codes\Day_2> javac Main6.java
Main6.java:15: error: cannot find symbol
int x = y + 10;
        ^
  symbol:   variable y
  location: class Main6
1 error


Corrected code:


public class Main6 {
public static void main(String[] args) {
int x = 20 + 10; 
System.out.println(x); 
}
}

Output:
30

 What error occurs? Why must variables be declared?

 error: cannot find symbol
int x = y + 10;
        ^
  symbol:   variable y
  location: class Main6
1 error

Declaring variables in Java ensures type safety, memory allocation, 
error prevention, and maintainability of the code.
