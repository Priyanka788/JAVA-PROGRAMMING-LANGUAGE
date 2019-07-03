class Lcms                             //Simple lcm program ........
{
 public static void main(String args[])
 {
    int n=2;
	int m=3;
	int lcm=n>m?n:m;
	while(true)
	  {
	     if(lcm%2==0&&lcm%3==0)
		   {
		      System.out.println(lcm);
			  break;
			}
        lcm++;
      }
  }
}  
	