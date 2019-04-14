package L24;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {

	@Override
	public int compare(Car T, Car O) {
		return T.speed-O.speed;
	}

}
