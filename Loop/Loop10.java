import java.util.*;
//count the number of digits in a number
public class Loop10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int n=sc.nextInt();
int count=0;
System.out.print("Number of digit in "+n);
while(n!=0)
{
n=n/10;
count++;
}
System.out.println(" are "+count);
}
}