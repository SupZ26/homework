public class ArrHomeWork
{
	public static void main(String[] args)
	{
		int arr[] = {4,-1,9,10,23};
		int maxArr = 0;
		int maxNum = 0;

		for(int i = 1;i <= 4;i++)
		{
			for(int j = 0;j <= 3;j++)
			{
				
				if(arr[j] > arr[j+1])
				{
					maxArr = arr[j];
					maxNum = j;
				}
				else
				{
					maxArr = arr[j+1];
					maxNum = j+1;
				}	
		    }
		}
		System.out.println(maxArr);
		System.out.println(maxNum);

	}
}