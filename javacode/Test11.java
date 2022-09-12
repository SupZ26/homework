public class Test11
{
	public static void main(String[] args)
	{
		double money = 100000;
		int i = 1;

		for(;;i++)
		{
			while(money > 50000)
			{
				money = money * 0.95;
			}
			while(money <= 50000)
			{
				money = money - 1000;
			}
			if(money <= 0)
			{
				System.out.println(i);
				break;
			}
		}
	}
}