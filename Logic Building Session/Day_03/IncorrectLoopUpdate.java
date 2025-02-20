/* Snippet 11:
public class IncorrectLoopUpdate {
public static void main(String[] args) {
int i = 0;
while (i < 5) {
System.out.println(i);// Output : 0 2 4 
i += 2; // Error: This may cause unexpected results in output
}
}
}
Error to investigate: What will be the output of this loop? 
How should the loop variable be updated to achieve the
desired result? */

// Corrected code
public class IncorrectLoopUpdate {
    public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
    System.out.println(i);// 0 1 2 3 4
    i++; 
    }
    }
    }