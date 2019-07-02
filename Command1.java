public class Command1                   
{
public static void  main(String args[])
{
	int i;
	for(i=0;i<=args.length-1;i++)
	{
		//System.out.println(args[i]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a>b)
		{
		System.out.println(a);
		}
		else 
		{
		System.out.println(b);
		}
		}
		}
}	