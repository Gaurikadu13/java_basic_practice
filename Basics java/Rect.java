//practic of setter getter
//sovling without setter getter
public class Rect{
private int l;
private int b;

public void setL(int l){
this.l=l;
}
public int getL(){
return l;
}
public void setB(int b){
this.b=b;
}
public int getB(){
return b;
}
public void area()
{
	float a=l*b;
	System.out.println("area is "+a);
}
}
