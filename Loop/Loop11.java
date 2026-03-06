import java.util.*;
// sum of digits in a number
public class Loop11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int n=sc.nextInt();
int sum=0;
int l=0;
System.out.print("Sum of digit "+n);
while(n!=0)
{
l=n%10;
n=n/10;
sum=sum+l;
}
System.out.println(" is "+sum);
}
}