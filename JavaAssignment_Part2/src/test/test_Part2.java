package test;

import java.util.Arrays;

import Part2.CentralisedDB;
import Part2.DB;
import Part2.DistributedDB;
import Part2.HeterogeneousDB;
import Part2.HomogeneousDB;
import Part2.monthlyCostComparator;
import Part2.nameComparator2;

public class test_Part2 {

	public static void main(String[] args) {
		
		
		
		
		CentralisedDB db1 = new CentralisedDB("Database One", 1200.0, 
				 5.00, 1500.0);
        
		DistributedDB db2 = new DistributedDB("Database Two", 2000.0, 
				 7.5, 100, 12.0);

		HomogeneousDB db3 = new HomogeneousDB("Database Three", 2000, 
						 7.5, 100, 14.0);

		HeterogeneousDB db4 = new HeterogeneousDB("Database Four", 2000, 
						 7.5, 100, 14.0);

		
		//total objects created
		System.out.println("Total Object count : " + DB.getCountObj());
	
		//part2
		System.out.println(" ");
		System.out.println("Part2 .........................................................");
		
		
		//array of db objects 
	   DB[] databases;
	   //allocating memory for 4 objects
	   databases = new DB[DB.getCountObj()];
	   //assigning objects to each index
	   databases[0] = db4;
	   databases[1] = db3;
	   databases[2] = db2;
	   databases[3] = db1;
	   
	   
	   //printing array of objects
//	   for (int i = 0; i < databases.length; i++) {
//		DB db = databases[i];
//		System.out.println("Array of DB objects : " + "\n" + db);
//		
//	    }
	   
	   
	   //sorted array by name
	   System.out.println(" ");
	   System.out.println("sorted array by name............................................");
	   Arrays.sort(databases, new nameComparator2());
       System.out.println(Arrays.toString(databases));
       
      //sorted array by monthly cost
       System.out.println(" ");
       System.out.println("sorted array by monthly cost............................................");
       Arrays.sort(databases, new monthlyCostComparator());
     
       
       //to sort in decreasing order- reverse array
//      for(int i=0; i<databases.length/2; i++){
//           DB temp = databases[i];
//           databases[i] = databases[databases.length -i -1];
//           databases[databases.length -i -1] = temp;
//       }
       System.out.println(Arrays.toString(databases));
	}

}
