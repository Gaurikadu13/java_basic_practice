import java.util.*;
//enter a number and check palindrom or not
public class Loop14
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int n=sc.nextInt();
int rev=0,rem=0;
System.out.print("Reverse of "+n);
int p=n;
while(n!=0)
{
rem=n%10;
n=n/10;
rev=rev*10+rem;

}
System.out.println(" is "+rev);

if(rev ==p)
{System.out.println("Palindrom");
}
else
{System.out.println("not Palindrom");
}
}
}