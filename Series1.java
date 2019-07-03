public class Series1
{
  //int s=0;
  static double sum(int n)
  {
	  double i;
	  double s=0.0;
  for(i=1;i<=n;i++)
  {
     s+=(1/i);
  }
	 return s;
    
  }
public static void main(String args[])
{
 int n=5;
System.out.println(sum(n));
}
} 