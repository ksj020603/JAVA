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
		pizza.name = "�ڹ�����";
		System.out.println(pizza.name+"�� ������ "+pizza.getArea());
		Donut donut = new Donut();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		System.out.println(donut.name+"�� ������ "+donut.getArea());
	}
}
