import java.util.Scanner;
class palindrome{
	public static void main( String args []) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = obj.nextInt();
	int t1 =num;
	int rev =0 ,rem;
	 while (t1 != 0)
	 {
		 rem = t1%10;
		 rev = rev*10+rem;
		 t1=t1/10;
		 }
		 if (num== rev){
		 System.out.println(num+" is palindrome number");
		 }
else
{	
	System.out.println(num+" is not palindrome number");
}		
			 	 
	}
}