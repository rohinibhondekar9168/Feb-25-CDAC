// using wrapper classes convert string into int,float,double
public class Program2 {
        public static void main(String[] args) {
         // System.out.println("Result : "+ (10 + 20));

         String str="125";
         int num1=Integer.parseInt(str);
         System.out.println("Num1 : "+num1);

        str="3.14f";
        float num2=Float.parseFloat(str);
        System.out.println("Num2 : "+num2);

        str="12d";
        double num3=Double.parseDouble(str);
        System.out.println("Num3 : "+num3);

       // str="Hello World"; //string can not convert into integer
        //int number=Integer.parseInt(str);
        //System.out.println(number);
        //Output:NumberFormatException

        str="Sunbeam";
        char ch=str.charAt(3);
        System.out.println("Character : "+ch);
        
        int num5=10;
        String strNumber=Integer.toString(num5);//covert int into string using toString function
        System.out.println(strNumber); //10


        }
}
