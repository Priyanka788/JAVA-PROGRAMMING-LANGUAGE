public class ConstS
{
 private int x;
 static
 {
 System.out.println(x);
  x=5;
 } 
 void static fn()
 {
  System.out.println("Constructor start");
    //System.out.println(x);
  }
 void  Test1()
  {
	  System.out.println("Constructor"+x);
  }	  
 
public static void main(String args[])
{
  ConstS.fn();
}
}   