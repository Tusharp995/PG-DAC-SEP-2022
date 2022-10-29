class Demo 
{
	int a;
	int b;
	
	Demo()
	{
	}
	Demo(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public String toString()
	{
	String str = " Demo[a= "+a+",b"+b+"]";
	}
	public boolean equals (object obj)
	{
	}
}

class ObjectMethodsOverrideDemo
{
	public static void main(String args[])
	{
	Demo d1 = new Demo(5,10);
	System.out.println(d1);
	
	Demo d2 = new Demo(5,10);
	
	
	
	}
}