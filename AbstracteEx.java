 class Student                      // AbstracteEx.java:1: error: Student is not abstract and does not override abstract method setName(String) in Student
{
  String name;
  abstract void setName(String n);
}
class Person extends Student
{
    public void setName(String n)
	{
      name=n;
	  System.out.println(name);
    }
}	
public class AbstracteEx
{
   public static void main(String args[])
      {
         Person P=new Person();
         P.setName("pjj");
      }
}   
	
