public class BillApp
{
	public static void main(String x[])
	{
	int qty=Integer.parseInt(x[0]);
	int rate=Integer.parseInt(x[1]);
	int gstAmt=(qty*rate)*18/100;
	int total=(qty*rate)+gstAmt;
	
	System.out.println("Total bill is "+total);
	}
}