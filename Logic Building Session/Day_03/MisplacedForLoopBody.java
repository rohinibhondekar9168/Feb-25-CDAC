/* Snippet 6:
public class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++)//i=0
System.out.println(i);//0 1 2 3 4
System.out.println("Done"); //error?
}
}
Error to investigate: Why does "Done" print only once, outside the loop?
 How should the loop body be enclosed to include all statements within the loop? */

 //Corrected code:
public class MisplacedForLoopBody {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
       {
        System.out.println(i);//i=0 1 2 3 4 
       }
        System.out.println("Done"); //"Done" prints after the loop ends
        }
        }

/*  Output:
 0
1
2
3
4
Done */
