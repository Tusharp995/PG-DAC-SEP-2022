class JaggedArray
{
public static void main(String args[])
{
int jagged [][] = new int [2] [];
jagged [0]=new int[2];
jagged [1]=new int[4];

jagged [0][0]=5;
jagged [0][1]=10;
jagged [1][0]=15;
jagged [1][1]=20;
jagged [1][2]=25;
jagged [1][3]=30;

for (int i=0;i<2;i++)
{
	for(int j=0;j<jagged[i].length;j++)
	{
	System.out.print(jagged[i][j]+"\t");
	}
}
}
}