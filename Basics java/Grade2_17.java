import java.util.*;
public class Grade2_17
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks : ");
int marks=sc.nextInt();

if(marks<=100 && marks>=90)
{
System.out.println("Excellent");
}
else if(marks<90 && marks>=75)
{
System.out.println("Good");
}
else if(marks<75 && marks>=50)
{
System.out.println("Average");
}
else
{
System.out.println("Poor");
}
}
}