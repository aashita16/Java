package Part2;

import java.util.Comparator;

public class monthlyCostComparator implements Comparator<DB> {
	
	@Override
    public int compare(DB o1, DB o2) {
        return (int) (o1.MonthlyCost() - o2.MonthlyCost());
    }
}
