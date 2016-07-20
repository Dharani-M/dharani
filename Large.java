import java.lang.*;
class Large
{
public static void main(String args[])
{

System.out.println("Enter the values");
Scanner s=new Scanner();
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>b&&a>c)
{
System.out.println("a");
}
elseif(b>c)
{
System.out.println("b");
}
else
{
System.out.println("c");
}
}
