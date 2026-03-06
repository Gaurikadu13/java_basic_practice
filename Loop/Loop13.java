import java.util.*;
//enter a number and print its reverse
public class Loop13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int n=sc.nextInt();
int rev=0,rem=0;
System.out.print("Reverse of "+n);

while(n!=0)
{
rem=n%10;
n=n/10;
rev=rev*10+rem;
}
System.out.println(" is "+rev);
}
}