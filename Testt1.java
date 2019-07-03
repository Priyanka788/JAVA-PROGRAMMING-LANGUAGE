import java.lang.String.*; 
class Testt1
{
  public static void main(String args[])
    {
	  String s=new String("H2llo");
	  char ch1=s.charAt(4);
	  int ascii ='s';
	  if(ascii>=64&&ascii<=116)
	    {
		   System.out.println(ch1+" is Character");
	    }
	  else if(ascii>=48&&ascii<=58)
	    {		  
	       System.out.println(ch1+" is Integer");
	    }
	   System.out.println(s.replace("H2llo","oll2H"));
	  
	  System.out.println(ascii);
	}
}	
  