public class Q12 {
    public static void main(String[] args) {
        int n=4; // 4 rows
        int m=5; // 5 column
        
        //outer loop
        for(int i=1; i<=n; i++) 
        {
            //inner loop
         for(int j=1; j<=m; j++)
         {

            System.out.print("*");
        }
      
        System.out.println( );
    }
}
}

/* OUTPUT:
PS D:\CDAC\Core_Java1\Day_4\Pattern_Practice> javac Pattern.java
PS D:\CDAC\Core_Java1\Day_4\Pattern_Practice> java Pattern
*****
*****
*****
*****
***** */