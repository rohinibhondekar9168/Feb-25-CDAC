class StringDemo{
	
	public static void main(String[]args){
		String s1 = "ABC";//String literals (sTRING POOL)
		String s2 = "ABC";
		String s3 = "ABCD";
		String s4 = "ABCD";
		
		//== will compare reference content
		//and not the object content (values)
		System.out.println((s1==s2)); // t
			System.out.println((s3==s4)); //t
				System.out.println((s1==s3)); //f
				
				String s5 = new String("ABC");
						String s6 = new String("ABCD");
						
						System.out.println((s5==s6)); //FALSE
						System.out.println((s3==s6));// FALSE (IN HEAP)
						
						System.out.println((s1==s3));
						
						
						System.out.println((s1.equals(s5)));//T
		                System.out.println((s5.equals(s6)));//F
						
				
					
		
		
		
		
	}
}