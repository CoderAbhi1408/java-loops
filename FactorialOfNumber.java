import java.util.Scanner;
class FactorialOfNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1;i<=num ;i++ )
		{
			fact *= i;
		}
		System.out.println("the factorial of number : "+num+" is : "+fact);
	}
}