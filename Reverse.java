import java.lang.*;
class Reverse
{
public static void main(String rgs[])
{
int a=109;
String str=Integer.toString(a);
StringBuffer sbr=new StringBuffer(str);
sbr=String.reverse(sbr);
str=String.toString(sbr);
int y=Integer.parseInt(str);
System.out.println(y);
}
}
