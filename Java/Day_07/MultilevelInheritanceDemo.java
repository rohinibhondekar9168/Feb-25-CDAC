class Animal{

	void display(){
		 System.out.println("Parent class");
	}
	
}
	
	
	class Dog extends Animal{
		void childdisplay(){
		 System.out.println("Child class : c1");
		
	}
	}
	class Babydog extends Dog{
		void babydisplay(){
		 System.out.println("Babydog class");
	}
	}
	
	
	
class MultilevelInheritanceDemo{
	public static void main(String[]args){
		Babydog b = new Babydog();
		b.babydisplay();
		b.childdisplay();
		b.display();
		
		
}
}