class A
{
   int x,y;
 A(int l,int b)
   {
    x=l;
   y=b;
   //this.h=h;
   }
  public void showDimension()
    {
	System.out.println(x);
	System.out.println(y);
	//System.out.println(h);
    }
}
class B extends A
{
	int h;
	B(int l,int b,int z)
	{
		super(l,b);
		h=z;
	}
	public void showDimension()
    {
		super.showDimension();
	//System.out.println(l);
	//System.out.println(b);
	System.out.println(h);
    }
}	
 public class Super
 {
 public static void main(String args[])
 {
  B obj=new B(3,4,5);
  System.out.println(obj);
  obj.showDimension();
  }
 }
