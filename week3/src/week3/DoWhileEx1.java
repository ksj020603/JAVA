package week3;

public class DoWhileEx1 {
	public static void main(String[] args) {
		char ch = 'a';
		
		do {
			System.out.print(ch);
			//ch++;
			ch = (char)(ch + 1);
		}while(ch <= 'z');
	}
}
