package week9;

class D{
	
	int a, b, c;
	String name;
	
	public D() {   // Ŭ���� ��� �Ȱ��� �⺻ ������
	}

	public D(int a) {		//�ñ״��İ� �ٸ� ������  Ÿ��, ����, ����
		this.a = a;			//this�� �ʿ��� ������ �޾ƿ� �Ű������� ���� ������ ����(�ʵ�)�� ������ ������ ���� �ʱ� ������ ��� .�� �ʵ带 �ǹ�
		b = a;
	}

	public D(int a, int b) {		//�ñ״��İ� �ٸ� ������
		this(a);			//������ ���̵� ��밡�� (a)�� �����ڸ� �ǹ�
//		this.a = a;
		this.b = b;
	}

	public D(int a, int b, int c) { 		//�ñ״��İ� �ٸ� ������
		this(a, b);		//���� 2��¥�� �Ű����� �����ڸ� ȣ���Ѵٴ� �ǹ�
//		this.a = a;
//		this.b = b;
		this.c = c;
	}
	
	public D(int a, int b, String name) { 		//�ñ״��İ� �ٸ� ������
		this(a, b);
//		this.a = a;
//		this.b = b;
		this.name = name;
	}
	
	/*
	 * int sum() { return a + b; }
	 * 
	 * int sum(int c) { return c + b; } int sum(double c) { //Ÿ�� return 1; } int
	 * sum(double c, int h) { //���� return 2; }
	 * 
	 * int sum(int h, double c) { //���� return 2; }
	 * 
	 * int sum(int c , int d) { return c + d; }
	 */
	
	void print() {
		System.out.println("DŬ������ ��ü");
	}
}

public class ObjTest {
	public static void main(String[] args) {
		D d = new D(1, 2, "ȫ�浿");
		System.out.println("a = " + d.a + " b = " + d.b + " name = " + d.name);
		/*
		 * System.out.println(d.sum()); System.out.println(d.sum(5));
		 * System.out.println(d.sum(6,4));
		 */
	}
}
