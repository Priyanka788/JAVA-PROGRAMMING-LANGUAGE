public class AlpaF
{
public static void main(String [] args)

{
for(int row=0;row<7;row++)
{
   for(int col=0;col<=4;col++)
    { 
	    if((row<7&&col==0)||(row==0&&(col>0&&col<5))||(row==3&&(col>0&&col<4)))
		{
			System.out.print("* ");
		}
        else
		{
			System.out.print("  ");
		}		
	}System.out.println();
}System.out.println();
}
}	