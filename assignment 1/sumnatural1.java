import java.util.Scanner;
class sumnatural1{
public static void main(String args[]){


	int sum=0;
Scanner sumnn = new Scanner(System.in);
System.out.println("Enter the number");
int num = 	sumnn.nextInt();
int i=1;
 while(i<=num)
	 
 {
	 
 sum = sum +i ;
 
 i++;
 }
 System.out.println(sum);
}
}