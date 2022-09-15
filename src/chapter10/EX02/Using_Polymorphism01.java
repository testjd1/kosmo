package chapter10.EX02;
/*
 	다형성 (Polymorphism) : 하나의 개게가 여러가지 타입을 가질 수 있다.
 	메소드 오버라이딩을 사용해서 부모 클래스의 메소드를 재 정의해서 자식 클래스에서 재 사용한다.
 	
 	
 	상속을 사용한 다형적 표현
		- 상속 관계에서 객체를 생성 시 부모 타입으로 선언할 수 있다.
		- 부모타입으로 선언 하면 부모 클래스의 필드와 메소드만 사용 가능함.
		- 자식 객체를 생성하면서 부모 타입으로 지정하면 업캐스팅이 자동으로 됨
		- 다시 자식 클래스의 필드와 메소드를 사용하려면 다운캐스팅을 해야 사용 가능

*/

class A{}						// 부모 클래스
class B extends A{}				// 자식 클래스, 부모 A
class C extends B{}				// 자식 클래스, 부모 B
class D extends B{} 			// 자식 클래스. 부모 B

public class Using_Polymorphism01 {

	public static void main(String[] args) {
		
		
		// 1.  A 타입의 다형적 표현
		
		A a1 = new A(); 		// A 클래스는 A 타입이다.   	A = A이다. (0)
							// a1 :  A타입만 내포, A타입으로 지정
		A a2 = new B();			// B 클래스는 A 타입이다. 	B = A이다. (0)
							// a2 : A,B 타입 내포, A타입으로 지정
		A a3 = new C();			// C 클래스는 A 타입이다. 	C = A이다. (0)
							// a3 : A,B,C 타입 내포, A타입으로 지정
		A a4 = new D();			// D 클래스는 A 타입이다. 	D = A이다. (0)
							// a4 : A,B,C,D 타입 내포, A타입으로 지정
		
		
		// 2. B 타입으로 다형적 표현
		// B b1 = new A(); 		// A = B (X)
		B b2 = new B(); 		// B = B (o)
		B b3 = new C();			// C = B (o)
		B b4 = new D();			// D = B (o)
		
		// 3. C 타입으로 다형적 표현
		// C c1 = new A();		// A = C (x)
		// C c2 = new B();		// B = C (x)
		C c3 = new C();			// C = C (o)
		// C c4 = new D();		// D = C (x)
		
		// 4. D 타입으로 다형적 표현
		// D d1 = new A();		// A = D (x)
		// D d2 = new B();		// B = D (x)
		// D d4 = new C();		// C = D (x)
		D d3 = new D();			// D = D (o)
		
		
		
	}

}
