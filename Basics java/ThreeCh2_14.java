import java.util.*;
public class ThreeSmCh2_14
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number : ");
int n1=sc.nextInt();
System.out.println("Enter 2nd number : ");
int n2=sc.nextInt();
System.out.println("Enter 3rd number : ");
int n3=sc.nextInt();
if(n1<n2 && n1<n3)
{
System.out.println(n1+" is small");
}
else if(n2<n1 && n2<n3)
{
System.out.println(n2+" is small");
}
else{
System.out.println(n3+" is small");
}
}
}