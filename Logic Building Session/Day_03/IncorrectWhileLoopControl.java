/* Snippet 10:
public class IncorrectWhileLoopControl {
public static void main(String[] args) {
int num = 10;
while (num = 10) { //error: incompatible types: int cannot be converted to boolean
System.out.println(num);
num--;
}
}
}
Error to investigate: Why does the loop execute indefinitely? 
What is wrong with the loop condition? */

// Corrected code
public class IncorrectWhileLoopControl {
    public static void main(String[] args) {
    int num = 10;
    while (num > 0) {
    System.out.println(num);//10 9 8 7 6 5 4 3 2 1
    num--;// Decrements num in each iteration
    }
    }
    }