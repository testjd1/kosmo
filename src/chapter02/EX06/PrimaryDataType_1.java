package chapter02.EX06;

public class PrimaryDataType_1 {
	
	public static void main(String[] args) {

		// byte < short < int < long < float < double
		
		// 업캐스팅 : 자동으로 적용, 작은 데이터 타입에 -> 큰 데이터 타입 변환
		// 다운 캐스팅 : 수동으로 적용, 큰 데이터 타입 -> 작은 데이터 타입 변환
		
		//자바에서 왼쪽과 오른쪽은 반드시 데이터 타입 같아야함
			//예외 : byte, short는 예외로 적용됨 
		int a = 10;
		float b = 10.11F;
		
		float c = a+b;   // 정수  a는 자동으로 float으로 업캐스팅됨
		System.out.println(c);
		
		// int d = a + b ;    // 오류 발생
		int d = a + (int)b;  // float b 를 int b로 다운캐스팅

		// boolean : true / false
		boolean bool1 = true;
		boolean bool2 = false;

		System.out.println(bool1);
		System.out.println(bool2);
		
		//정수 :byte, short, int, long
		// 기본 값 : int
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;      // int 값이 long 타입으로 업캐스팅 되어 글어감
		
		
		
	}

}
