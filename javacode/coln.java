
public class coln
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.name = "milan";
		p.age = 100;

		Mytools tools = new Mytools();
		Person p2 = tools.copyPerson(p);

		System.out.println("p的年龄 age=" + p.age + " 姓名 " + p.name);
		System.out.println("p2的年龄 age=" + p2.age + " 姓名 " + p2.name);
		System.out.println(p == p2);//检测p和p2指向的地址是否一致

	}
}
//编写方法思路
//1.方法返回类型 Person
//2.方法的名字 copyPerson
//3.方法的形参 (Peson p)
//4.方法体 创建一个新的对象，并复制属性，返回即可
class Person
{
	String name;
	int age;
}

class Mytools
{
	public Person copyPerson(Person p)
	{
		Person p2 = new Person();
		p2.name = p.name;//将p对象的名字赋给p2
		p2.age = p.age;//将p年龄的名字赋给p2

		return p2;
	}
}



















