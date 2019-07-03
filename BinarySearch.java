import java.lang.String.*;
class BinarySearch
{
int mid=0;
 int binarySearch(int arr[],int l,int r,int x)
 {
       if(r>=l)
	     {
		    mid=l+(r-l)/2;
			System.out.println(mid);
			
		  }
       if(arr[mid]==x)
         {
            return mid;
          }
	   if(arr[mid]>x)
	      {
	         return binarySearch(arr,l,mid-l,x);
	      }
	  if(arr[mid]<x)
	     {
	          return binarySearch(arr,mid+l,r,x);
	     }
		 return -1;
 }
 public static void main(String args[])
{
   BinarySearch obj=new BinarySearch();
   int arr[]={2,3,4,10,40};
   int n=arr.length;
   System.out.println(n);
   
    int x=4;
    int result=obj.binarySearch(arr,0,n-1,x);
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