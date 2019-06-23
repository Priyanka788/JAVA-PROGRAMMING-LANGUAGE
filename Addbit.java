public class Addbit
{
public static void main(String [] args)
{
int n=120;
int a=n%10;
if(a>=0)
{
 System.out.println(a);
 n=n/10;
 int a1=n%10;
 if(a1>=0)
  {
    System.out.println(a1);
   n=n/10;
   int a2=n%10;
   if(a2>=0)
    {
	  System.out.println(a2);
	  int m= a+a1+a2;
	  System.out.println(m);
	}
   }
}
}
}   