public class APAppp
{
public static void main(String args[])
{
char ch='A';

for(int i=1;i<=5;i++)
{
	int count=i;
for(int j=1;j<=9;j++){
	
if(j<=6-i||j>=4+i)
{
System.out.print("ch");
if(j<5)
{
ch++;	
}
else if(j>=5 && i>1)
{ch=ch+4;
ch=70-(count);
count--;
}
else{
}
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}

}