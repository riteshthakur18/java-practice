import java.util.Scanner;
class user
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value of num1");
		int num1=sc.nextInt();
		System.out.println("enter value of num2");
		
		int num2=sc.nextInt();
		System.out.println("enter value of num3");
		
		int num3=sc.nextInt();
		if(num1==num2&&num1==num3)
{
System.out.println("All numbers are equal");
}
else if(num1==num2&&num1>num3)
{
System.out.println("num1 and num2 are equal");
}
else if(num2==num3 && num2>num1)
{
System.out.println("num2 and num3 are equal");
}
else if(num1==num3&&num1>num2)
{
System.out.println("num1 and num3 are equal");
}
else if(num1>num2&&num1>num3)
{
System.out.println(num1 + " num1 is greater number");
}
else if(num2>num1 && num2>num3)
{
System.out.println(num2 + " num2 is greater number");
}
else
{
System.out.println(num3 + " num3 is greater number");
}
}
}
