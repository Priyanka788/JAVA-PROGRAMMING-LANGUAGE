class A
{
   int x,y;
 void f1(int l,int b)
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
	void f2(int l,int b,int z)
	{
		super.f1(l,b);
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
 public class SuperF
 {
 public static void main(String args[])
 {
  B obj=new B();
  System.out.println(obj);
  obj.f2(3,4,5);
  obj.showDimension();
  }
 }
