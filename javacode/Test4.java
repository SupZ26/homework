import java.util.Scanner;
public class Test4
{
	public static void main(String[] args)
	{
		int arr[] = new int[5];
		arr[4] = 0;
		for(int i = 0;i<=3;i++)
		{
			System.out.println("Please input number");
			Scanner arrScanner = new Scanner(System.in);
			arr[i] = arrScanner.nextInt();

		}
		for(int i = 1;i < 5;i++)
		{
			for(int j = 1;j < 5;j++)
				{
					int temp = arr[0];
					if(temp > arr[i])
					{
						arr[i-1] = arr[i];
						arr[i] = temp;
					}
				}
		}
		System.out.println("原数组排序");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i] );
		}
	}
}