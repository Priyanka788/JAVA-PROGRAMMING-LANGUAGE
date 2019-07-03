import  java .util.*;             // Simple use of array
class Array
{
  public static void main(String args[])
  {
     int a[]=new int[5];
	 System.out.println("Enter the five numbers");
	 Scanner sc=new Scanner(System.in);
	 for(int i=0;i<5;i++)
	 {
	     a[i]=sc.nextInt();
		 System.out.println("array value "+a[i]);
	  }
   	  /*for(int i=0;i<5;i++)
	 {
	     System.out.println("array value"+a[i]);
	  }*/
   }
}   
     