public class Box
{
int l;
int b;
int h;
void setdimension(int length,int breadth,int height)
{
 l=length;
 b=breadth;
 h=height;
}
void showdimension()
{
System.out.println("legth of box is "+l);
System.out.println("breadth of box is "+b);
System.out.println("height of bow is "+h);
}
public static void main(String args[])
{
 Box smallbox=new Box();
 smallbox.setdimension(5,6,9);
 smallbox.showdimension();
 smallbox =new Box();
 smallbox.showdimension();
}
} 