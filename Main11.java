import java.util.Scanner;
class Main11
	{
	public static void main(String [] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		int odd=0;
		int even=0;
		for(int i=1;i<=a;i++)
			{
			if(i%2==0)
				{
				even+=i;
				}
			else
				{
				odd+=i;
				}
			}
		System.out.println(odd+" "+even);
		}
	}