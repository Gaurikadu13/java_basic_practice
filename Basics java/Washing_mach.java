import java.util.*;
public class Washing_mach
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter weight of cloths : ");
int w=sc.nextInt();

if(w>=1 && w<=2000)
{
System.out.println("Time Estimate : 25 mins");
}
else if(w>=2001 && w<=4000)
{
System.out.println("Time Estimate : 35 mins");
}
else if(w>=4001 && w<=7000)
{
System.out.println("Time Estimate : 45 mins");
}
else if(w>7000)
{
System.out.println("Overloaded");
}
else if(w==0)
{
System.out.println("Time estimate : 0 mins");
}
else
{
System.out.println("Invalid input");
}
}
}