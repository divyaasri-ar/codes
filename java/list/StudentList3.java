import java.util.*;

public class StudentList {
public static void main(String[] args) {
List data = new ArrayList<>();
data.add(new Student(1, "divya", 85));
data.add(new Student(4, "swetha", 76));
data.add(new Student(2, "abi", 74));
data.add(new Student(3, "jana", 90));
data.add(new Student(8, "nivi", 97));
data.add(new Student(7, "darshini", 85));
data.add(new Student(1, "divya", 85));
data.add(new Student(9, "varshini", 83));
data.add(new Student(10, "priya", 71));

// Using HashSet to remove duplicates based on student ID
Set uniqueStudents = new HashSet<>(data);
List uniqueStudentList = new ArrayList<>(uniqueStudents);

// Printing unique student list
uniqueStudentList.forEach(System.out::println);

System.out.println("1. Sort the name by ascending order");
System.out.println("2. Sort the marks by descending order");
System.out.println("3. Exit");

Scanner sc = new Scanner(System.in);
int choice = sc.nextInt();

switch (choice) {
case 1: {
uniqueStudentList.sort(new Comparator<Student>() {
public int compare(Student s1, Student s2) {
return s1.getSName().compareTo(s2.getSName());
}
});
uniqueStudentList.forEach(System.out::println);
break;
}
case 2: {
uniqueStudentList.sort(new Comparator<Student>() {
public int compare(Student s1, Student s2) {
return Integer.compare(s2.getMarks(), s1.getMarks());
}
});
uniqueStudentList.forEach(System.out::println);
break;
}
default:
System.out.println("Invalid choice.");
}
}
}