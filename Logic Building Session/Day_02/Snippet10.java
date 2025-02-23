/* public class Snippet10 {
    public void display() {
        System.out.println("No parameters");
    }

    public void display(int num) {
        System.out.println("With parameter: " + num);
    }

    public static void main(String[] args) {
        display();  // ❌ ERROR
        display(5); // ❌ ERROR
    }
}
 */

 /* Corrected Code:
 public class Main {
    public void display() {
        System.out.println("No parameters");
    }

    public void display(int num) {
        System.out.println("With parameter: " + num);
    }

    public static void main(String[] args) {
        Main obj = new Main(); // Creating an object of Main class
        obj.display();  // Corrected method call
        obj.display(5); // Corrected method call
    }
}
 */
/* 
Output:
 No parameters
With parameter: 5 */
