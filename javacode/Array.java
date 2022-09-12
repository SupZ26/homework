import java.util.Random;
public class Array
{
	public static void main(String[] args)
	{
		
		int arr[] = new int[5];
		
		//将5个随机数放入arr数组中
		for(int i = 0;i < arr.length;i++)
		{
			arr[i] = new Random().nextInt(100);
		}

		//倒序打印数组,求最大值及其下标
		int max = arr[0];
		int maxj = 0;
		for(int i = 1;i < arr.length;i++)
		{
			for(int j = 1;j < arr.length - 1;j++)
			{
				if(max < arr [j])
				{
					int temp;
					temp = max;
					arr[j - 1] = arr[j];
					max = arr[j];
					arr[j] = temp;
					maxj = j;
				}
			}
		}

		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i] +"\t");
		}

		System.out.println("\n");
		System.out.println("最大值角标" + maxj);
		System.out.println("最大值" + max);

		//求数组平均值
		double average = 0;
		double sum = 0;
		for(int i = 0;i < arr.length;i++)
		{
			sum += arr[i];
			average = sum / arr.length;
		}
		System.out.println("数组平均值为"+average);

		//查找是否有8
		int flag = 0;
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i] == 8)
			{
				System.out.println("有");
				flag = flag + 1;
				break;
			}
		}
		if(flag == 0);
		System.out.println("无");	
	}
}