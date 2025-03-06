class Employee{
	//Instance variable
	private int empId;
	 private String empName;
	 private static int total;// static variable
	

// Instance method
void set (int id,String name,int t){ 
	empId=id;
	empName=name;
	total=t;
}
//Static method
static void add(int a, int b)
{
	System.out.println(a+b);//5
}
void show(){
System.out.println(empId+" "+empName+" "+total);
}
}
//Device Driver
class EmployeeDemo3
{
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.set(111,"Rohini",11);
		e1.show(); // 111 Rohini
		
		e1.set(222,"Khushal",12); 
		e1.show(); // 222 Khushal 
		
		// Output:
		// 111 Rohini 11
       //  222 Khushal 12
		  
		  //Static variable
		  Employee.add(2,3);//5
		  Employee.add(5,7);//12
		  Employee.add(14,3);//17
		
	}
	
}