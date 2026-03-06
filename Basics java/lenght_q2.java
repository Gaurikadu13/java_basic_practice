import java.util.*;
public class lenght_q2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter length in cm : ");
double cm=sc.nextInt();

double m=cm/100;
double km=cm/100000;

System.out.println("Lenght in meter is "+m);
System.out.println("Lenght in kilometer is "+km);
}
}