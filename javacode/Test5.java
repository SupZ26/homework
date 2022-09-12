import java.util.Scanner;

public class Detail01
{
	public static void main(String[] args)
	{	
		System.out.println("请输入一个数");
		Scanner getNum = new Scanner(System.in);
		AA p1 = new AA();
		p1.judge(getNum);
	}
}

class AA
{
	public int judge(Scanner n1)
	{
		if(n1 % 2 == 0)
		{
			System.out.println(n+"是偶数");
		}
		else
		{
			System.out.println(n+"是奇数");

		}
	}
}