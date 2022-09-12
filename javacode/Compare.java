public class Compare
{
	public static void main(String[] args)
	{
		int a = 10;
		//"||"的使用
		if(a > 5 || a < 6)
		{
			System.out.println("Right\n");
		}

        //"|"的使用
		if(a > 5 | a < 6)
		{
			System.out.println("Right\n");
		}

		//"|"和"||"的区别
		int b = 6;
		if(a > 1 || ++b < 2 )
		{
			System.out.println("Right\n");
		}
		System.out.println( b );

		if(a > 1 | ++b < 2 )
		{
			System.out.println("Right\n");
		}
		System.out.println( b );
	}
}