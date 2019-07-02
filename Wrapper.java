import java.lang.Double;
public class Wrapper                        //string s, radix  
{
public static void main(String args[])
{                                                   
//Integer i1=Integer.valueOf("1234");
Integer i1=Integer.valueOf("1001",2);
String i2=String.valueOf("1234");
//String i2=String.valueOf("1101",2);//show error object not applicable
//Double i3=Double.valueOf(10.0);
//Double i3=Double.valueOf("11111.1",2);  
Boolean i4=Boolean.valueOf("true");
//Boolean i4=Boolean.valueOf("false");
Character i5=Character.valueOf('p');
//Short i6=Short.valueOf("1234");
Short i6=Short.valueOf("1101",2);
//Byte i7=Byte.valueOf("1234");//error in main thread only 1234 of radix 16 out of range value
//Byte i7=Byte.valueOf("123");
Byte i7=Byte.valueOf("111",2);
Long i8=Long.valueOf("1234");
//Long i8=Long.valueOf("1101",2);
Float i9=Float.valueOf("1234");
//Float i9=Float.valueOf("1101",2);//not applicabe to find value
System.out.println(i1);
System.out.println(i2);
//System.out.println(i3);
System.out.println(i4);
System.out.println(i5);
System.out.println(i6);
System.out.println(i7);
System.out.println(i8);
System.out.println(i9);

}
}