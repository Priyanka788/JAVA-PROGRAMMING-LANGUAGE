public class Command2                   
{
public static void  main(String args[])
{
int max;
int secondmax;
int a;
int b;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
if (a > b)
{
	max=Integer.parseInt(args[0]);
	secondmax=Integer.parseInt(args[1]);
	
}
else
{
	max=Integer.parseInt(args[1]);
	secondmax=Integer.parseInt(args[0]);
}
for(int i=2;i<=args.length-1;i++)
{
	//System.out.println(args[i]);
	int c=Integer.parseInt(args[i]);
    if(c>max)
      {
        secondmax =max;
        max=c;
       }
    else
    {
        if(c>secondmax)
            {
                secondmax=c;
            }
    }
}
System.out.println(secondmax);
}
}
