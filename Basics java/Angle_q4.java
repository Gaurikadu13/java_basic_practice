import java.util.*;
public class Angle_q4{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the 1st angle : "); 
int a1=sc.nextInt();
System.out.print("Enter the 2nd angle : "); 
int a2=sc.nextInt();

int a3=(180-a1-a2);
System.out.println("3rd angle is "+a3);
}
}