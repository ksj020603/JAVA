package week9;

public class CastTest {
	public static void main(String[] args) {
		
		byte b = 1;
		int i = 6;
		i = b;	//왼쪽 큰 것 오른쪽 작은 것
//		b = i;	//오른쪽 작은 것 왼쪽 큰 것 안됨
		b = (byte)i; //정보 손실이 발생하다러도 캐스팅을 하면 됨
		SubCls sub = new SubCls(100, 99, 100);
//		SupCls sup = new SupCls(95, 89, 100);
		SupCls sup1 = new SubCls();	//왼쪽 부모 오른쪽 자식 허용 자식한테 접근 허용 x
		Object sup2 = new SubCls();
//		SubCls sub1 = new SupCls();	//왼쪽 자식 오른쪽 부모 허용X
		SubCls nsub = (SubCls)sup1;		//캐스팅을 통해 자식한테도 접근 가능 클래스 끼리의 캐스팅에는 반드시 상속 관계에 있어야 함
		
		System.out.println(sub);
		
		
	}
}
