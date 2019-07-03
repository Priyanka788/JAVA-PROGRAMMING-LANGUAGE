import  java .util.*;             // Simple use of array to Do a array sorting...
class SortArray
{
  public static void main(String args[])
   {
	   int temp;
	   int n=5;
     int a[]=new int[n];
	 System.out.println("Enter the five numbers");
	 Scanner sc=new Scanner(System.in);
	 
	 for(int i=0;i<n;i++)
	 {
	     a[i]=sc.nextInt();
		 System.out.println("array value "+a[i]);
	  }
   	  for(int i=0;i<n;i++)
	    {
	       for(int j=i+1;j<n;j++)
		     {
		       if(a[i]>a[j])
			    {
			      temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				} 
	          }
		}	  
	     for(int i=0;i<n;i++)
	        {
	           System.out.println(+a[i]);
		    }
        
     //System.out.println(a[n-1]);
    }	
}   
     