 import java.lang.Math;
public class Random
{
	
static void fun()
{
 int min=1;
 int max=6;
 int range=(max-min)+1;
 for(int i=1;i<=6;i++)
 {
      int a=(int)(Math.random()*range)+min;
      System.out.println(a);
 }
}
public static void main(String [] args)
{	 
     fun();

}
}