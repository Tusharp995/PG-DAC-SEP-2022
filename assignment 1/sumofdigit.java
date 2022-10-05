import java.util.Scanner;

class sumofdigit{
 public static void main(String args[]){

Scanner s = new Scanner (System.in);
System.out.println("Enter the no =");
int n = s.nextInt();

		int sum =0;
			while (n >0)
			{
				sum = sum + n%10;
				n =n/10;
			}
	
		System.out.println("sum of digit of no is = " +sum);

}

}