package week4;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		int max = 0; 
		int min = 2147483647;
		int sum = 0;
		System.out.print("5개의 양의 정수를 입력하세요 : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
			if(intArray[i] > max)
				max = intArray[i];
			if(intArray[i] < min)
				max = intArray[i];
		}
		System.out.println();
		for (int i : intArray) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println("입력한 수 중에 최대값은"+max+"입니다.");
		sc.close();
	}
}