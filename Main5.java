import java.util.Scanner;
class Main5{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the first number:");
	int a=sc.nextInt();
	System.out.print("Enter the second number:");
	int b=sc.nextInt();
	System.out.print("Enter the third number:");
	int c=sc.nextInt();
	if(a>b && a>b)
		{
		System.out.println("a is bigger");
		}
	else if(b>a && b>c)
		{
		System.out.println("b is bigger");
		}

	else if(c>a && c>b)
		{
		System.out.println("c is bigger");
		}
	else
		{
		System.out.println("some values are equal");
		}
	}
}