package week9;

public class CastTest {
	public static void main(String[] args) {
		
		byte b = 1;
		int i = 6;
		i = b;	//���� ū �� ������ ���� ��
//		b = i;	//������ ���� �� ���� ū �� �ȵ�
		b = (byte)i; //���� �ս��� �߻��ϴٷ��� ĳ������ �ϸ� ��
		SubCls sub = new SubCls(100, 99, 100);
//		SupCls sup = new SupCls(95, 89, 100);
		SupCls sup1 = new SubCls();	//���� �θ� ������ �ڽ� ��� �ڽ����� ���� ��� x
		Object sup2 = new SubCls();
//		SubCls sub1 = new SupCls();	//���� �ڽ� ������ �θ� ���X
		SubCls nsub = (SubCls)sup1;		//ĳ������ ���� �ڽ����׵� ���� ���� Ŭ���� ������ ĳ���ÿ��� �ݵ�� ��� ���迡 �־�� ��
		
		System.out.println(sub);
		
		
	}
}
