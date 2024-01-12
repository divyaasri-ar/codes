class ExceptionDemo
{
	public static void main(String a[])
	{
		int result=0;
		int arr[]=new int[5];
		try
		{
			result=10/0;
			arr[5]=10;
			System.out.println(Integer.parseInt("123"));
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println(result);
	}
}