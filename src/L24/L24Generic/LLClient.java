package L24.L24Generic;

import L24.Car;

public class LLClient {
public static void main(String[] args) {
	Car[] c = new Car[5];
	c[0] = new Car(1000, 20, "BLACK");
	c[1] = new Car(10, 2, "RED");
	c[2] = new Car(500, 30, "Blue");
	c[3] = new Car(1080, 10, "Greeb");
	c[4] = new Car(140, 80, "White");
	LinkedListGeneric<Car> lc= new LinkedListGeneric<>();
	lc.addLast(c[0]);
	lc.addLast(c[1]);
	lc.addLast(c[2]);
	lc.addLast(c[3]);
	lc.addLast(c[4]);
	lc.display();
	
}
}
