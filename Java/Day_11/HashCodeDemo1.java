class HashCodeDemo1{
String name;
int id;


HashCodeDemo1(String name,int id)
{
this.name=name;
this.id=id;
}

@Override 
public int hashCode(){
return id; //using id as a unquie hash code must be return
}

	public static void main(String[]args){
     HashCodeDemo1 t1 = new  HashCodeDemo1("Rohini",101);
		System.out.println(t1.hashCode());// 
		
		}
		}
		