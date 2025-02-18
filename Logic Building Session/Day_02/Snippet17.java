public class Snippet17 {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = a ** b; //error: illegal start of expression
    
        System.out.println(result);
        }
        }
/* What compilation error occurs? Why is the ** operator not valid in Java?
        In some languages like Python, ** is used for exponentiation (e.g., 2 ** 3 = 8 in Python).
However, Java does not support ** as an exponentiation operator.
Java only supports arithmetic operators like +, -, *, /, and %, but ** is not among them.
 */