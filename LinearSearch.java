import java.lang.String.*;
class LinearSearch
{
 int linearSearch(int arr[],int x)
   {
     int n=arr.length;
	 for(int i=0;i<n;i++)
	   {
	      if(arr[i]==x)
		   {
		     return i;
			 }
	   }			 
			return -1;
    }
public static void main(String args[])
{
   LinearSearch obj=new LinearSearch();
   int arr[]={2,3,4,10,40};
    int x=2;
    int result=obj.linearSearch(arr,x);
  if(result==-1)
    {
         System.out.println("Element is not present in array");
	}
  else
    {
       System.out.println("Element in present at index"+result);
    }
}
}		
	 
 