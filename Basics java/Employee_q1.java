import java.util.*;

public class Employee_q1{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your salary : ");
long bs=sc.nextLong();

 double da=0.30*bs;
 double hra=0.30*bs;
 double total=bs+da+hra;

System.out.println("DA is "+da);
System.out.println("HRA is "+hra);
System.out.println("Total is "+total);
}
}