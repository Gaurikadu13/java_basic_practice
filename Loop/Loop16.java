import java.util.*;
//input number and power calculate result
public class Loop16
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a base and power");
int b=sc.nextInt();
int p=sc.nextInt();
int i=1,r=1;
while(i<=p)
{
r=r*b;
i++;
}
System.out.println("Result is "+r);
}
}
