import java.util.*;
public class compound_int7{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter principal amount : ");
float p=sc.nextFloat();

System.out.print("Enter Rate :"); 
float r=sc.nextFloat();

System.out.print("Enter time :"); 
int t=sc.nextInt();

float a=p(1+r/100)^t;
a=a^t;
float ci=a-p;
System.out.println("Compund interest is "+ci);

}
}
