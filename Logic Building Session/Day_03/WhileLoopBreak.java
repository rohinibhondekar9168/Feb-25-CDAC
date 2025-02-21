public class WhileLoopBreak {
    public static void main(String[] args) {

    int count = 0;// count=0,1,2

    while (count < 5) { //(0<5:T),T,T

    System.out.print(count + " ");//count=0,1,2

    count++;//COUNT=1,2,3

    if (count == 3)//(1==3:f),f,T(3==3)
     break;
    }
    System.out.println(count);//3
    }
    }

  /*   Final Output:
  
    0 1 2 3 */

// Guess the output of this while loop.

 /*  0 1 2 are printed inside the loop.
The loop breaks when count becomes 3, 
but count itself is still 3, so it is printed on a new line. */

