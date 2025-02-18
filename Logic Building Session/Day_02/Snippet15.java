public class Snippet15 {
    public static void main(String[] args) {

        double num1 = 10.0;
        double num2 = 5.5;
        double result = num1 + num2;
        System.out.println(result);//15.5

        /* int num1 = 10;
        double num2 = 5.5;
        int result = num1 + num2; //error: incompatible types: possible lossy conversion from double to int
        System.out.println(result); */
        }
        }
    
      /*    What error occurs when compiling this code? How should you handle different data types
        in operations?

        Snippet15.java:5: error: incompatible types: possible lossy conversion from double to int
        int result = num1 + num2;
                          ^
1 error */