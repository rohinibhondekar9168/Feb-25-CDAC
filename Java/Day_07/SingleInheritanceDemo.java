class Employee{
	
	float salary = 40000; // Parent class
}

class Programmer extends Employee{
	int bonus = 1000; // child class
	
}
class SingleInhritanceDemo{
		public static void main(String[]args){

 
Programmer e1 = new Programmer();  
 System.out.println("Sal=" +e1.salary);
  System.out.println("bonus=" +e1.bonus);			
}
}

