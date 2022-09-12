import java.util.Scanner;//把java.util下的Scanner类导入
public class Input
{
	public static void main(String[] args)
	{
		//创建 Scanner对象，new创建一个新对象
		// myScanner就是Scanner类的对象
		Scanner myScanner = new Scanner(System.in);
		//接收用户输入
		System.out.println("请输入名字");
		String name = myScanner.next();

		System.out.println("请输入年龄");
		int age = myScanner.nextInt();

		System.out.println("请输入薪水");
		double salary = myScanner.nextDouble();

		System.out.println("人的信息如下：");
		System.out.println("名字：" + name);
		System.out.println("年龄：" + age);
		System.out.println("薪水：" + salary);

	}
}