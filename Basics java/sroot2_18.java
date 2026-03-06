import java.util.*;
public class sroot2_18
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number : ");
int n=sc.nextInt();
int r=(int)Math.sqrt(n);

if(r*r==n)
{
System.out.println("Perfect Square");
}
else
{
System.out.println("Not perfect Square");
}
}
}