/*
Snippet 3:
public class Main {
public static int main(String[] args) {
System.out.println("Hello, World!");
return 0;
}
}
 What error do you encounter? Why is void used in the main method?
*/

Error code:

public class Main2 {
public static int main(String[] args)//missing void {
System.out.println("Hello, World!");
return 0;
}
}

output:

PS D:\CDAC\Core Java\Codes\Day_2> javac Main2.java
PS D:\CDAC\Core Java\Codes\Day_2> java Main2
Error: Main method must return a value of type void in class Main2, please
define the main method as:
   public static void main(String[] args)
PS D:\CDAC\Core Java\Codes\Day_2>


Corrected code:

public class Main2 {
public static void main(String[] args){
System.out.println("Hello, World!");
return 0;
}
}

Output: Hello, World!


// What error do you encounter? Why is void used in the main method?

Error: Main method must return a value of type void in class Main2, please
define the main method as:
   public static void main(String[] args)
void is used in main because Java does not require a return value for program execution.