 class Employee{
 
 //Instance variable
 int i;
 String name; 
 
 // Default constructor
 Employee(){
 this.i=100;
 this.name="unkown";
 System.out.println("Default");
 }
 
 // Parameterized constructor
Employee(int i,String name){
this.i=i;
this.name=name;
 System.out.println("Parameterized");
 }
 
 
 void data(String name,int i)
 {
 this.i=101;
 this.name="Rohini";

 }
 
 
 static void data1(String name,int i)
 {
 i=i;
 name=name;
 }
 
 
 void data2(String name,int i)
 {
 this.i=102;
 this.name="Amrita";
 }
 
   public static void main(String[]args){
   Employee e=new Employee();
    Employee e=new Employee(101,"Rohan");
	Employee.data1(103,"hjkdff")
 }