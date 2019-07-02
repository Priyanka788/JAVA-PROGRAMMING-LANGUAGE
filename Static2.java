class Static2
{
 int x;//instance variable
 static int y;// static variable
static void fun(int c)
 {
   /* y=10;//also used to change value
	x=c;//error of non static variable
	y=c;//run because of static variable
	System.out.println(x);//error*/
	System.out.println(y);//run
 }
public static void main(String args[])
{
   Static2.fun(5);
}
}   
	