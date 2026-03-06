import java.util.*;
public class Even_odd
{
public static void main(String x[])
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int a=sc.nextInt();
	
	
	String msg=a%2==0?"Even":"Odd";
	System.out.println(msg);
}
}