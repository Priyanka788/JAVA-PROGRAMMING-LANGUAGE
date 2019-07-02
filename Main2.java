class Pjj
{
 int i;
 int count=0;
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
	  
   }
    System.out.println("Number of digit is = "+count);
   }
}
public class Main2
{
 public static void main(String args[])
 { 
   Pjj p=new Pjj();
   p.getdata(3456);
   p.show();
 }
} 
	 
	 