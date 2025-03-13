class StringDemo2{
	
	public static void main(String[]args){
	/*
	String s1 = "Cat";
	String s2 = "Can";
	
	
	int result = s1.compareTo(s2);
	
	System.out.println(result);//6    */
	
	StringBuffer sb = new StringBuffer("Hello");
	System.out.println(sb);//Hello
	sb.append("Rohini");
	System.out.println(sb);//HelloRohini
	
		StringBuilder sb1 = new StringBuilder("Java");
	System.out.println(sb1);//Java
	sb1.append("Rocks");
	System.out.println(sb1);//JavaRocks
	
	}
	}