package chapter09.EX02;
import chapter09.EX01.A;

/* 
 	class D는 class A 상속 받음 ( 패키지 외부에서 상속 설정)
	D 클래스는 A 클래스의 필드와 메소드 상속받음
	
	protected 접근 제어자 : 상속 관계가 있을 때만 외부 패키지에서 접근 가능
	
*/
public class D extends A{
	public void print() {
		
		System.out.println(a);	// public				// 다른 패키지에서 접근 됨
		System.out.println(b);	// protected			// 다른 패키지에서 접근 됨 ( 상속 )
//		System.out.println(c);	// default
//		System.out.println(d);	// private
		
		System.out.println("부모 클래스의 메소드 출력");
		print1();		// public
		print2();		// protected
//		print3();		// default
//		print4(); 	// private

	
	}
}
