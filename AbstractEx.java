abstract class Student                   
{
  String name;
  void setName(String n)
   {
       name=n;
	   System.out.println(name);
    }
}
class Person extends Student
{
    /*public void setName(String n)   //its is not useful to declare method also in class Student.
	{
      name=n;
	  System.out.println(name);
    }*/
}	
public class AbstractEx
{
   public static void main(String args[])
      {
         Person P=new Person();
         P.setName("pjj");
      }
}   
	
