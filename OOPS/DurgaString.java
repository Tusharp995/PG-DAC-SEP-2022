class DurgaString
{
	String name;
	int rollno;
	
	DurgaString(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	/*public String toString()
	{
		return name+"...."+rollno;
	}
	public int hashCode()
	{
		return rollno;
	}
	public boolean equals (Object obj)
	{
		if (name1.equals(name2) && rollno1 == rollno2);
	}*/  
	public static void main(String args[])
	{
		DurgaString s1 = new DurgaString("tushar",101);
		DurgaString s2 = new DurgaString("sourabh",102);
		DurgaString s3 = new DurgaString("tushar",101);
		DurgaString s4 = s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toString());
		/*Integer i = new Integer(10);
		String s = new String("tushar");
		DurgaString t = new DurgaString();
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(t);
	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());*/
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
		
	}
}