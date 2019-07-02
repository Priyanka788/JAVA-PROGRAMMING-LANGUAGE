public class PatternZ
{
public static void main(String [] args)
{
 int x=0; 
 for(int row=0;row<5;row++)
{
   for(int col=0;col<row;col++)
    {   
           
	 if (x==0)
	    {  
	       System.out.print("0");
		   x=1;
		}
     else
        {
            System.out.print("1");
			x=0;
        }
    }
	
	System.out.println(" ");	 
}
}
}	
	