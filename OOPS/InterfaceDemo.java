interface DBDriver
{
	int MAX_CONNECTION = 500;
	
	void createConnection();
	void getConnection();
	void closeConnection();
}

class OracleDBDriver implements DBDriver		//OracleDBDriver is the implementing class
{
	public void createConnection()
	{
		System.out.println("createConnection of Oracle");
		//System.out.println("Max Connection allowed : " + DBDriver.MAX_CONNECTION);	//OK
		System.out.println("Max Connection allowed : " + MAX_CONNECTION);		//OK
	}
	
	public void getConnection()
	{
		System.out.println("getConnection of Oracle");
	}
	
	public void closeConnection()
	{
		System.out.println("closeConnection of Oracle");
	}
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		OracleDBDriver oracDriver = new OracleDBDriver();
		oracDriver.createConnection();
		oracDriver.closeConnection();
		
		DBDriver driver;
		driver = new OracleDBDriver();
		driver.createConnection();
		driver.closeConnection();
		
		//new DBDriver();		//ERROR, interface can not be instantiated.
	}
}
