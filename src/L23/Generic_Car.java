package L23;

public class Generic_Car {
	public static void main(String[] args) {
		Car[] c = new Car[5];
		c[0] = new Car(1000, 20, "BLACK");
		c[1] = new Car(10, 2, "RED");
		c[2] = new Car(500, 30, "Blue");
		c[3] = new Car(1080, 10, "Greeb");
		c[4] = new Car(140, 80, "White");
		display(c);
		bubble_short(c);
		display(c);

	}

	public static <t> void display(t[] arr) {
		for (t v : arr)
			System.out.println(v);
		System.out.println("------------");
	}

	public static <t extends Comparable<t>> void bubble_short(t arr[]) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					t temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
