public class AlpaK
{
public static void main(String [] args)

{
for(int row=0;row<7;row++)
{
   for(int col=0;col<=4;col++)
    { 
	    if((col==0||(row>=3&&col==row-2))||(row==2&&col==row)||(row==1&&col==row+2)||(row==0&&col==row+4))
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