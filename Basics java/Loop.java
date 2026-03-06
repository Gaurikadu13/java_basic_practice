import java.util.*;
public class Loop
{
public static void main(String args[])
{
int base,index,p=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a base ");
base=sc.nextInt();
System.out.println("Enter a index ");
index=sc.nextInt();
while(index!=0)
{
	p=p*base;
	index--;
}
System.out.println("Power "+p);
}
}
