public class PatternZ5
{
public static void main(String [] args)
{
 int x=0; 
 for(int row=0;row<4;row++)
{
   for(int col=4;col>row;col--)
   {
    if (x==0)
        {
            System.out.print("  0 ");
   			x=1;
		}
	   else
        {
		    System.out.print("  1  ");
   			x=0;
		}
   } 	
    for(int k=0;k<row;k++)
    {
       System.out.print(" s  ");
	}
    
   
System.out.println("\n");
}
}
}	