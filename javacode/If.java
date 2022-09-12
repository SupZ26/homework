import java.util.Scanner;
public class If
{
	public static void main(String[] args)
	{				
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入性别");
		char gender = myScanner.next().charAt(0);

		System.out.println("请输入您的成绩");
		Double score = myScanner.nextDouble();
		
		if(score > 8.0)
		{
			if(gender == '男' )
			{
				System.out.println("恭喜你，进入男子组决赛");
			}
			else
			{
				System.out.println("恭喜你，进入了女子组决赛");
			}
		}
		else
		{
			if(gender == '男')
			{
				System.out.println("很遗憾，您没能进入男子组决赛");
			}
			else
			{
				System.out.println("很遗憾，您没能进入女子组决赛");
			}
		}
	}
		
}