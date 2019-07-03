class A
{
  void f1(int x)
  {
   System.out.println("class A");
   }
  }
class B extends A
{  
    void f1(int x)      //make both fn static 
  {
     super.f1(x);            //A.f1();
   System.out.println("class B");
   }
}
public class Ex
{
public static void main(String args[])
{
  B obj=new B();
   obj.f1(12);
}
}   