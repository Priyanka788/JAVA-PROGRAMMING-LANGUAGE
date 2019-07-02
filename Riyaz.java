public class Riyaz
{
public static void main(String [] args){
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
for(int row=0;row<7;row++)
{
   for(int col=0;col<=4;col++)
    { 
	    if(((row==0||row==6)&&(col>0&&col<4))||((row>0&&row<6)&&(col==2)))
		{
			System.out.print("* ");
		}
        else
		{
			System.out.print("  ");
		}		
	}System.out.println();
}System.out.println();
for(int row=0;row<7;row++)
{
   for(int col=0;col<=4;col++)
    { 
	    if((col==0&&(row<3||row==5))||(col==4&&row<6)||((row==3||row==6)&&(col>0&&col<4)))
		{
			System.out.print("* ");
		}
        else
		{
			System.out.print("  ");
		}		
	}System.out.println();
}System.out.println();
for(int row=0;row<6;row++)
{
   for(int col=0;col<=4;col++)
    { 
	    if(((col==0||col==4)&&(row!=0))||((row==0||row==3)&&(col>0&&col<4)))
		{
			System.out.print("* ");
		}
        else
		{
			System.out.print("  ");
		}		
	}System.out.println();
}System.out.println();
for(int row=0;row<7;row++)
{
   for(int col=0;col<=4;col++)
    { 
	    if((row==0||row==6&&col<5)||(row==5&&col==0)||(row==4&&col==1)||(row==3&&col==2)||(row==2&&col==3)||(row==1&&col==4))
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

	