class test {
public static void main(String args[]){
outer: for (int i=1; i<=5; i++)
{
	inner: for (int j=1; j<=5;j++)
	{
		System.out.println(i +","+j);
		if (i==j)
		{
			continue;
		}
	}System.out.println("inner");
}System.out.println("outer");
}
}