import java.util.Scanner;
class Main10{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int a=sc.nextInt();
int sum=0;
for(int i=1;i<=a;i++){
sum+=i;}
System.out.println(sum);}}