class Excetion1
{
public static void main(String args[])
{
 try
 {
 String s=null;
 System.out.println("String length ="+s.length());
 //System.out.println(" Arithematic Exception ="+3/0);
 }
 //catch(ArithmeticException e)
  catch(NullPointerException e)
 {
 System.out.println("Excetion is "e.getMessage());
 System.out.println(e);
 
 }
}
}