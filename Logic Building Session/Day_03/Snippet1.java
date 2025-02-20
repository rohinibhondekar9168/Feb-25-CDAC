public class Snippet1 {
    public static void main(String[] args) {
     
        // Corrected code
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            }
        
        // Output : 0 1 2 3 4 5 6 7 8 9
      
        
        /* 
        for (int i = 0; i < 10; i--) {
        System.out.println(i);
        } */
        }
}

/* Output:
Infinite loop 
because condition is not getting true.
*/

/* 
Error to investigate: Why does this loop run infinitely? 
How should the loop control variable be adjusted?

Since i-- continuously decreases the value of i (0, -1, -2, -3, ...), i will never reach or exceed 10.
 This means the condition i < 10 will always be true, leading to an infinite loop. */