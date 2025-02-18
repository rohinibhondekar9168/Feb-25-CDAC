public class Snippet26 {
    public static void main(String[] args) {
        int number = 5;
        switch(number) {
        case 5:
        System.out.println("Number is 5");
        break;
        case 5:
        System.out.println("This is another case 5");
        break;
        default:
        System.out.println("This is the default case");

     /*    Output: 
        Snippet26.java:8: error: duplicate case label
        case 5: */
 /* Error to Investigate: Why does the compiler complain about duplicate case labels? What
happens when you have two identical case labels in the same switch block?

The compiler complains about duplicate case labels because each case in a switch statement must be unique. 
If two case labels have the same value, the compiler cannot determine which one to execute.
 */
        }
        }
        }
    

