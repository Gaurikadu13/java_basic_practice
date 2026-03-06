import java.util.*;
public class Duck
//Using flag
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int no=sc.nextInt();
int rem=0;
while(no!=0)
{
rem=no%10;
no=no/10;
}
if(rem==0)
{
System.out.println("No is duck");
}
else
{
System.out.println("No is not duck");
}
}

}

