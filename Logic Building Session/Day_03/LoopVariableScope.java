/* Snippet 12:
public class LoopVariableScope {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int x = i * 2;
}
System.out.println(x); // Error: 'x' is not accessible here
}
}
Error to investigate: Why does the variable 'x' cause a compilation error?
 How does scope 

error: cannot find symbol
System.out.println(x); // Error: 'x' is not accessible here
                       ^
  symbol:   variable x
  location: class LoopVariableScope
1 error

Due to scope rules, x only exists inside the loop and cannot be accessed outside of it.
 */

// Corrected code
 public class LoopVariableScope {
    public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
    int x = i * 2;
    
    System.out.println(x); // Now 'x' is accessible here
    }
    }
}