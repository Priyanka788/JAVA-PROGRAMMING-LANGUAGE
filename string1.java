import java.lang.String.*;            //simple program of index of to find location of "m"..
class string1
{
public static void main(String args[])
{
String s1=new String("Computer");
//int i=s1.indexOf('m');                     //iit give the location..
//int i=s1.indexOf('m',3); //-1
//int i=s1.indexOf('m',6);//-1
//int i=s1.indexOf('m',0,1);//2
//int i=s1.indexOf('m',2);//2
int i=s1.indexOf('m',8);//-1
System.out.println(i);
}
}