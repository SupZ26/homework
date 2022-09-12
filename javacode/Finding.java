import java.util.Scanner;


public class Finding
{
	public static void main(String[] args)
	{
		String names[] = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入");//接收用户输入值
		String findName = myScanner.next();

		int index = -1;
		for(int i = 0;i <=3 ;i++)
		{
			if(findName.equals(names[i]))
			{
				System.out.println("恭喜你找到"+findName);
				index = i;
				break;
			}
		}
		//index作为一个是否成功的判断标准，如果index != -1，说明程序进入过if语句块
		//如果index值没有改变，那么就代表程序没进入过if语句块，进而说明没有找到
		if(index == -1)
		{
			System.out.println("没有找到"+findName);	
		}	
	}
}