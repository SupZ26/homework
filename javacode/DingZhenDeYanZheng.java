import java.util.Scanner;
public class DingZhenDeYanZheng
{
	public static void main(String[] args)
	{
		int sum = 0;
		Scanner myScanner1 = new Scanner(System.in);
		Scanner myScanner2 = new Scanner(System.in);

		
		for(int i = 3;i >=1;i--)
		{
			System.out.println("输入用户名");
			String name = myScanner1.next();
			System.out.println("输入密码");
			int secretNum = myScanner2.nextInt();

			if(name != "丁真" || secretNum != 666 && i != 1)
			{
				System.out.println("您还有"+(i-1)+"次机会！");
			}
			if(i == 1)
			{
				System.out.println("鉴定为纯纯的飞舞！");
			}
		}
	}
}