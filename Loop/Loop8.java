import java.util.*;
//sum of all odd numbers between 1 to n
public class Loop8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i=i+2)
{
if(i%2!=0)
{
sum=sum+i;
}
}
System.out.println("sum is "+sum);
}
}