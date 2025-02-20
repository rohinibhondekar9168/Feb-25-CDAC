/* Snippet 9:
public class InfiniteForLoopUpdate {
public static void main(String[] args) {
for (int i = 0; i < 5; i += 2) {//i=i+2=2, 4,
System.out.println(i);//0 2 4 (It will not print infinitely)
}
}
}
Error to investigate: Why does the loop print unexpected results or run infinitely? 
How should the loop update expression be corrected? */

 // Corrected code
public class InfiniteForLoopUpdate {
    public static void main(String[] args) {
    for (int i = 0; i < 5; i ++) {
    System.out.println(i);
    }
    }
    }