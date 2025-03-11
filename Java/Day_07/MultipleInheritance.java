class A{
void msg(){
System.out.println("A: method of class");
}
}

class B{
void msg(){
System.out.println("B: method of class");
}
}

class C extends A,B{
void msg(){
System.out.println("B: method of class");
}
}

// Driver class
class MultipleInheritance
{
	public static void main(String[]args){
		C c1 = new C();
		c1.msg(); // Compliler Error
		
	}
}