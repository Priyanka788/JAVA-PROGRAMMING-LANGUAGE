public class PatternZ3
{
public static void main(String [] args)
{
 int x=0; 
 for(int row=0;row<4;row++)
{
   for(int col=3;col>row;col--)
   {
    System.out.print(" ");
   } 	
    for(int k=0;k<=row;k++)
     {
       if (x==0)
        {
            System.out.print(" 0 ");
   			x=1;
		}
	   else
        {
		    System.out.print(" 1 ");
   			x=0;
		}
    }
   
System.out.println("\n");
}
}
}	