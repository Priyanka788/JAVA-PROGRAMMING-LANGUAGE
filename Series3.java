import java .lang.Math;
public class Series3
{
public static void main(String args[])
{
int n=4;
double s=0.0;
int a=5;
for(int i=1;i<=n;i++)
{
   s=s+(i/Math.pow(a,i));
 }
System.out.println(s);
}
} 