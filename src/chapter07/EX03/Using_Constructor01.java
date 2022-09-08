package chapter07.EX03;

class A {
	//클래스 내부에 생성자가 존재하지 않는 경우 컴파일러가 기본 생성자 자동으로 만들어줌
	// A (){ }
	// 1. 필드 ( 인스턴스 필드 : 객체 생성 후 호출 )
	int m;
	
	// 3. 메소드 : 객체 생성 후 사용 ( 호출 )
	void work() {
		System.out.println(m);
	}
}
class B {
	// 1. 필드
	int m;
	// 2. 기본 생성자
	B() { }
	
	// 3. 메소드
	void work() {
		System.out.println(m);
	}
}

class C {
	// 1. 필드
	int m ;
	
	// 2. 생성자 : 매개변수가 하나인 생성자
	C (int m){  // 입력 매개변수, 입력 매개변수를 받는 변수, 필드의 변
		this.m = m;
	}
	// 3. 메소드
	void work() {
		System.out.println(m);
	}
}

public class Using_Constructor01 {

	public static void main(String[] args) {
		// 객체 생성
		A a = new A();		// 기본 생성자 호출 : A(),  생성자 생략
		
		System.out.println(a.m);
		a.work();
		
		System.out.println("=======================");
		
		B b = new B();
		System.out.println(b.m);
		b.work();
		
		System.out.println("=======================");
		// 오류 발생 -> 이미 생성자 있으므로 
		// C c = new C();	
		
		C c = new C(10); // 필드의 값을 초기화 할 때 생성자 사용
	}

}
