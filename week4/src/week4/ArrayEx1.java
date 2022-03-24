package week4;

import java.util.Iterator;

public class ArrayEx1 {
	public static void main(String[] args) {
		//int[] ArrayInt;
		//ArrayInt = new int[5];
		int[] ArrayInt = new int[5];
		for (int i = 0; i < ArrayInt.length; i++) {
			ArrayInt[i] = i*10;
		}
		for (int i = 0; i < ArrayInt.length; i++) {
			System.out.println(ArrayInt[i]);
		}
		int[] ArrayInt2 = {1, 2, 3, 4, 5};
		for (int i : ArrayInt2) {
			System.out.println(i);
		}
		int ArrayInt3[] = ArrayInt2;
		for (int i : ArrayInt3) {
			System.out.println(i);
		}
	}
}
