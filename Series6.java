public class Series6
{
public static void main(String args[])
{
 int n=4;
 int pre=1;
 double s=0.0; 
int a=2;
 for(int i=1;i<n;i++)
 {
	pre=pre*a/i; 
     s=s+pre;
  }
 System.out.println(s);
}
} 