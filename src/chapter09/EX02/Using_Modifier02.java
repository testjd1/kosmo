package chapter09.EX02;

import chapter09.EX01.A;
// A 클래스와 다른 패키지에 존재 : import 사용

public class Using_Modifier02 {

	public static void main(String[] args) {
		// import 됨
		A a = new A();
		
		// 필드 접근
		System.out.println(a.a);		// public
	// 접근 불가	System.out.println(a.b);		// 다른 패키지에서 접근 => 상속
	// 접근 불가	System.out.println(a.c);		// default
	// 접근 불가	System.out.println(a.d);		// private
		
		
		// 메소드 접근
		a.print1();			//	 public
//		a.print2();			// protected
//		a.print3();			// default
//		a.print4();			// private
		
		System.out.println("=== D출력 ===");
		D d = new D();
		d.print();
	}

}
