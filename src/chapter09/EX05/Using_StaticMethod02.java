package chapter09.EX05;

class B{
	int a = 10;
	static int b = 20;
	
	void abc() {		// 인스턴스 메소드  : 객체 생성 후 사용
						// 인스턴스 필드, 정적 필드, 인스턴스 메소드, 정적 메소드
		System.out.println("인스턴스 메소드 - abc()");
		System.out.println(a); 		// 인스턴스 필드
		System.out.println(b);		// 정적 필드
		cde();			// 인스턴스 메소드
		bcd();			// 정적 메소드
		
	}
	
	static void bcd() {				// 정적 메소드, 객체 생성후 호출, 생성 없이도 호출
									// 정적 필드, 정적 메소드
		// 정적 메소드는 객체 생성 없이 사용 가능, 인스턴스필드,메소드는 객체생성 해야함.
		System.out.println("정적 메소드 - bcd()");		
//		System.out.println(a);				// 인스턴스 필드 x
		System.out.println(b);			// 정적 필드 o
//		cde();							// 인스턴스 메소드 x
		def();							// 정적 메소드 o
		
	}
	
	
	void cde() {
		System.out.println("인스턴스 메소드 - cde()");
	}
	static void def() {
		System.out.println("정적 메소드 - def()");
	}
}

public class Using_StaticMethod02 {

	public static void main(String[] args) {
		
		System.out.println("======static : 객체 없이 호출 =========");
//오류	System.out.println(B.a);  // 인스턴스 필드
		System.out.println(B.b);
//오류	B.abc();		// 인스턴스 메소드
		B.bcd();		// 정적 메소드
		B.def();		// 정적 메소드
//오류	B.cde();		// 인스턴스 메소드
		
		System.out.println("=====객체 생성후 필드, 메소드 호출 =========");
		
		// 객체 생성
		B b = new B();
		b.abc();
		b.bcd();
		b.cde();
		b.def();

		
	}

}
