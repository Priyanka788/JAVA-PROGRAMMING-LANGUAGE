class Parent
{
 public static void fn()
 {
 System.out.println("class parent");
 }
}
class Child extends Parent
{
  public static void fn()                    // in this if we does not make any fn in class child than parent class fn run
  {
    System.out.println("Class Child");
   }
}
public class Estatic
{
  public static void main(String args[])
{
   Child.fn();
}
}   