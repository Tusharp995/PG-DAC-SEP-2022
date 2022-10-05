import java.util.Scanner;

class LCM{
	public static void main(String args[]){
Scanner s = new Scanner (System.in);
	 System.out.println (" Enter the no = ");
	 int n1 = s.nextInt();
	 System.out.println (" Enter the no = ");
	
	  int n2 = s.nextInt();
	  	
 int lcm =1;
int hcf =1;
   for(int i=1;i<=n1 && i<= n2;i++)
   {
   if(n1 %i == 0 && n2 % i == 0)
   {
	   hcf =i ;
   }
   lcm = (n1*n2)/hcf;
 }
   System.out.println("lcm of two number = "+lcm);
		
			}
}
		
				
		
	
