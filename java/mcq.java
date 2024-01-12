import java.util.Scanner;
class mcq
{
	public static void main(String a[])
	{
		//int option;
		char q='"';
		Scanner sc= new Scanner(System.in);
		System.out.println("1. Number of primitive data types in Java are?");
		System.out.println("\nA. 6\nB. 7\nC. 8\nD. 9");
		String answer1= sc.next();

		System.out.println("2. Find the output of the following code.");
		System.out.println("int Integer = 24;\nchar String  = "+q+"I"+q+";\nSystem.out.print(Integer);\nSystem.out.print(String);?");
		System.out.println("\nA. Compiler Error\nB. Throws Exception\nC. I\nD. 24I");
		String answer2= sc.next();

		System.out.println("3. Automatic type conversion is possible in which of the possible cases?");
		System.out.println("\nA. Byte to int \nB. Int to long\nC. Long to int\nD. Short to int");
		String answer3= sc.next();

		System.out.println("4. What is the size of float and double in java?");
		System.out.println("\nA. 32 and 64\nB. 32 and 32\nC. 64 and 32\nD. 64 and 64");
		String answer4= sc.next();

		System.out.println("5. Select the valid statement.");
		System.out.println("\nA. char[] ch=new char(5)\nB. char[] ch=new char[5]\nC. char[] ch=new char()\nD. char ch=new char[]");
		String answer5= sc.next();
	
		System.out.println("6. Arrays in java are-");
		System.out.println("\nA. Object references \nB. object\nC. primitive data type\nD. None");
		String answer6= sc.next();
		
		System.out.println("7. _____ is used to find and fix bugs in the Java programs.");
		System.out.println("\nA. JVM \nB. JRE\nC. JDK\nD. JDB");
		String answer7= sc.next();

		System.out.println("8. What is the return type of the hashCode() method in the Object class?");
		System.out.println("\nA. Object \nB. int\nC. long\nD. void");
		String answer8= sc.next();

		System.out.println("9. What does the expression float a = 35 / 0 return?");
		System.out.println("\nA. 0 \nB. Not a Number\nC. Infinity\nD. Run time Exception");
		String answer9= sc.next();

		System.out.println("10. Evaluate the following Java expression, if x=3, y=5, and z=10:");
		System.out.println("++z + y - y + z + x++");
		System.out.println("\nA. 24 \nB. 23\nC. 20\nD. 25");
		String answer10= sc.next();
	}
}

		