package Part1;

public class CentralisedDB extends DB{
	
	//instance variable 
	private double license;
	
	
	//constructor
	public CentralisedDB(String name, double baseCost, double dbStorage, double license) {
		super(name, baseCost, dbStorage);
        this.license = license;
		
		
	}

	public double getLicense() {
		return license;
	}

	public void setLicense(double license) {
		this.license = license;
	}

	@Override
	public double MonthlyCost() {
		//monthly cost of centralised db
		return baseCost + license;
	}
	
    
	@Override
	public String toString() {
		return super.toString()  + "license = " + "$ " + license + " ]";
	}
	
	
	
	
	

}
