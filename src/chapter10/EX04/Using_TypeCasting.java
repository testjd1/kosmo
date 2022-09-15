package chapter10.EX04;

/*
	업 캐스팅 : 자동으로 변환
		기본 자료형 : 좁은 범위 (int) -> 넓은 범위 (double)
		상속 : 자식타입 -> 부모타입
	다운 캐스팅 : 수동으로 변환
		기본 자료형 : 넓은 범위 -> 좁은 범위
		상속 : 부모타입 -> 자식타입  => 실행시 오류 발생 가능
*/

class A{}

class B extends A{}

class C extends B{}

class D extends B{}



public class Using_TypeCasting {

	public static void main(String[] args) {
		// 1. 업캐스팅 ( 자동으로 변환 )  : 생략시 컴파일러가 자동으로 추가.
		A ac = (A) new C();			// C -> A  업 캐스팅
		B bc = (B) new C();			// C -> B  업 캐스팅
		
		// bb = A,B 포함, B 타입으로 지정 ( A,B 모두 사용 )
		B bb = new B();
		A a = (A) bb;
		
		// 2. 다운 캐스팅 ( 수동으로 직접 할당 ) : 캐스팅 불가능한 경우 실행시 오류
		A aa = new A();			// aa는 A타입만 내포.
//		B b = (B) aa;			aa 는 B타입 내포x -> 다운캐스팅 불가능 구문은 문제 없으나 실행시 오류 발생.
		
//		C c = (C) aa;			aa 는 C타입 내포x -> 다운캐스팅 불가능 구문은 문제 없으나 실행시 오류 발생.
		
		// 3. 다운 캐스팅 가능한 경우
		A ab = new B();			// ab = A, B 둘다 내포 . A 타입으로 지정
		B b = (B) ab;			// A (부모) -> B(자식)
//		C c = (C) ab;			ab 는 C타입 내포x -> 다운캐스팅 불가능 구문은 문제 없으나 실행시 오류 발생.
		
		
		
		B bd = new D();			// bd = A,B,D를 내포하고 있고, B타입으로 지정
								// bd = A,B 의 필드와 메소드 접근 가능
		
		D d = (D) bd; 			// bd = D 내포, B -> D : 다운캐스팅
								// d = A, B, D 의 모든 필드 메소드 가능
// 		C c = (C) bd; 			// bd 는 C타입 내포x -> 다운캐스팅 불가능 구문은 문제 없으나 실행시 오류 발생.		
		
		A ad = new D();			// ad = A,B,D를 내포하고 있고, A타입으로 지정
		B b1 = (B) ad;			// A -> B 타입으로 다운 캐스팅
		D d1 = (D) ad; 			// A -> D 타입으로 다운 캐스팅
//		C c5 = (C) ad;			// ad 는 C타입 내포x -> 다운캐스팅 불가능 구문은 문제 없으나 실행시 오류 발생. 
		
		 
	}

}
