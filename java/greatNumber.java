import java.util.Scanner;
class Greatest
{
int largest;
void findLargest()
{
int[] a=new int[5];
System.out.println("Enter the number of elements:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Enter the elements of the array: ");  
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println(" Array elements are:");
for(int i=0;i<=n;i++)
{
System.out.println(a[i]);
}
largest=a[0];
for(int i=1;i<n;i++)
{
if (a[i]>largest)
{
largest=a[i+1];
}
}
System.out.println("The greatest number is:"+largest);
}
}
public class GreatNumber
{
public static void main(String args[])
{
greatest g=new greatest();
g.findLargest();
}
}