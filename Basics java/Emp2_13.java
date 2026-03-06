import java.util.*;
public class Emp2_13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter salary of employee : ");
int s=sc.nextInt();
float hra=0;
float da=0;
	if(s<=10000)
	{
	hra=s*20/100;
	da=s*80/100;
	}
	else if(s<=20000)
	{
	hra=s*25/100;
	da=s*90/100;
	}
	else if(s>20000)
	{
	hra=s*25/100;
	da=s*90/100;
	}
	float gs=s+hra+da;
	System.out.println("Basic salary: "+s);
	System.out.println("HRA "+hra);
	System.out.println("DA "+da);
	System.out.println("Gross salary is "+gs);
	
}
}
