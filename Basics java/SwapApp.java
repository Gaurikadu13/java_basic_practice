import java.util.*;
public class SwapApp
{
public static void main(String x[])
{
	System.out.println("Enter number : ");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Before Swapping a="+a+" and b="+b);
	int temp;
	//using third variable
	//temp=a;
	//a=b;
	//b=temp;
	
	//1.without using third variable
	//a=a+b;
	//b=a-b;
	//a=a-b;
	
	//2.without using third variable
	//a=a*b;
	//b=a/b;
	//a=a/b;
	
	//bitwise operator
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("After Swapping a="+a+" and b="+b);
}
}