class Pjj
{
 int i;
 int rev=0;
 int rem;
 void getdata(int y)
 {
  i=y;
  System.out.println("Enter integer is = "+i);
  }
 void show()
  { int n=i;
   while(i>0)
   {  
      rem =i%10;
	  rev =rev*10+rem;
	  i=i/10;
	 System.out.println("The reverse of number of digit is = "+rev);
   }
     System.out.println("The reverse of number of digit is = "+rev);
   if(rev==351)
    {
       System.out.println(+n+" is palindrom  number");
    }
   else
    {
      	System.out.println(+rev+" is not palindrom number");
    } 
  }
}
public class Main5
{
 public static void main(String args[])
 { 
   Pjj p=new Pjj();
   p.getdata(153);
   p.show();
 }
} 
	 