import java.util.*;
public class Neon2_18
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number : ");
int n=sc.nextInt();
int sum=0;
int sqr=n*n;
int sqr1=sqr/10;
int sqr2=sqr%10;
 sum=sqr1+sqr2;
if(sum==n)
{
System.out.println("Noen number");
}
else
{
System.out.println(" not Noen number");
}
}
}