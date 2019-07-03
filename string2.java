import java.lang.String;            //simple program of string last type on alphabets like  "m"..
class string2
{
public static void main(String args[])
{
String s1=new String("Computer");
//int i=s1.indexOf("ter");                 //5
//int i=s1.lastIndexOf("ter");   //5
int i=s1.lastIndexOf("ter",4);   //5            (4 ans -1;)
//string s2=s1.substring(4);               //error
System.out.println(i);
//System.out.println(s2);
//System.out.println(s1.substring(4));     //uter
System.out.println(s1.substring(4,5));        //u
}
}