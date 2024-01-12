class Employee
{
int eid;
String eName;
int salary;
Employee()
{
eid=101;
eName="ABC";
salary=10000;
System.out.println(eid);
}
void displayEmployeeData()
{
System.out.println(eid);
System.out.println(eName);
System.out.println(salary);
}
}
public class Work
{
public static void main(String a[])
{

Employee e=new Employee();
e.displayEmployeeData();
}
}