class Static
{
 int x;//instance variable
 void fun(int c)
 {
    public  static int y=c;// error satic variable inside non static  function 
	System.out.println(c);
 }
public static void main(String args[])
{
   Static S=new Static();
   S.fun(5);
}
}   
	