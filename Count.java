public class Count
{
 public static void main(String args[])
 {
 int count=0;
 int a=555566;
 for(int i=1;i<7;i++)
 {
   int a1=a%10;
   count++;
   a=a/10;
  }
 System.out.println(count);
 }
}