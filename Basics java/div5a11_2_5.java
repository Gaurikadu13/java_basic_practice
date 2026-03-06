import java.util.*;
public class div5a11_2_5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number : ");
int n=sc.nextInt();

if(n%5==0 && n%11==0)
{
System.out.println(n+" is divisible by 5 and 11 both");
}
else
{
System.out.println(n+" is not divisible by 5 and 11");
}
}
}