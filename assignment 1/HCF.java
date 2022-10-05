import java.util.Scanner;

class HCF{
	public static void main(String args[]){
Scanner s = new Scanner (System.in);
	 System.out.println (" Enter the no = ");
	 int n1 = s.nextInt();
	 System.out.println (" Enter the no = ");
	
	  int n2 = s.nextInt();
	  	
 
int hcf =1;
   for(int i=1;i<=n1 && i<= n2;i++)
   {
   if(n1 %i == 0 && n2 % i == 0)
   {
	   hcf =i ;
   }
 }
   System.out.println("gcd of two number = "+ hcf);
		
			}
}
		
				
		
	
