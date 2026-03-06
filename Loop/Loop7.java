import java.util.*;
//sum of all even numbers between 1 to n.
public class Loop7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
if(i%2==0)
{
sum=sum+i;
}
}
System.out.println("sum is "+sum);
}
}