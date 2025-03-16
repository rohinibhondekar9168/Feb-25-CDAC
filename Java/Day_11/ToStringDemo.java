class ToStringDemo{
String name;
int id;


ToStringDemo(String name,int id)
{
this.name=name;
this.id=id;
}

@Override // done overriding with toString() of object class
public String toString(){
return name+ " "+id;//return string values of id and name
}

	public static void main(String[]args){
	ToStringDemo t1 = new ToStringDemo("Rohini",101);
		System.out.println(t1);// By default toString method is called
		
		}
		}
		
	