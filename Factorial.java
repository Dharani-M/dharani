import java.util.Scanner;
public class Factorial
{
public static void main(String args[])
{
int number;
int fact=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
number=s.nextInt();
for(int i=1;i<=number;i++)
{
fact=fact*1;
}
System.out.println("The factorial of the given number is"+fact);
s.close();
}
