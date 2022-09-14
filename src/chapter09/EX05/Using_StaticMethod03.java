package chapter09.EX05;

// static 필드의 값 초기화 : 클래스 내부에서 static { 필드 값 초기화 }
// 클래스명, 필드명, 메소드명으로 호출될 때  static{} 값 젤 먼저 호출

class C{
	int a;
	static int b;
	
	static {		// 클래스가 로드될 떄 제일 먼저 작성 = 생성자와 같은 역할
//		a = 10; ->  인스턴스 필드는 초기화x
		b= 5;
		System.out.println("클래스 C가 로딩되었습니다.");
	}
	
	C(){			// 생성자 : 객체 생성 시 필드의 초기값 할당.
		a= 3;
		b= 55;
	}
	
}

public class Using_StaticMethod03 {
	
	int a = 100;
	static int b = 200;
	
	void abc() {
		System.out.println(" abc() - 인스턴스");
	}
	static void bcd() {
		System.out.println("bcd()- 정적 메소드");
	}
	
	public static void main(String[] args) {
		// 객체 생성 없이 static 필드 호출.
	
		System.out.println(C.b);
		
//		System.out.println(a);				// 인스턴스 필드
		System.out.println(b);
		
//		abc();
		bcd();
	}

}
