package chapter02.EX05;

public class DataType02 {

	public static void main(String[] args) {
		// float 과 double의 정밀도
		// float : 소숫점 7자리까지 유지
		// double : 소숫점 15자리까지 유지
		float f1 = (float)1.000000001F;  
		//float 변수에 값 저장시 casting 필요	리터럴 : 변수에 저장되는 값 호칭	
		// 변수 값 앞 : float, 변수값 뒤 F
		System.out.println(f1);
		
		float f2 = 1.000000001F;
		System.out.println(f2);
		
		System.out.println("=======================");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
	}
	

}
