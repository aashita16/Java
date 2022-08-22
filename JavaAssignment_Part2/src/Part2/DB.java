package Part2;

abstract public class DB{
	
	//instance variables
	protected String name;
	protected double baseCost;
	protected double dbStorage;
	
	//class variable
	protected static int countObj = 0;

	//Parameterized constructor 
	public DB(String name, double baseCost, double dbStorage) {
		super();
		this.name = name;
		this.baseCost = baseCost;
		this.dbStorage = dbStorage;
		//once object is created, we increment the count of objects created.
		countObj++;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}

	public double getDbStorage() {
		return dbStorage;
	}

	public void setDbStorage(double dbStorage) {
		this.dbStorage = dbStorage;
	}

	public static int getCountObj() {
		return countObj;
	}

	public static void resetCountObj( ) {
		DB.countObj = 0;
	}
	
	//abstract method
	abstract public double MonthlyCost();

	@Override
	public String toString() {
		return "[ name = " + name + "(" + this.getClass() + ")" + "\n" + 
			    "baseCost = " + "$ " + baseCost + "\n" +
	           "dbStorage = " + dbStorage + " TB" + "\n";
	  
	}

	

	
	
	
	
	
	

}
