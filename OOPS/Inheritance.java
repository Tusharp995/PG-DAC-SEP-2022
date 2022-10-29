class Cricketer {
String name;
String country;
int match;

	void setdetails(String name, String country, int match)
	{
	this.name=name;
	this.country=country;
	this.match=match;
	}
	void printdetails()
	{
	System.out.println(name);
	System.out.println(country);
	System.out.println(match);
	}
	}

	class Batsman extends Cricketer {
	int run;
	void setrun(int run)
	{
	this.run=run;
	}
	void printrun()
	{
	System.out.println(run);
	} 
	}

	class Bowler extends Cricketer{
	int wicket;
	void setwicket(int wicket)
	{
	this.wicket=wicket;
	}
	void printwicket()
	{	
	System.out.println(wicket);
	}
	}
	
class Inheritance
{
	public static void main (String args[])
	{
	Cricketer obj = new Cricketer();
    obj.setdetails("tushar", "India",100);
	obj.printdetails();
	
	Batsman obj1 = new Batsman();
	obj1.setdetails("dhoni","India",200);
	obj1.printdetails();
	obj1.setrun(10000);
	obj1.printrun();

	Bowler obj2 = new Bowler();
	obj2.setdetails("chahal","India",90);
	obj2.printdetails();
	obj2.setwicket(180);
	obj2.printwicket();

	}






}

