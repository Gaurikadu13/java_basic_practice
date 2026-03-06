import java.util.*;
public class Case2_21
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter aphabet : ");
char ch=sc.next().charAt(0);
if(ch>=65 && ch<=90)
{System.out.println("Uppercase");
}
else
{
System.out.println("LowerCase");
}
}
}
