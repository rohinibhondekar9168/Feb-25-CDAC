class Animal{
	void eat(){
		System.out.println("Parent class: Eat");
	}
	
}
class Dog extends Animal{
	void bark(){
	System.out.println("child class: bark");
	
}
}
class Cat extends Animal
{ 
void sound(){
	System.out.println("child class2: sound");
	
}
}

class HierarchicalInheritance
{
	public static void main(String[]args){
		
		Cat c1= new Cat();
		c1.eat();
		c1.sound();
		
		Dog c2 = new Dog();
		c2.eat();
		c2.bark();
}
}