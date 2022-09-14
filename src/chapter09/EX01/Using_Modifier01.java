package chapter09.EX01;

// A 클래스와 동일한 패키지 내에 존재하는 클래스

public class Using_Modifier01 {

	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.a);		// public
		System.out.println(a.b);		// protected
		System.out.println(a.c);		
//		System.out.println(a.d);		// private, 동일한 파일에서만 접근, 접근 불가
		
		// 메소드 출력
		a.print1(); 					// public
		a.print2();     				// protected
		a.print3();
		// a.print4();
		
		System.out.println(" 상속 된 객체  E");
		E e = new E();
		e.print();
	}

}
