public class Command                   
{
public static void  main(String args[])
{
	int i;
	int s=0;
	for(i=args.length-1;i>=0;i--)
	{
		System.out.println(args[i]);
		s=s+Integer.parseInt(args[i]);
	}
			System.out.println(s);
}
}	