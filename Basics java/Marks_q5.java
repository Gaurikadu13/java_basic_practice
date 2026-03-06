import java.util.*;
public class Marks_q5{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter marks ");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int m4=sc.nextInt();
int m5=sc.nextInt();

int total=m1+m2+m3+m4+m5;
float per=total/5;
System.out.println("Total marks are "+total+" and percentage is "+per+"%");
}
}