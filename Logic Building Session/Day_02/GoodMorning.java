/* Write a Java program that displays a "Good Morning" message if the
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.
 */
public class GoodMorning {
    public static void main(String[] args) {
    
        int hour=9;

        if(hour>=5 && hour<12)
        {
            System.out.println("Good Morning");
        }
     
        /* Output:
        Good Morning
    */
}
}