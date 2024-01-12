import java.util.Scanner;
class StudentDetails
{
	int id;
	String name;
	int mark;

	public void setId(int id)
	{
		this.id =id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMark(int mark)
	{
		this.mark=mark;
	}
	public int getMark()
	{
		return mark;
	}


	public String toString()
	{
		return id+" \t"+name+" \t"+mark;
	}

	public  void studentDet(StudentDetails... details)
	{
		for(StudentDetails d:details)
		{
    			System.out.println(d);
		}
	}	
	
	
}
