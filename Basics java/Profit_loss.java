import java.util.*;
public class Profit_loss
{
public static void main(String x[])
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Selling price : ");
	int sp=sc.nextInt();
	System.out.println("Enter Cost price : ");
	int cp=sc.nextInt();
	
	String msg=sp>cp?"Profit":"Loss";
	System.out.println(msg);
}
}