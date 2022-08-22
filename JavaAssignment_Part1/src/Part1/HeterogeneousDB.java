package Part1;

public class HeterogeneousDB extends DistributedDB{

	
	//constant
	public static final double COST_FACTOR = 1.3;
		
	//constructor
	public HeterogeneousDB(String name, double baseCost, double dbStorage, int numberOfUsers, double costPerUser) {
		super(name, baseCost, dbStorage, numberOfUsers, costPerUser);
		
	}
	
	public double getCostFactor() {
		return COST_FACTOR;
	}
	
	@Override
	public double MonthlyCost() {
		//monthly cost of distributed db
		return baseCost + userCost() * COST_FACTOR ;
	}

}
