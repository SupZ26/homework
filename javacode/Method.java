public class Method
{
	public static void main(String[] args)
	{	
		A a = new A();
		a.sayOk();
	}
}

class A
{
	
	public void print(int n)
	{
		System.out.println("print()方法已被调用n ="+ n);
	}

	public void sayOK()
	{
		print(10);
	}
}