class Sqrtt
{
   public static double squareRoot(int number)
   {
      double temp;
	  
	  double sr=number/2;
	  
	  do{
	        temp=sr;
			sr=(temp+(number/temp))/2;
	    }
	  while((temp-sr)!=0);

       return  sr;
    }
public static void main(String args[])
{
    Sqrtt S=new Sqrtt();
   // S.squareRoot(47);
  System.out.println("Square root of a number is :"+S.squareRoot(47));
}
}  