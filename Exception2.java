class Exception2
{
public static void main(String args[])
{
 try
 {
 //String s=null;
 //throw new NullPointerException("String length ="+s.length());
 throw new ArithmeticException(" Arithematic Exception =");
 }
 catch(ArithmeticException e)
  //catch(NullPointerException e)
 {
 System.out.println("Excetion is "+e.getMessage());
 //System.out.println(e);
 
 }
}
}