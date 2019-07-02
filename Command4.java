public class Command4                    
{
public static void  main(String args[])
{       
 for(int i=0;i<args.length;i++)
 {  int d = args.length;
  // System.out.println(args.length);//optional
	 int count=0;
	 int c=Integer.parseInt(args[i]);
    for(int j=1;j<50;j++)
	{		
       if(c%j==0)
        {
         
     count++;
        }
    }
     if(count==2)
      {
           System.out.println(c+"the number is prime");
      }
	else
	{
           System.out.println(c+"is not the prime number");
    }		   
 }
}
}
	 
