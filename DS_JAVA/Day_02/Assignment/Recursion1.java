class Recursion1{

static int i =1;
static void show(){
i++;
if(i<=5)
{
	System.out.println("Hi Rohini");
	show();
}
}
public static void main(String[] args){
show();
}
}