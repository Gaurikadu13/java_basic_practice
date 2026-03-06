import java.util.*;
public class day_q9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter Day ");
int day=sc.nextInt();

int yr=day/365;
int  rd=day%365;
int m=rd/30;
 rd=rd%30;
System.out.println("It's "+yr+" year "+m+" months "+rd+" days");
}
}