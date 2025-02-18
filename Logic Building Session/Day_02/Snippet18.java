public class Snippet18 {
public static void main(String[] args) {
int a = 10;
int b = 0;
int result = a / b; //java.lang.ArithmeticException: / by zero
System.out.println(result);
}
}

/*  What runtime exception is thrown? Why does division by zero cause an issue in Java?
java.lang.ArithmeticException: / by zero. Here, 10 / 0 is undefined in integer arithmetic. */