package week11;

abstract class Shape{
	public abstract void draw();
	public void abc() {
		System.out.println("Shape");
	}
}
class Line extends Shape{

	@Override
	public void draw() {
		
	}
		
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rectangle");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethodOverrideEx {
	static void paint(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
		//Line line = new Line();
		//Shape rect = new Shape();
		//paint(rect);
		
		//paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
	}
}

