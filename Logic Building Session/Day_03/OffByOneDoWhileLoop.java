/* Snippet 8:
public class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num); //1
num--;//0
} while (num > 0);//0>0:condition false 
}
}
Error to investigate: Why does this loop print unexpected numbers? 
What adjustments are needed to print the numbers from 1 to 5?
 */

 // Corrected code
 public class OffByOneDoWhileLoop {
    public static void main(String[] args) {
    int num = 1;
    do {
    System.out.println(num); //1 2 3 4 5
    num++;
    } while (num <= 5);
    }
    }