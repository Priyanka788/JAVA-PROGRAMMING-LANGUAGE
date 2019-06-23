public class Reverse
{
public static void main(String [] args)
{
int x=123;
int rev=0;
int rem=rev*10+x%10;
int num=x/10;
if(x>0)
{
 System.out.println(rem);
 int rem1=rev*10+num%10;
 int num1=num/10;
	 if(num>0)
	 {
		 System.out.println(rem1);
	     int rem2=rev*10+num1%10;
         int num2=num1/10;
		   if(num1>0)
	          {
		        System.out.println(rem2);
			  }
	 }			  
}
}
}