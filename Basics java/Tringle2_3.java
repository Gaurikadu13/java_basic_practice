import java.util.*;
public class Tringle2_3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st side : ");
 int s1=sc.nextInt();
System.out.println("Enter 2nd side : ");
 int s2=sc.nextInt();
System.out.println("Enter 3rd side : ");
 int s3=sc.nextInt();
if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2)
{
	if(s1==s2 && s1==s3)
	System.out.println("Equilateral Tringle");
	else if(s1==s2 || s1==s3 || s2==s3)
	System.out.println("Isosceles Tringle");
	else
	System.out.println("Scelene Tringle");
}
else
	
{
System.out.println("Tringle is not valid");
}
}
}