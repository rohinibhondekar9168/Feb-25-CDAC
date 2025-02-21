public class IncrementDecrement {
    public static void main(String[] args) {
    int x = 5;
    int y = ++x - x-- + --x + x++; 
        //   6  - 6   +   4  +  4 = 0 + 8 = 8
    System.out.println(y); //8
    }
    }
    // Guess the output of this code snippet.
    // Output: 8

   /*  x=5
       ++x : 6
       x-- : 6
       --x : 5 4
       x++ : 4
       */