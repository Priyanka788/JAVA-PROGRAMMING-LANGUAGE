import  java .util.*;             // Simple use of array to form a matrix.......
class ArrayMatrix
{
  public static void main(String args[])
  {
	  int i,j;
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter row and columns numbers");
	// Scanner sc=new Scanner(System.in);
	    i =sc.nextInt();
		j =sc.nextInt();
		   int a[][]=new int[i][j];
		   int b[][]=new int[i][j];
		   int sum[][]=new int[i][j];
		   System.out.println("Enter the first matrix");
	   for(int c=0;c<i;c++)
	   {
		 for(int d=0;d<j;d++)
		  {
	          a[c][d]=sc.nextInt();
		       //System.out.println(+a[c][d]);
		   }
	   }
	       System.out.println("Enter the second matrix");
	   for(int c=0;c<i;c++)
	   {
	      for(int d=0;d<j;d++)
	        {
                b[c][d]=sc.nextInt();
	        }
	   }
	   // System.out.println("the sum matrix");
	   for(int c=0;c<i;c++)
	   {
	      for(int d=0;d<j;d++)
	        {
                sum[c][d]=a[c][d]+b[c][d];
	        }
	   }
	    System.out.println("the sum of  matrix in ");
	   for(int c=0;c<i;c++)
	   {
	      for(int d=0;d<j;d++)
	        {
               System.out.print(sum[c][d]+"  ");
			}
			    System.out.println();
	        
	   }
}
}   
     