package week6;

public class CallByValue {
	public static void main(String[] args) {
		int n = 10;
		increase(n);
		System.out.println(n);
	}
	static void increase(int n) {
		n++;
	}
}
