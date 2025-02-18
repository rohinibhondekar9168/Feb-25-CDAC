public class Snippet14 {
    public static void main(String[] args) {
      
        double num = 34.56;
        System.out.println(num); //34.56

        /* 
        double num = "Hello";//String cannot be converted to double
        System.out.println(num); */
    }
    
}


/* 
 What compilation error occurs? Why does Java enforce data type constraints?

Output:
PS D:\CDAC\Core_Java1\Day_2> javac Snippet14.java
Snippet14.java:4: error: incompatible types: String cannot be converted to double
        double num = "Hello";
                     ^
1 error

 */