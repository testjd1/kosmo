package chapter08.EX02;

// import 시 * 사용 -> 해당 패키지의 모든 클래스를 import
//			하위 패키지 - 적용x
// 		// * : 패키지의 모든 클래스만 적용.

import chapter08.EX01.*;


public class Using_Package04 {

	public static void main(String[] args) {
		
		A a = new A ();
//		B b = new B ();		// 외부 클래스에서 접근 불가
		C c = new C ();		
//		D d = new D ();		// comm 하위의 패키지는 import 적용 x
		
	}

}
