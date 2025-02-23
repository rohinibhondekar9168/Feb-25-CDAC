//4. Write a program to reverse the digits of the number 1234. The output should be 4321.

public class Q4 {
    public static void main(String[] args) {
        int n=1234;
        int r;

        while(n>0)
        {
            r=n%10;
            System.out.print(r);
            n=n/10;
        }

        
    }
}
