class Area
{
float r;
float x=3.14f;
void getdata(float a)
{
 r=a;
 System.out.println("The radius of circle is "+r);
}
void showarea()
{
 float area=x*r*r;
 System.out.println("Area of circle is = "+area);
}
}
class Parimeter
{
 float r;
 float x=3.14f;
 void getdata(float a)
 { 
  r=a;
  System.out.println("The radius of circle is "+r);
 }
void showparimeter()
{
	float area=2*x*r;
    System.out.println("Parimeter of circle is = "+area);
}
}
public class Main1
{
  public static void main(String args[])
{ 
   Area A=new Area();
   A.getdata(10);
   A.showarea();
   Parimeter P=new Parimeter();
   P.getdata(20);
   P.showparimeter();
}
}   