class ExceptionDemo2{
	public static void main(String[] args) {
		try{
			int a = 100;
			int result = a/0; //Exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by zero");
		}
		}
}