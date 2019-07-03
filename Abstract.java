abstract class Student            //object created of subclass to use methods of abstract class         
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
public class Abstract
{
   public static void main(String args[])
      {
         Person P=new Person();
         P.setName("pjj");
      }
}   
	
