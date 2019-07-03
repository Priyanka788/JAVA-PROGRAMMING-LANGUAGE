class A
{
   int l,b,h;
  public void setDimension(int l,int b)
   {
   this.l=l;
   this.b=b;
   this.h=h;
   }
}
  public void showDimension()
    {
	System.out.println(l);
	System.out.println(b);
	System.out.println(h);
    }
}
 public class This
 {
 public static void main(String args[])
 {
  A obj=new A();
  System.out.println(obj);
  obj.setDimension(3,4,9);
  obj.showDimension();
  }
  }
