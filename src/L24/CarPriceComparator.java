package L24;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

	@Override
	public int compare(Car T, Car O) {
		return O.price - T.price;
	}

}
