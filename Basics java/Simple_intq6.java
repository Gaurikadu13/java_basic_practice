import java.util.*;
public class Simple_intq6{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter principal amount : ");
float p=sc.nextFloat();

System.out.print("Enter Rate :"); 
float r=sc.nextFloat();

System.out.print("Enter time :"); 
float t=sc.nextFloat();

float si=(p*r*t)/100;

System.out.println("Simple interest is "+si);
}
}