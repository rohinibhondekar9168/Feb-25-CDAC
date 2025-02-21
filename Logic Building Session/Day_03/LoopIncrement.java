public class LoopIncrement {
    public static void main(String[] args) {
    int count = 0;//count=0
    for (int i = 0; i < 4; i++) { //i=0  2 3           //count= count + i++ - ++i
    count += i++ - ++i;// count = 0 + 0 - 2 = -2
    }                  // count= -2 + 3 - 5= -4
    System.out.println(count);//-4
    }
    }
    // Guess the output of this code snippet.

    //i=1