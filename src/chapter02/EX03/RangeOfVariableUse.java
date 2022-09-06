package chapter02.EX03;

public class RangeOfVariableUse {
	public static void main(String[] args) {
		// 변수의 생존 기간 : {} 블록 내에서만 생존 가능
		
		int value1 = 3;
		
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);			// 블록 내에서만 사용 가능
		}
		System.out.println(value1);
//		System.out.println(value2);  			// 오류 발생
	}
}
