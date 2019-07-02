public class PassArg
{ 
 static int a=10;
   static int b=20; 
 static void fun()
 {
	
   int a1= a*b;
   System.out.println("The multipication of two number  is = "+a1);
 }
public static void main(String [] args)
{
    fun();
}
}