// MultilevelInheritance Example
class Animal{
int id = 5;
	void display(){
		 System.out.println("Parent class");
	}
	
}
	
	
	class Dog extends Animal{
		int cid = 6;
		void childdisplay(){
		 System.out.println("Child class : c1");
		
	}
	}
	class Babydog extends Dog{
		int bcid = 7;
		void babydisplay(){
		 System.out.println("Babydog class");
	}
	}
	
	
	
class MultilevelInheritanceDemo1{
	public static void main(String[]args){
		Babydog b = new Babydog();
		
		//method access from parent class
		b.babydisplay();
		b.childdisplay();
		b.display();
		
		// Access instance variable  from parent classes
		 System.out.println(b.id);
		  System.out.println(b.cid);
		    System.out.println(b.bcid);
		
}
}