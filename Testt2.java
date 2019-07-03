import java.lang.String.*;          //sorting a character...
class Testt2
{
public static void main(String args[])
{
	int temp;
	String s="hello";
	int c=s.length();
	int a[]=new int[c];
	
    for(int i=0;i<s.length();i++)
	    {
		    char ch=s.charAt(i);  
	        //int ascii=c;
			a[i]=(int)ch;
		}
    for(int i=0;i<c;i++)
	    {
	       for(int j=i+1;j<c;j++)
		     {
		       if(a[i]>a[j])
			    {
			      temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				  
				} 
				
	          }
			  System.out.println((char)a[i]+"="+a[i]);
		}	  
	    // for(int i=0;i<c;i++)
	      //  {
	        //   System.out.println(a[i]);
		    //}
        
     //System.out.println(a[n-1]);
    }	
}   		
			
			
			
			
			
			
			
			
			
			