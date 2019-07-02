public class AlpaPattern
{
public static void main(String [] args)

{
for(int row=1;row<=3;row++)
{
   for(int col=1;col<=25;col++)
    { 
	    if((row==1&&col<7)||((col==7||col==13||col==19)&&row<=3)||(row==3&&(col>7&&col<13))||(row==1&&(col>13&&col<19))||(row==3&&(col>19&&col<=25)))
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






























































































