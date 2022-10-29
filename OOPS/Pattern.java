class Pattern 
{
	public static void main(String args[])
	{
		for (int i=1; i<=5;i++)
		{
			for (int j=5; j>=i;j--)
			{
			System.out.print("*");
			}
			for (int k=2; k<=i;k++)
			{
			System.out.print(" ");
			}
			for (int j=2; j<=i;j++)
			{
			System.out.print(" ");
			}
			for (int l=5; l>=i;l--)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=5;i++)
		{
			for (int j=1; j<=i;j++)
			{
			System.out.print("*");
			}
			for (int j=4; j>=i;j--)
			{
			System.out.print(" ");
			}
			for (int l=4; l>=i;l--)
			{
			System.out.print(" ");
			}
			for (int k=1; k<=i;k++)
			{
			System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

}














