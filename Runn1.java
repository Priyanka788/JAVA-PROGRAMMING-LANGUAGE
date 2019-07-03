class A extends Thread   //Thread create Thread by extending the thread class...
{
     public void run()
	    {
	      System.out.println("THread A is running");
		  
	    }
}
class B extends Thread
{
     public void run()
	    {
	      System.out.println("THread B is running");
		  
	    }
}
 class Runn1
{
  public static void main(String args[])
    {
         A  A1=new A();
		 B  B1=new B();
		 A1.start();
		 B1.start();
	}
}	