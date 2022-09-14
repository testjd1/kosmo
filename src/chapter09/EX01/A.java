package chapter09.EX01;
/*
 	클래스 외 접근 지정자 : public , default
 	필드 , 생성자, 메소드 : public, protected, default ,private
 			public  : 다른 패키지, 같은 패키지
 		protected   : 다른 패키지 ( 상속 ), 같은 패키지
 			default : 같은 패키지에서만 작동
 	
 */
public class A {
	// 필드의 접근 제어자
	public int a = 10;			// 다른 패키지, 같은 패키지
	protected int b = 20;		// 다른 패키지(상속), 같은 패키지
	int c = 30;					// 같은 패키지
	private int d = 40;			// 같은 파일 
	
	// 메소드의 접근 제어자
	public void print1() {
		System.out.println(" A 클래스 출력 - public ");
	}
	public void print2() {
		System.out.println(" A 클래스 출력 - protected ");
	}
	public void print3() {
		System.out.println(" A 클래스 출력 - default ");
	}
	public void print4() {
		System.out.println(" A 클래스 출력 - private ");
	}
}
