package week3;

import java.util.Scanner;

public class ContinueEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("5개의 정수 입력하세요.");
		int i=1;
		while(i<=5) {
			System.out.print(i+"번째 정수 입력 : ");
			int num = sc.nextInt();
			if(num < 0) {
				i++;
				continue;
			}
			sum += num;
			i++;
		}
		System.out.println("양의 정수들의 합은 " + sum);
	}
}
