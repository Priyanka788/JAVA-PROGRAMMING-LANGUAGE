class Static1
{
 int x;//instance variable
 static int y;//static variable declare out side used inside the method
 void fun(int c)
 {
    y=c;//error of static variable declare in instance method
	System.out.println(y);
 }
public static void main(String args[])
{
   Static1 S=new Static1();
   S.fun(5);
}
}   
	