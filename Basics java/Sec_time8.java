import java.util.*;
public class Sec_time8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter Time in sec : ");
int s=sc.nextInt();

int h=s/3600;
int rs=s%3600;
int m=rs/60;
 s=rs%60;

System.out.println("It's "+h+"hr "+m+"min "+s+" sec");
}
}