class Demo//static 
{
	int a;
	int b;
	static int count;

	Demo()
	{
	count++;
	}
	void fun()
	{
	System.out.println("fun of class demo");
	fun1();
	}
	static void fun1()
	{
	System.out.println("fun1 of class demo");
    printtotalobj();
	}

	static void printtotalobj()
	{
	System.out.println("object created so far"+count);
	}
	}
public class StaticDemo
	{
	public static void main(String args[])
	{
		
	Demo obj= new Demo();
	System.out.println(Demo.count);
	obj.fun();
	Demo.fun1();
	Demo.printtotalobj();
	new Demo();
	new Demo();
	new Demo();
	Demo.printtotalobj();
	}
	}