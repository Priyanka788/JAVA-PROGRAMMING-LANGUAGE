public class Const
{
 private int x;
 {
 System.out.println(x);
  x=5;
 } 
 Const()
 {
  System.out.println("Constructor start");
    System.out.println(x);
  }
 
public static void main(String args[])
{
   Const c1=new Const();
}
}   