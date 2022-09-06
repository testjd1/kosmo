package chapter02.EX01;

public class UsageOfDataType {
	public static void main(String[] args) {
		
		// 변수 선언과 동시에 값 대입
		int a = 10;
		System.out.println(a);
		
		// 변수 선언 후 값 대입	
		int b;					// 선언, JAVA는 비어있는 상태가 됨
								// 변수 선언만 함 -> 가비지 상태
		
		
		b=30;					// 값 할당 		
		System.out.println(b);
	}
}
