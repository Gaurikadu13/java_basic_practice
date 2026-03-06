import java.util.*;
//to calculate factor of a number
public class Loop17
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
System.out.print("Factors: ");
int i=1;
while(i<=n)
{
if(n%i==0)
{
System.out.print(i+" ");
}

i++;
}
}
}
