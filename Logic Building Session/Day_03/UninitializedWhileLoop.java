/* public class UninitializedWhileLoop {
    public static void main(String[] args) {
    int count;//Not initialize value
    while (count < 10) { //so in while loop occur error
    System.out.println(count);
    count++;
    }
    }
    }
    Error to investigate: Why does this code produce a compilation error?
     What needs to be done to initialize the loop variable properly? */

      //Corrected code:
      public class UninitializedWhileLoop {
        public static void main(String[] args) {
        int count=0;
        while (count < 10) {
        System.out.println(count);//0 1 2 3 4 5 6 7 8 9
        count++;
        }
        }
        }


