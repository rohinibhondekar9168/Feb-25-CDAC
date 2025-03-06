class Employee{
	//Instance variable
	int empId;
	String empName;
	

// Instance method
void set (int id,String name){ 
	empId=id;
	empName=name;
}
void show(){
System.out.println(empId+" "+empName);
}
}
//Device Driver
class EmployeeDemo2
{
	public static void main(String[]args){
		Employee e1 = new Employee();
		e1.set(111,"Rohini");
		e1.show(); // 111 Rohini
		
		e1.set(222,"Khushal");
		e1.show();
		  
		
	}
	
}