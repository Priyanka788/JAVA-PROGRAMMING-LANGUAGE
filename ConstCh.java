class A
{
   int x,y;
 A()
{
  System.out.println("Class A");
}  
   
 A(int l,int b)
   {
	   this();
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
	B()
	{
		//super();
		this(12,3,4);
	System.out.println("Class B");
	}
	
	B(int l,int b,int z)
	{
		
		super(l,b);
		//System.out.println(l);
		
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
 public class ConstCh
 {
 public static void main(String args[])
 {
  B obj=new B();
  //System.out.println(obj);
  obj.showDimension();
  }
 }
