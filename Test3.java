public class Test3
{
 static int count=0;
 
 Test3()
 { 
   count++;
 }
  public static void main(String args[])
  {
      Test3 T1=new Test3();
	  Test3 T2=new Test3();
	  
	  
	 System.out.println("Total " +count+" objest created");
  }
 }  