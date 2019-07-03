import  java .util.*;             // Print Even Element in an array....
class EvenArray
{
  public static void main(String args[])
  {
     int a[]=new int[10];
	 System.out.println("Enter the Ten numbers");
	 Scanner sc=new Scanner(System.in);
	 for(int i=0;i<10;i++)
	 {
	     a[i]=sc.nextInt();
		 /*if(a[i]%2==0)                                          // i we want as input we get it is even then block of if inbetween the for otherwise at last
		    {
		       System.out.println("even numbr is "+a[i]);
			}
         else
		    {
			   System.out.println("odd numbr is "+a[i]);
			} */
	 }
      for(int i=0;i<10;i++)
	   {
		  if(a[i]%2==0)                                         // after input get the output..........
		    {
		       System.out.println("even numbr is "+a[i]); 
			}
        /* else                                               // To print only even hide odd..
		    {
			   System.out.println("odd numbr is "+a[i]);
			}*/ 
       }
}
}   