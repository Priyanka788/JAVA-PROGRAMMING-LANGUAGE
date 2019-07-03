interface I1      //abstract class implements interfaces
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
abstract class Student implements I3
{
 abstract  public void f4();
}
class Parent extends Student  
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
  public void f4()
 {
 System.out.print(" pjj!");
 }
}
public class Interface3
{
	public static void main(String args[])
{
  Parent p=new Parent();
  p.f1();
  p.f2();
  p.f3();
  p.f4();
}
}
  
    