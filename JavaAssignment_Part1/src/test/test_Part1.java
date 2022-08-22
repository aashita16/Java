package test;

import Part1.CentralisedDB;
import Part1.DB;
import Part1.DistributedDB;
import Part1.HeterogeneousDB;
import Part1.HomogeneousDB;

public class test_Part1 {

	public static void main(String[] args) {
		
		
		
		//centralised db obj
		CentralisedDB db1 = new CentralisedDB("Database One", 1200.0, 
				 5.00, 1500.0);
		System.out.println(db1);
		System.out.println("monthlyCost = " + "$ " + db1.MonthlyCost());
		
		System.out.println("---------------------------------------------------------");
		
		//distributed db
		DistributedDB db2 = new DistributedDB("Database Two", 2000.0, 
				 7.5, 100, 12.0);
		System.out.println(db2);
		System.out.println("monthlyCost = " + "$ " + db2.MonthlyCost());
	
		System.out.println("---------------------------------------------------------");
		
		
		//homogenous db
				HomogeneousDB db3 = new HomogeneousDB("Database Three", 2000, 
						 7.5, 100, 14.0);
				System.out.println(db3);
				System.out.println("monthlyCost = " + "$ " + db3.MonthlyCost());
		
		
		System.out.println("---------------------------------------------------------");
		
	
		//hetrogeneous db
				HeterogeneousDB db4 = new HeterogeneousDB("Database Four", 2000, 
						 7.5, 100, 14.0);
				System.out.println(db4);
				System.out.println("monthlyCost = " + "$ " + db4.MonthlyCost());
		
		
		System.out.println("---------------------------------------------------------");
		
		//total objects created
		System.out.println("Total Object count : " + DB.getCountObj());
	
	
	
	
	
	
	}

}
