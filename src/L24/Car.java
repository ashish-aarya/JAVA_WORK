package L24;

public class Car implements Comparable<Car> {
	int price;
	int speed;
	String colour;

	public Car(int p, int s, String c) {
		this.price = p;
		this.speed = s;
		this.colour = c;

	}

	@Override
	public String toString() {
		return "P" + price + "\t S " + speed + "\t C " + colour;
	}

	@Override
	public int compareTo(Car o) {

		return this.price - o.price;
		// return o.speed-this.speed;
		// return this.colour.compareTo(o.colour);
	}
}