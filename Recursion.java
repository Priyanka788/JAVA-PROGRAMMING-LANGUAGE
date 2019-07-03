class Recursion1
{
 int num(int a)
 {
    if(a>1)
	  {
		   System.out.println(a);
	       return(num(a-1));
       }
    else
      {
		   System.out.println(a);
	    return 1;
		}
  }
}
public class Recursion
{
    public static void main(String args[])
	{
        Recursion1 R1 =new Recursion1();  
	     R1.num(10);
	}
}	
	