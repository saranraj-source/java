import java.util.Scanner;
class Main7{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int a=sc.nextInt();
	if(a>0)
		{
		System.out.println("it is positive");
		}
	else if(a<0)
		{
		System.out.println("it is negstive");
		}
	else 
		{
		System.out.println("it is zero");
		}
	}
}