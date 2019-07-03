class A
{
public int nextValue(int x)
{
int a=x+1;
return a;
}
public double nextValue(double x)
{
double a=x+1;
return a;
}
public void nextValue(char x)
{
//char a=x;
x++;
System.out.println(x);
//return a;
}
public void nextValue(String xy,char d)
{
 //String	ab=xy;
 //char c=d;
	d++;
System.out.print(xy +d);
//System.out.print(d);
}
}
public class OverF
 {
public static void main(String args[])
 {
  A obj=new A();
  System.out.println(obj.nextValue(5));
  System.out.println(obj.nextValue(5.0));
//System.out.println(obj.nextValue('b')); 
  obj.nextValue('b');
  obj.nextValue("ef",'g');
  }
  } 