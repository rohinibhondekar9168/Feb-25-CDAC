class ExceptionDemo4{
	public static void main(String[] args) {
		System.out.println("Execution started");
		
		String s1 = "12";
		String s2 = "0";
		
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		
		try
		{
			int result = i/j;
			System.out.println("Can be excuted: " +result);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by zero");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Given integer number");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Use array elements");
		}
		
		System.out.println("Excution completed");
	}
}