import java.util.Scanner;

public class CelsiusToFahrenheit {
  public static void main(String[] args) {
        // Create r object for user input
        Scanner r = new Scanner(System.in);

        System.out.println("Input temperature in Celsius: ");
        double celsius = r.nextDouble();

          // Convert Celsius to Fahrenheit
          double f = (celsius * 9/5) + 32;

          System.out.println(celsius + "°C is equal to " + f + "°F");
        
/* Output:
          Input temperature in Celsius: 
25
25.0°C is equal to 77.0°F */
}
}