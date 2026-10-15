import java.util.Scanner;
class Main10
	{
	public static void main(String [] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
			{
			if(i%3==0)
				{
					count+=1;
				}
			}
		System.out.println("total count is "+count);
		}
	}