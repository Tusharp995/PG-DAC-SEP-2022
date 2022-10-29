class First 
{
	void fun1()
	{
		System.out.println("fun1 of First");
	}
	void fun2()
	{
		System.out.println("fun2 of First");
	}
}
class Second extends First
{
	void fun2() 
	{
		System.out.println("fun2 of Second");
	}
	void fun3()
	{
		System.out.println("fun3 of Second");
	}
}
class ParentReference
{
	public static void main(String args[])
	{
	//First obj = new Second();
	//Second obj = new Second();
	//First obj = new First();
	Second obj = new First();
	obj.fun1();
	obj.fun2();
	
	
	}
}