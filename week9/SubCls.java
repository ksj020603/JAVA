package week9;

public class SubCls extends SupCls {
	int sum;
	double avg;
	String addr;

	public SubCls() {
		super();
	}
	
	public SubCls(int kor, int eng, int math) {
		
		super(kor, eng, math);
		
//		this.kor = kor; 
//		this.eng = eng;
//		this.math = math;
		sum = kor + eng + math;
		avg = sum / 3.0;
	}
	@Override
	public String toString() {  //상속 받은 것을 재정의 하는 것 오버라이딩
		return "kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg;
	}
}
