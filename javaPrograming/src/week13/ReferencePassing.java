package week13;
class Circles {
	int radius;

	public Circles(int radius) {
		this.radius = radius;
	}

}
//good
public class ReferencePassing {

	static void increase(Circles m) {
		m.radius++;
	}

	public static void main(String args[]) {
		Circles pizza = new Circles(10);

		increase(pizza);

		System.out.println(pizza.radius);

	}

}
