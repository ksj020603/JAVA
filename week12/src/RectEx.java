class Rect{
	private int height, width, area;

	public Rect(int height, int width) {
		super();
		this.height = height;
		this.width = width;
		area = height * width;
	}
	@Override
	public String toString() {
		return "Rect [height=" + height + ", width=" + width + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Rect r = (Rect)obj;
		if(area == r.area)
			return true;
		else
			return false;
	}
}
public class RectEx {
	public static void main(String[] args) {
		Rect r1 = new Rect(2,3);
		Rect r2 = new Rect(3,2);
		if(r1.equals(r2))
			System.out.println("두 사각형의 면적은 같습니다.");
		else
			System.out.println("두 사각형의 면적은 같지 않습니다.");
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.SIZE);
	}
}
