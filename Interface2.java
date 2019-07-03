interface I1                       //program of multiple inheritance
{
	int a=10;
 public void f1();
}
interface I2  
{
 public void f2();
}
interface  I3 
{
 public void f3();
}
class Parent implements I1,I2,I3
{
public void f1()
 {
	// a=100;                     //show an error of  a is final....
 System.out.print(a);
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
public class Interface2
{
	public static void main(String args[])
{
  Parent p=new Parent();
  p.f1();
  p.f2();
  p.f3();
}
}
  
    