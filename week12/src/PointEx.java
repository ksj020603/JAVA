class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point (x=" + x + ", y=" + y + ")";
	}
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
	
}
public class PointEx{
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = a;
		
		System.out.println(p.toString());
		
		if(a == b)
			System.out.println(a.hashCode() +"와"+ b.hashCode() + "는 같습니다.");
		else
			System.out.println(a.hashCode() +"와"+ b.hashCode() + "는 같지 않습니다.");
		if(a == c)
			System.out.println(a.hashCode() +"와"+ c.hashCode() + "는 같습니다.");
		else
			System.out.println(a.hashCode() +"와"+ c.hashCode() + "는 같지 않습니다.");
		if(a.equals(b))
			System.out.println("a와 b는 같습니다.");
		else
			System.out.println("a와 b는 같지 않습니다.");
	}
}
