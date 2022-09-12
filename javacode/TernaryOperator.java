public class TernaryOperator
{
	public static void main(String[] args)
	{
		//选取三个数字的最大值
		int num1 = 10;
		int num2 = 30;
		int num3 = 40;
		int max = 0;
		int temp = 0;
		
		temp = num1 > num2 ? num1 : num2;
		max = temp > num3 ? temp : num3;

		System.out.println(max);

	}
}