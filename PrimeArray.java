import  java .util.*;             // Simple use of array to find Prime number...
class PrimeArray
{
  public static void main(String args[])
  {
     int a[]=new int[5];
	 System.out.println("Enter the five numbers");
	 Scanner sc=new Scanner(System.in);
	 for(int i=0;i<5;i++)
	 { 
         int count=0;
	     a[i]=sc.nextInt();
		 System.out.println("array value "+a[i]);
		 for(int j=1;j<=10;j++)
           { 
              if((a[i]%j)==0)
               {
	             count++;
	           }
            }
        if(count==2)
            {
                     System.out.println(+a[i]+"is a prime number");
            }
        else
            {
                     System.out.println(+a[i]+"is a not  prime number");
            }
	}
   	  /*for(int i=0;i<5;i++)
	 {
	     System.out.println("array value "+a[i]);
	  }*/
   }
}   
     