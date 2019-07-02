class Static3
{
 int x;
 //static int y;
 //public static int y;
public static class fun
{
  static int y =5;
  /*void dis()            // it is not possible to make a function in static class
  {
	  
    System.out.println(y);
  */
}
}
class Hello1
{
 public static void main(String args[])
{
 System.out.println(Static3.fun.y);
}
} 
  