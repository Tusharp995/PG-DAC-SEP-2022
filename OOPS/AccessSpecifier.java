class First 
{
	public int a;
	private int b;
	protected void display()
	{
	System.out.println(a);
	System.out.println(b);
	}
}
 class AccessSpecifier
 {
	public static void main(String args[])
	{
	First obj = new First();
	System.out.println(obj.a);
	//System.out.println(obj.b);
	obj.display();
	}
}