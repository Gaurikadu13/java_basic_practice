import java.util.*;
public class ScanApp
{
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name, id and salary ");
	String name=sc.nextLine();
	int id=sc.nextInt();
	long salary=sc.nextLong();
	
	
	System.out.println("Name : "+name);
	System.out.println("ID : "+id);
	System.out.println("Salary : "+salary);
}
}