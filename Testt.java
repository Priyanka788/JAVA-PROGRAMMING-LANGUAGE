class Testt
{
public static void main(String args[])
{
int d=123456;
   while(d>0)
    {
      int d1=d%10;
	  
	      int j=2;              //j=1
		  int count=0;
	      while(j<=d1/2)         //d1
	        {
			  if(d1%j==0)
			    {
				   count++;
				 }
				 j++;
            }
			if(count==2)        //one morre condition of 1 is a prime number..&&//Count==2......
			  {
			     System.out.println(d1+"Prime number");
			   }
            else
			   { 			
	              System.out.println(d1+"Not a prime number");
				}
        
          d=d/10;
	   
    }
}
}	