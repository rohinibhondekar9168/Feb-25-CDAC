public class Snippet25 {
    
    public static void main(String[] args) {

        // Corrected code
        int score = 85;
        switch(score) {
        case 100:
        System.out.println("Perfect score!");
        break;
        case 85:
        System.out.println("Great job!");
        break;
        default:
        System.out.println("Keep trying!");

       // Output:Great job!


        /* double score = 85.0;
        switch(score) {
        case 100:
        System.out.println("Perfect score!");
        break;
        case 85:
        System.out.println("Great job!");
        break;
        default:
        System.out.println("Keep trying!");
 */
       /*  Output:
        Snippet25.java:5: error: incompatible types: possible lossy conversion from double to int
        switch(score) {
              ^
1 error */
        }
        }
        }
       /*   Error to Investigate: Why does this code not compile? What does the error tell you about the
        types allowed in switch expressions? How can you modify the code to make it work? */

