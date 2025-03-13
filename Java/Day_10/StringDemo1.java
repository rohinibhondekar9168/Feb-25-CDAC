class StringDemo1{
	
	public static void main(String[]args){
	
	String s1 = "Hello";
	System.out.println("Length : " + s1.length()); // 5
	System.out.println( s1.charAt(1));// e
	System.out.println( s1.substring(0,3));//Hel skip last character
	System.out.println(s1.contains("Hen"));//f
	System.out.println(s1.contains("He"));//t
	System.out.println(s1.indexOf("l"));//2
	System.out.println(s1.toLowerCase());//hello
	System.out.println(s1.toUpperCase());//HELLO
	System.out.println(s1.replace('H','P'));
		
	
	}
	}