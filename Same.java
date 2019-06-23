public class Same
{
public static void main(String [] args)
{
 int a=1256;
 int b=1266;
 int a1=a%10;
 int b1=b%10;
if(a==b)
 {	
    System.out.println("Two numbers are egual");
 }
else
 { 
    System.out.println("Two numbers are not egual");
      if(a1==b1)
        {
            System.out.println("Last bit is egual");
            a=a/10;
            b=b/10;
            int a2=a%10;
            int b2=b%10;
 
            if(a2==b2) 
			    {
				   System.out.println("Second Last bit is egual");	
				   a=a/10;
				   b=b/10;
				   int a3=a%10;
				   int b3=b%10;
				   
				   if(a3==b3)
				   {
					   System.out.println("3rd Last bit is egual");
					   a=a/10;
				       b=b/10;
				       int a4=a%10;
				       int b4=b%10;
					   
					   if(a4==b4)
					   {
						 System.out.println("4th Last bit is egual");  
					   }else{System.out.println("4th Last bit is not egual");}
				   }else{System.out.println("3rd Last bit is not egual");}
				}else{System.out.println("Secong Last bit is not egual");}
		}else{System.out.println("Last bit is not egual");}
 }
}
}