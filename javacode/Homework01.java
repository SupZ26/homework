public class Homework01
{
	public static void main(String[] args)
	{
		int num = 1;
		int i = 0;

		for(;num <= 100;num++)
		{
			if(num % 5 == 0)
			{
				if(i % 5 != 0)
				{
					System.out.print(num+"\t");
					i++;
				}
				if(i % 5 == 0)
				{
					System.out.print("\n");
					System.out.print(num+"\t");
					i++;
				}				
			}
			
		}
	}
}