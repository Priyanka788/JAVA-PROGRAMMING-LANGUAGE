interface I1      //simple interface program one interface extend other interface. 
{
 public void f1();
}
interface I2 extends I1 
{
 public void f2();
}
interface  I3 extends I2
{
 public void f3();
}
class Parent implements I3
{
public void f1()
 {
 System.out.print("Hello");
 }
public void f2()
 {
 System.out.print("  java");
 }
 public void f3()
 {
 System.out.print("  World");
 }
}
public class Interface1
{
	public static void main(String args[])
{
  Parent p=new Parent();
  p.f1();
  p.f2();
  p.f3();
}
}
  
    