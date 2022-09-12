import java.util.Scanner;
public class Switch01
{
	public static void main(String[] args)
	{

		int sum = 0;

		for(int num = 1;num <= 100;num++)
		{
			if(num % 9 == 0)
			{
				System.out.println("num = "+ num);
				sum = num + sum;
			}
			
		}
		System.out.println("sum = "+ sum);
		
	}
}