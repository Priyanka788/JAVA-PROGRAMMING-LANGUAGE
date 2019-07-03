import  java .util.*;             // Simple use of array
class SumArray
{
  public static void main(String args[])
  {
	  int sum=0;
     int a[]=new int[5];
	 System.out.println("Enter the five numbers");
	 Scanner sc=new Scanner(System.in);
	 for(int i=0;i<5;i++)
	 {
	     a[i]=sc.nextInt();
		 sum=sum+a[i];
		// System.out.println(sum);
	  }
   	    System.out.println("Sum of 5 number is "+sum);
   }
}   