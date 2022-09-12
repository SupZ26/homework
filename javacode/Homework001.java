import java.util.Scanner;

public class Homework001
{
	public static void main(String[] args)
	{
		int[] nums = {2,7,11,15};
		int targets = new Scanner(System.in).nextInt();
		
		for(int i = 0 ;i <= 3;i++)
		{
			for(int j = 1 ;j<= 3;j++)
			{
				if(nums[i] + nums[j] == targets)
				{
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}
}



