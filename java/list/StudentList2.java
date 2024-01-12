import java.util.*;
public class StudentLst
{
	public static void main(String[] args)
	{
		List data= new ArrayList<>();
		
		data.add(new Student(1,"divya",85));
		data.add(new Student(4,"swetha",76));
		data.add(new Student(2,"abi",74));
		data.add(new Student(3,"jana",90));
		data.add(new Student(8,"nivi",97));
		data.add(new Student(7,"darshini",78));
		data.add(new Student(1,"divya",85));
		data.add(new Student(9,"varshini",83));
		data.add(new Student(10,"priya",71));

		Set<Student> uniqueStudents = new HashSet<>(data);
		List<Student> newdata = new ArrayList<>(uniqueStudents);
		
			
		newdata.forEach(System.out::println);
		
		System.out.println("1.Sort the name by ascending order");
		System.out.println("\n2. Sort the marks by descending order");
		System.out.println("\n3. Exit");
		Scanner sc= new Scanner(System.in);
		int choice =sc.nextInt();
	
		switch(choice)
		{
		case 1:
		{
			newdata.sort(new Comparator<Student>()
			{
				public int compare(Student s1,Student s2)
				{	
					if(s1.getSName().compareTo(s2.getSName())<0)
					{
						return -1;
					}
					else if(s1.getSName().compareTo(s2.getSName())>0)
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}		
			});
			newdata.forEach(System.out::println);
			break;
		}
		
		case 2:
		{
			newdata.sort(new Comparator<Student>()
			{
				public int compare(Student s1,Student s2)
				{	
					if(s1.getMarks() < s2.getMarks())
					{
						return 1;
					}
					else if(s1.getMarks() > s2.getMarks())
					{
						return -1;
					}
					else
					{
						return 0;
					}
				}		
			});
			newdata.forEach(System.out::println);
			break;
		}
		}
	

	}
}