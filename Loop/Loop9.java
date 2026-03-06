import java.util.*;
//multiplication table of any number.
public class Loop9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
System.out.println("Table of "+n);
for(int i=1;i<=10;i++)
{
	System.out.println(n+" * "+i+" = "+(n*i));
}
}
}