class Car
{
	String model="XYZ";
	static String engineNo="123456";
	static class Engine
	{
		void carDetails()
		{
			Car c=new Car();
			System.out.println("Car model is: "+c.model);
			System.out.println("Car engine name is: "+engineNo);
		}
	}
}
public class MainStatic
{
	public static void main(String a[])
	{
		Car.Engine e= new Car.Engine();
		e.carDetails();
	}
}