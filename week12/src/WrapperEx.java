import java.util.Arrays;
import java.util.StringTokenizer;

public class WrapperEx {
	public static void main(String[] args) {
		Integer[] a = new Integer[7];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*45+1);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
	}
}
