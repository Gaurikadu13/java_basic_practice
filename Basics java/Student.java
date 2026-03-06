import java.util.*;

public class Student
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	int n=sc.nextInt();
	int fact=1;
	int i=1;
	while(n>=i)
	{	fact=fact*i;
		i++;
	}
	
}
}