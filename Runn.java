class A implements Runnable
{
     public void run()
	    {
	      System.out.println("THread A is running");
		  
	    }
}
class B implements Runnable
{
     public void run()
	    {
	      System.out.println("THread B is running");
		  
	    }
}
 class Runn
{
  public static void main(String args[])
    {
        Thread t1=new Thread(new A());	
        Thread t2=new Thread(new B());
		 t1.start();
		 t2.start();
	}
}	