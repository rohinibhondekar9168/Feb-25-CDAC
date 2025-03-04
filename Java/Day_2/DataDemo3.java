class DataDemo3
{
public static void main(String[]args){
	
	// SHORT : 2 byte -16bit (-32768 to 32767)
//short s = 22767; // 22767 within range

//short s = -32768; // -32768 within range

//short s = -123.45; //  error: incompatible types: possible lossy conversion from double to short

//short s = true; // error: incompatible types: boolean cannot be converted to short

//long l = 123000 * 60 * 60 *24*10000; //1624195072

//float floatvalue=3.14234567f; //3.1423457

//double d=3.1456775434745d; //3.1456775434745

//double d=3.14567754347456578987876678899995544d;//3.145677543474566 : output given within limit & round off

//boolean b=True; //  error: cannot find symbol
//boolean b=0; // error: incompatible types: int cannot be converted to boolean
boolean b="false"; //error: incompatible types: String cannot be converted to boolean
System.out.println(b); 
}
}