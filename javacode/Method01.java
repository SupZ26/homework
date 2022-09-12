public class Method01
{
	public static void main(String[] args)
	{	
		Person p1 = new Person();//创建对象
		p1.speak();//调用方法
	}
}

class Person
{
	//成员变量
	String name = "小明";
	int age = 100;

	//方法
	//public : 表示方法是公开
	//void : 表示方法没有返回值
	//speak() : 方法名
	//{} :方法体
	public void speak()
	{
		System.out.println("我是谁");
	}
}