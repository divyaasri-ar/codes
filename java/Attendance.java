class Attendance
{
	void markAttendance()
	{
		System.out.println("Mass Bunk");
	}
	void markAttendance(String... s)
	{
		System.out.println(s.length +" Student present");
		for(String name : s)
		{
			System.out.println(name);
		}
	}
	public static void main(String args[])
	{
		Attendance a= new Attendance();
		a.markAttendance();
		a.markAttendance("abi","anu","adhi");
	}
}