package week5;

public class Donut {
	int radius;
	String name;
	double getArea() {
		double area;
		area = 3.141592 * radius * radius;
		return area;
	}
	public static void main(String[] args) {
		Donut pizza = new Donut();
		pizza.radius = 5;
		pizza.name = "자바피자";
		System.out.println(pizza.name+"의 면적은 "+pizza.getArea());
		Donut donut = new Donut();
		donut.radius = 2;
		donut.name = "자바도넛";
		System.out.println(donut.name+"의 면적은 "+donut.getArea());
	}
}
