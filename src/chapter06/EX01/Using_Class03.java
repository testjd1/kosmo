package chapter06.EX01;

// 같은 패키지 내에서 클래스 이름은 중복되면 오류가 발생됨
class C{
	int a;
	int b;
	String name;
	
	C() {}; // 기본 생성자 : 매개변수 값이 없고, 실행부도 없음. 생략 가능
	
	
	void call() {
		int c ;			// 지역 변수 : Stack
		System.out.println("출력 내용 입니다.");
		
		// System.out.println(c); -> 초기값 할당 해야함.
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
	}
}


public class Using_Class03 {

	public static void main(String[] args) {
		C c = new C();
		c.call();
		
		
		
		
		
	}

}
