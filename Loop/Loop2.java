import java.util.*;
//print all natural numbers in reverse (from n to 1)
public class Loop2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int i=n;
while(i>=1)
{System.out.print(i+" ");
i--;
}
}
}
