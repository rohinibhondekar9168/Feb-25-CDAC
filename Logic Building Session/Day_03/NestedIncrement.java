public class NestedIncrement {
    public static void main(String[] args) {
    int a = 10;
    int b = 5;
    int result = ++a * b-- - --a + b++;
              // 11  * 5   -  10 + 4 = 55 - 6 = 49 
    System.out.println(result); //49
    }
    }
    // Guess the output of this code snippet.

      // Output: 49
/* 
     ++a: 11
     b--: 5 
     --a: 10
     b++: 4 
     */