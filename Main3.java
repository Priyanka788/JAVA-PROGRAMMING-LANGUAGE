class Pjj
{
 int i;
 int count=0;
 int sum=0;
 int product=1;
 void getdata(int y)
 {
  i=y;
  System.out.println("Enter integer is = "+i);
  }
  void show()
  {
   while(i>0)
   {
     int x=i%10;
	  count=count+1;
	  i=i/10;
	  sum+=x;
	  product*=x;
   }
    System.out.println("Number of digit is = "+count);
	System.out.println("The sum of number of digit is = "+sum);
	System.out.println("The product of number of digit is = "+product);
   }
}
public class Main3
{
 public static void main(String args[])
 { 
   Pjj p=new Pjj();
   p.getdata(3456);
   p.show();
 }
} 
	 
	 