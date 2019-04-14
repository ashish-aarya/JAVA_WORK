package L24;

import java.util.Comparator;

public class CarColourComparator implements Comparator<Car> {

	
	@Override
	public int compare(Car T, Car O) {
		return T.colour.compareTo(O.colour);
	}

}
