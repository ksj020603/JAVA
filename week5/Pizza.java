package week5;
class Circle{
	int radius;
	String name;
	// method overloading   매개변수의 타입, 개수, 위치  시그니처

	double getArea(int radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(int radius, String name) {
		this.radius = radius;  //this(radius);
		this.name = name;
	}
	double getArea() {
		return 3.14*radius*radius;
	}
}
public class Pizza {
	public static void main(String[] args) {
		Circle pizza = new Circle(5);
//		pizza.radius = 5; 
		pizza.name = "자바피자";
		System.out.println(pizza.name+"의 면적은 "+pizza.getArea(pizza.radius));
		Circle donut = new Circle(2, "자바도넛");
//		donut.radius = 2;
//		donut.name = "자바도넛";
		System.out.println(donut.name+"의 면적은 "+donut.getArea(donut.radius));
	}
}
