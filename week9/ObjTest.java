package week9;

class D{
	
	int a, b, c;
	String name;
	
	public D() {   // 클래스 명과 똑같음 기본 생성자
	}

	public D(int a) {		//시그니쳐가 다른 생성자  타입, 순서, 개수
		this.a = a;			//this가 필요한 이유는 받아온 매개변수와 현재 지정한 변수(필드)가 같으면 구분이 되지 않기 때문에 사용 .은 필드를 의미
		b = a;
	}

	public D(int a, int b) {		//시그니쳐가 다른 생성자
		this(a);			//다음과 같이도 사용가능 (a)은 생성자를 의미
//		this.a = a;
		this.b = b;
	}

	public D(int a, int b, int c) { 		//시그니쳐가 다른 생성자
		this(a, b);		//위의 2개짜리 매개변수 생성자를 호출한다는 의미
//		this.a = a;
//		this.b = b;
		this.c = c;
	}
	
	public D(int a, int b, String name) { 		//시그니쳐가 다른 생성자
		this(a, b);
//		this.a = a;
//		this.b = b;
		this.name = name;
	}
	
	/*
	 * int sum() { return a + b; }
	 * 
	 * int sum(int c) { return c + b; } int sum(double c) { //타입 return 1; } int
	 * sum(double c, int h) { //개수 return 2; }
	 * 
	 * int sum(int h, double c) { //순서 return 2; }
	 * 
	 * int sum(int c , int d) { return c + d; }
	 */
	
	void print() {
		System.out.println("D클래스의 객체");
	}
}

public class ObjTest {
	public static void main(String[] args) {
		D d = new D(1, 2, "홍길동");
		System.out.println("a = " + d.a + " b = " + d.b + " name = " + d.name);
		/*
		 * System.out.println(d.sum()); System.out.println(d.sum(5));
		 * System.out.println(d.sum(6,4));
		 */
	}
}
