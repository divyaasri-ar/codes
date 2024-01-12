//variable argument
class Calculator
{
	public void add(int... num)
	{
		int sum=0;
		for (int n : num)
		{
			sum+=n;
		}
		System.out.println("Sum of" +num.length+"is" +sum);
	}
	public static void main(String args[])
	{
		Calculator c= new Calculator();
		c.add(10,20);
		c.add(10,20,30);
		c.add(10,30,50,80,100);
	}
}
