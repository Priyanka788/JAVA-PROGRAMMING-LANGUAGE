abstract class Person               // Person is abstract; cannot be instantiated         
{
private String name;
public void setName(String n)
    {
      name=n;
	  System.out.println(name);
    }
}
public class AbstractE
{
   public static void main(String args[])
      {
         Person P=new Person();
         P.setName("pjj");
      }
}   
	
