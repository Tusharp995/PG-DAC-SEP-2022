abstract class Employee
{
	int id;
	String name;
	abstract double getsalary()
	{
		
	}
	void printdetails()
	{
		this.id=id;
		this.name=name;
		System.out.println("Employee Name :"+name);
		System.out.println("Employee id:"+id);
	}
}

class RegularEmp extends Employee
{
	double basicpay;
	
	void getsalary()
	{
		
	}
	void printdetails()
	{
		
	}
	
}
abstract class ContractBasedEmp extends Employee 
{
	
	
}
class CDACCBEmp extends ContractBasedEmp
{
	
	
}
class ThirdPartyEmp extends ThirdPartyEmp
{
	
	
}

class CdacEmp
{
	public static void main(String args [])
	{
		
		
		
	}
	
	
	
}