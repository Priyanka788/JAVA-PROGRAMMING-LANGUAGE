class Pjj
{
 int i;
 int sum=0;
 void getdata(int y)
 {
  i=y;
  System.out.println("Enter integer is = "+i);
  }
 void show()
  { 
   int n=i;
   while(i>0)
   {
      int x=i%10;
	  sum+=(x*x*x);
	  i=i/10;
	 System.out.println("The sum of number of digit is = "+sum);
   }
     System.out.println("The sum of number of digit is = "+sum);
   if(sum==n)
    {
       System.out.println(+sum+" is armstrong number");
    }
   else
    {
      	System.out.println(+sum+" is not armstrong number");
    } 
  }
}
public class Main4
{
 public static void main(String args[])
 { 
   Pjj p=new Pjj();
   p.getdata(153);
   p.show();
 }
} 
	 