import java.util.*;
public class CSp2_7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter CP : ");
int cp=sc.nextInt();
System.out.println("Enter SP : ");
int sp=sc.nextInt();

if(cp<sp)
{
System.out.println("Profit :"+(cp-sp));
}
else if(cp>sp)
{
System.out.println("Loss :"+(sp-cp));
}
else{
System.out.println("No loss no prfit");
}
}
}