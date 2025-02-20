public class Snippet3 {
    public static void main(String[] args) {

        //Corrected code

                int num = 0;
                do {
                    System.out.println(num);
                    num++;
                } while (num < 0); // Ensures only one execution
            }
        }
        
       // Error code
        //int num = 0;//num = 0,1
      /*   do {
        System.out.println(num);//0 1
        num++;//1 2
        } while (num > 0);//  */
        
        // Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile`
       // loop?

       //The reason the loop executes only once is due to the incorrect condition in the while statement: