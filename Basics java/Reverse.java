import java.util.*;
public class Reverse
{ 
public static void main(String x[])
{
System.out.println("Enter number : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int rev=0;
	int digit=0;
	int sum=0;  
	
	System.out.println("Given Number is a="+n);
	
	
	//short method
	//n=(n%10)*100+((n/10)%10)*10+n/100;
	//System.out.println(n);
	
	//method 2
	while(n!=0)
	{
		digit=n%10;
		rev=rev*10+digit;
		sum=sum+digit;
		n=n/10;
	}
	System.out.println("Reverse : "+rev);
	System.out.println("Sum : "+sum);
	System.out.println(n);
}
}