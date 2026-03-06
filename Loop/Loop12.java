import java.util.*;
//product of digits in a number
public class Loop12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int n=sc.nextInt();
int pro=1,l=0;
System.out.print("Product of "+n);

while(n!=0)
{
l=n%10;
n=n/10;
pro=l*pro;
}
System.out.println(" is "+pro);
}
}