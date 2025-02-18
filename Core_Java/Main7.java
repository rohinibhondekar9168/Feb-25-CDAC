/*
Snippet 7:
public class Main {
public static void main(String[] args) {
int x = "Hello";
System.out.println(x);
}
}
 What compilation error do you see? Why does Java enforce type safety?
*/


public class Main7 {
public static void main(String[] args) {
int x = "Hello"; // Error: String cannot be converted to int
System.out.println(x);
}
}

//Output:

PS D:\CDAC\Core Java\Codes\Day_2> javac Main7.java
Main7.java:15: error: incompatible types: String cannot be converted to int
int x = "Hello";
        ^
1 error