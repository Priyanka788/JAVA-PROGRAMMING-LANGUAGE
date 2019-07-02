public class AlpaR
{
public static void main(String [] args)

{
for(int row=0;row<7;row++)
{
   for(int col=0;col<=4;col++)
    { 
	    if(((row<=6&&col==0)||((row==0||row==3)&&col<=3))||(col==4&&(row>0&&row<3))||(row>3&&(col==row-2)))
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