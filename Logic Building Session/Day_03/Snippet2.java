public class Snippet2 {
    public static void main(String[] args) {

 ///  Corrected code:

    int count = 5;
    while (count >= 0) {  /// Loop runs while count is 0 or positive
    System.out.println(count);// 5 4 3 2 1 0
    count--;//4 3 2 1 0 -1



/*    Error code:

        int count = 5;
        while (count = 0) {
        System.out.println(count); 
        count--;
        } */
/* 
        Output:
        Snippet2.java:4: error: incompatible types: int cannot be converted to boolean
        while (count = 0) {
                     ^
        1 error */

        }
}

/* Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the
`while` loop?

The issue in the while loop is due to an incorrect condition: */