class pjj
{
int f1;
int f2;
int i1;
int i2;
public void getdata(int a,int b,int c,int d)
{
f1=a;
f2=b;
i1=c;
i2=d;
System.out.println("Enter first distances in feet or inches");
System.out.println("Enter first feet = "+f1);
System.out.println("Enter first inches = "+i1);
System.out.println("Enter second feet = "+f2);
System.out.println("Enter second inches = "+i2);
}
void show()
{
 int inches =i1+i2;
 int feet=(f1+f2+(inches/12));
  inches=inches%12;
System.out.println("The total distance is :");
System.out.println("The total of feet is = "+feet+" , The total of inches is = "+inches);
System.out.println("The total of inches is = "+inches);
}
}
public class Main6
{
public static void main(String args[])
{
  pjj p=new pjj();
  p.getdata(20,20,10,10);
  p.show();
}
}  
