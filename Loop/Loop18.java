import java.util.*;
//to find 1st abd lst digit from no
public class Loop18
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();

int ld=n%10;

while(n>=10)
{
n=n/10;
}
System.out.println("1st and lst digit are "+n+" and "+ld);
}
}
