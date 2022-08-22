package Part2;

import java.util.Comparator;

public class nameComparator2 implements Comparator<DB> {
	
	@Override
    public int compare(DB o1, DB o2) {
        return o1.name.compareTo(o2.name);
    }
}
