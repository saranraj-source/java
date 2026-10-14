import java.util.Scanner;
class Main5{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the year:");
	int a=sc.nextInt();
	if(a%400==0)
		{
		System.out.println("it is leap year");
		}
	else if(a%4==0 && a%100!=0)
		{
		System.out.println("it is leap year");
		}

	else
		{
		System.out.println("it is not leap year");
		}
	}
}