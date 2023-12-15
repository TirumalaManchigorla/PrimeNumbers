import java.util.Scanner;
class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Minimum Value");
		int min = sc.nextInt();
		System.out.println("Enter maximum Value");
		int max = sc.nextInt();
		System.out.println("Prime numbers between " + min + " to " + max + ":");
		for (int num = min;num <= max; num++ )
		{
			int count=0;
			for (int i=1;i<=num;i++)
			{
				if (num%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
                System.out.print(num + " ");
			}
		}
	}
}
