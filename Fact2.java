class Fact1
{
  int fact=1;
  int num(int a)
  {
    if(a>0)
	 {
	     fact=fact*a;
   	     System.out.println(fact);
	     return(num(a-1));
     }
	else
	{
	 return 1;
	 }
   }
}
public class Fact2 
 {
   public static void main(String args[])
     {
         Fact1 F1=new Fact1();
          F1.num(5);
     }
  }	 