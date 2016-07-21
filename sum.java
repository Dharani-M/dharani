import java.lang*;
class Sum
{
void add()
{
int[] a=new int[15];
a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
int sum=0;
for(int i=0;i<15;i++)
{

sum+=a[i];

}
System.out.println(sum);
}
void odd()
{
int[] b=new int[55];
if(b>15&&b%2!=0)
{
for(int i=0;i>30;i++)
{
int sum=0;
sum+=b[i];
}}
System.out.println(sum);
}
public static void main(String rgs[])
{
Sum s=new Sum();
s.add();
s.odd();
}
