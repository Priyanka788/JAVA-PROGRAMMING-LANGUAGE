public class AlpaNumeric
{
public static void main(String [] args)

{
for(int row=0;row<7;row++)
{
   for(int col=0;col<=4;col++)
    { 
	    if((row==0&&(col==1||col==2))||((row==1||row==2)&&col==3)||(row==1&&col==0)||(row==3&&col==2)||((row==4||row==6)&&col==1))
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