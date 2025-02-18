public class Snippet13 {
        public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // NullPinterException at runtime
        }
        }


       /* // What exception is thrown? Why does it occur?
     The variable str is declared as a String and initialized with null.

      /*   Output:
        S D:\CDAC\Core_Java1\Day_2> javac Snippet13.java
        PS D:\CDAC\Core_Java1\Day_2> java Snippet13
        Exception in thread "main" java.lang.NullPointerException
                at Snippet13.main(Snippet13.java:4) */