/*
Snippet 11:
public class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[5]);//ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
}
}
 What runtime exception do you encounter? Why does it occur?--------
PS D:\CDAC\Core Java\Codes\Day_2> javac Main11.java
PS D:\CDAC\Core Java\Codes\Day_2> java Main11
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main11.main(Main11.java:16)

*/

Corrected code:

public class Main11 {
public static void main(String[] args) {
int[] arr = {1, 2, 3, 4, 5, 6};
System.out.println(arr[5]);  //6
}
}

Output:

PS D:\CDAC\Core Java\Codes\Day_2> javac Main11.java
PS D:\CDAC\Core Java\Codes\Day_2> java Main11
6