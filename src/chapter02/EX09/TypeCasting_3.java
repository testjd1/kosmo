package chapter02.EX09;

public class TypeCasting_3 {
	public static void main(String[] args) {
/*		
		// 1) 같은 자료형 간의 연산
		
		int value1 = 3 +5;
		int value2 = 8/5;					// 나눗셈할 경우 int 타입으로 정의되면 정확한값 출력 x
		double value2_1 = 8/5;				// 1.0 출력 ( 부정확 )
		double value2_2 = 8.0/5;
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0 / 5.0 ;
		
		//byte, short 연산 -> 정수로 처리 
		byte data1 = 3;
		byte data2 = 5;
		
		short data3 =7;
		short data4 = 9;
		

		// byte value5 = data1 + data2;  	// 오류 발생
		int value5 = data1 + data2; 	 	// byte, short 연산 후  int 타입으로 처리

		// short value5_2 = data3 + data4; 	// 오류 발생
		int value5_2 = data3 + data4;
		
		System.out.println(value1);
		System.out.println(value2);			// 1			
		System.out.println(value2_1);		// 1.0
		System.out.println(value2_2);		// 1.6 (정확)
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value5_2);
*/		
/*		
		// 2) 다른 자료형 간의 연산 ( 작은 자료형이 큰 자료형으로 자동으로 업캐스팅 )
		
		//int value6 = 5 + 3.5;     		// 오류 발생
		int value6 = (int)( 5 + 3.5 );  	// int로 다운캐스팅
		
		double value7 = 5 + 3.5;			// 5가 자동으로 업캐스팅 ( int -> double)
		int value7_1 = 5 + (int)3.5;		// 계산은 진행되나 0.5 소실
		
		double value8 = 5 / 2.0;
		
		byte data33 = 3;
		short data44 = 5;
		// short value9 = data33 + data44;	// 오류 발생
		int value9 = data33 + data44; 		// byte, short는 int로 계산
		double value10 = data33 + data44;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value7_1);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
*/
/*		
		// double 실험 
		float value13 = 23;
		double value15 = 35d;
		
		System.out.println(value13);
		System.out.println(value15);
*/
	}
}
