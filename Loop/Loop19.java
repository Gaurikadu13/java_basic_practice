import java.util.*;
//to find 1st abd lst digit sum
public class Loop19
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int sum=0;
int ld=n%10;

while(n>=10)
{
n=n/10;
}
sum=n+ld;
System.out.println("1st and lst digit are "+n+" and "+ld+" and sum is "+sum);

}
}
