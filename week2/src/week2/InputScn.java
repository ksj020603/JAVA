package week2;

import java.util.Scanner;

public class InputScn {
	public static void main(String[] args) {
		int a;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.println(a);
		System.out.println(name);
		
		sc.close();
	}
}
