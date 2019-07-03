import java.lang.String.*;
class string
{
public static void main(String args[])
{
String s1=new String("Hello");      //without new string can also work.
String s2="Hello";                          //In this the one object box is create Because of name content but two reference variable can occure.
//String s1=new String("Hello");          //in this 3 reference variable and two object are created . both have same content.or deffirent.
//String s2=new String("Bonds");
String s3=s1+"Java"+s2;
System.out.println(s3);
System.out.println(s1==s3);
System.out.println(s1.equals(s2));
System.out.println(s1.compareTo(s2));
boolean str=s1.equalsIgnoreCase(s2);
System.out.println(str);   
System.out.println(s3.toUpperCase());
System.out.println(s3.toLowerCase());

}
}
