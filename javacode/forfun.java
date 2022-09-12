import java.util.Scanner;
import java.util.Random;


public class forfun
{
	public static void main(String[] args)
	{
		for(int i = 1;i <= 4;i++)
		{
			System.out.println("==============");
			System.out.println("你喜欢什么样的丁真？");
			System.out.println("A.浓浓的藏族气息（原皮）"+"\t"+"B.海鲜版"+"\t"+"C.医生版"+"\t"+"D.律师版"
				+"\t"+"Q退出");
			Scanner myScanner = new Scanner(System.in);
			char input_Ch = myScanner.next().charAt(0);

			switch(input_Ch)
			{
				case 'A': 
					System.out.println("一眼丁真，鉴定为原皮！");
					break;
				case 'B':
					System.out.println("鱿鱼丁真，鉴定为十足的智障！");
					break;
				case 'C' :
					System.out.println("医业丁真，鉴定为九十割几把！");
					break;
				case 'D' :
					System.out.println("议言丁真，鉴定为律师函警告！");
					break;
			}
			if(input_Ch == 'Q')
			{
				System.out.println("您已成功退出！")
				break;
			}
		}

		System.out.println("Let us play five point game！");

		WuZiWay p1 = new WuZiWay();





	}
}

class WuZiWay()
{
	public void printFrame()
	{
		for(int i = 1,j = 1;i < = 20,j < = 20;i++,j++)
		{
			if(i % 2 == 0)
			{
				System.out.println("====================");
			}
		}
	}
}




=================================
| | | | | | | | | | | | | |          
=================================                    
|							    
|
|
|
|
|
|
|
|==============================