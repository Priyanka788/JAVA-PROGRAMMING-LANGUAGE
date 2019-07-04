class TestMultiNaming1 extends Thread
{
   public void run()
    {
	  System.out.println("Running...................");
	}
	public static void main(String args[])
	 {
	    TestMultiNaming1 t1=new TestMultiNaming1();
		TestMultiNaming1 t2=new TestMultiNaming1();
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Name of t2: "+t2.getName());
	   t1.setName("abc");
	   t2.setName("xyz");
	   System.out.println("After changing Name of t1: "+t1.getName());
	   System.out.println("After changing Name of t1: "+t2.getName());
	 }
}	 