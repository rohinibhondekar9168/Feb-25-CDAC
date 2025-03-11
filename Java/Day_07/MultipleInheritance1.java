interface A{
default void msgA(){
System.out.println("A: method of class");
}
}

interface B{
default void msgB(){
System.out.println("B: method of class");
}
}

class C implements A,B{
public void msgC(){
System.out.println("C: method of class");
}
}

// Driver class
class MultipleInheritance1
{
	public static void main(String[]args){
		C c1 = new C();
		c1.msgA(); 
		c1.msgB(); 
		c1.msgC(); 
		
	}
}