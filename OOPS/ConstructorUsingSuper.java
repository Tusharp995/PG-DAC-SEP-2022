class First
{
int a;
	First()
	{
	System.out.println("0 zero argument const of First");
	}
	First(int a)
	{
	System.out.println("1 argu constru of First");
	this.a=a;
	}
}

class Second extends First
{
	int b;
	Second()
	{
	System.out.println("o arg const of second");
	}
	Second(int a)
	{
	System.out.println("1 arg const of second");
	}
	Second(int a, int b)
	{
		
	System.out.println("2 arg const of second");
	}
	
}
class ConstructorUsingSuper
{
	public static void main(String args [])
	{
	Second obj = new Second(5, 10); 
	}
	
	}