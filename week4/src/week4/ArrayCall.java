package week4;

public class ArrayCall {
	public static int sum(int def[], int n) {
		int sum = 0;
		def[n] = 100;
		for (int i =0; i < def.length; i++) {
			sum += def[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] abc = {99, 89, 96, 87, 99};
		int k=3;
		int hap = sum(abc, k);
		for (int i : abc) {
			System.out.println(i);
		}
	}
}
