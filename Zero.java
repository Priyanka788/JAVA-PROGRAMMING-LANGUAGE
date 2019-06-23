public class Zero
{
public static void main(String [] args)
{
int n=10;
int count=0;
int n1=n%10;
System.out.println("last bit is "+n1);
	
if(n1==0)
   {
		count=count+1;
		System.out.println("x  ");
        System.out.println(count);
		
   }	
else	  
{	 
    System.out.println("No zero at last bit");
}
       n=n/10;
       int n2=n%10;
	   System.out.println("2nd last bit is "+n2);
if(n2==0)
	{
				count=count+1;
				System.out.println(" xx  ");
		        System.out.println(count);
    }	
else	
{	 
    System.out.println("No zero at last 2nd bit"); 
}	
	
      n=n/10;
	  int n3=n%10;
	  System.out.println("3rd last bit is "+n3);
if(n3==0)
    {
				      count=count+1;
					  System.out.println("xxx");
					  System.out.println(count);
    }
else
{
       System.out.println("No zero at 3rd last bit");
}	   
	System.out.println("Total zero's "+count);

}
}	