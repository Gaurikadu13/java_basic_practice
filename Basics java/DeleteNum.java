import java.util.*;
public class DeleteNum
{
public static void main(String x[])
{	
	System.out.println("Enter number : ");
	Scanner sc=new Scanner(System.in);
	//deleting last element
	int a=sc.nextInt();
	System.out.println("Given Number is a="+a);
	//a=a/10;
	//System.out.println("After deleting last number a="+a);
	
	//Extracting last element
	//a=a%10;
	//System.out.println("Extracting last number a="+a);
	
	//Extracting last 2 element
	a=a%100;
	System.out.println("Extracting last two number a="+a);
}
}