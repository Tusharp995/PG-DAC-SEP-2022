import java.util.Scanner;
class armstrongno{
	public static void main( String args []) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = obj.nextInt();
	int t1 =num;
	int length =0;
	 while (t1 != 0)
	 {
		 t1= t1/10;
		 length = length +1;
		 }
		 int t2=num;
		 int x=1; 
		 int z=0;
		 while (t2 !=0){
			 int y=1;
			 x = t2%10;
		 for (int i=1; i<= length;i++){
			 y= y*x;
		 }
		 z=z+y;
		 t2=t2/10;
		 }
		 if (z==num)
		 {
		 System.out.println("No is armstrong");
		 }
		 else 
		 {
				System.out.println("Not Armstrong no");
		 }
			 
			 
			 
			 
			 
	}
}