package Part1;

public class DistributedDB extends DB{
	
	
	//instance variable
	protected int numberOfUsers;
	protected double costPerUser;
	
	//constant
	public static final double COST_FACTOR = 1.1;
	
	//constructor
	public DistributedDB(String name, double baseCost, double dbStorage, int numberOfUsers, double costPerUser) {
		super(name, baseCost, dbStorage);
		this.numberOfUsers = numberOfUsers;
		this.costPerUser = costPerUser;
		
	}

	//getters and setters
	public int getNumberOfUsers() {
		return numberOfUsers;
	}

	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}

	public double getCostPerUser() {
		return costPerUser;
	}

	public void setCostPerUser(double costPerUser) {
		this.costPerUser = costPerUser;
	}

	public double getCostFactor() {
		return COST_FACTOR;
	}
	
	public double userCost() {
		return costPerUser * numberOfUsers ;
	}
	

	@Override
	public double MonthlyCost() {
		//monthly cost of distributed db
		return baseCost + userCost() * COST_FACTOR ;
	}

	
	
	@Override
	public String toString() {
		return super.toString()  + "numberOfUsers = " + numberOfUsers + "\n" +
				"costPerUser = " + "$ " + costPerUser + "\n" + 
				"userCost = " + "$ " + userCost() + "\n" +
				"costFactor = " + getCostFactor() + " ]" ;
	}
	

}
