final class FinalL              // we can also make the object of final class 
{

  public void fn()
 {
	final int x=5;            // also do if we canot give the value show error.
	//x=x+1;                 //error
    System.out.println(x);
 }
public static void main(String args[])
{
 FinalL obj=new FinalL();
 obj.fn();
  }
  }