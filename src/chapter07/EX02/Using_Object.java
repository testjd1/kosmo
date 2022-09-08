package chapter07.EX02;
/* 
class 외부에 올 수 있는것 : 패키지 , 임포트( 같은 패키지에 존재x 클래스)
	
*/	


class A{
	/*
	클래스 :  객체를 생성하기 위한 설계도 
	클래스 내부에 올 수 있는 것 (4가지)
	1. 필드 : 클래스에서 선언된 변수
	2. 생성자
	3. 메소드
	* 4. 이너클래스	
	
	*/
	
	int m;				// Heap 공간에 저장, 강제 초기화
	int n;
	double k;			// 0.0
	String l;			// null
	
	// 생성자 : 클래스 = 반드시 생성자 존재.
	// 		기본 생성자 생략 가능 A() {}
	
	// 객체 생성시 생성자 호출
	// 객체의 초깃값 세팅
	// 클래스 내부의 다른 생성자가 존재할 시 컴파일러가 기본 생성자를 자동으로 만들어 주지 않음
	
	
	
	A(){System.out.println("기본 생성자 호출");}
/*	A (int m, int n, double k, String l) {

		this.k = k;
		this.l = l;
		this.m = m;
		this.n =n;
	}
*/	
	
	/** 메소드 : 리턴타입 메소드명(입력매개변수 ){실행코드;}*/
	void work1() {
		System.out.println("work1 메소드 호출");
	}
	// 프로그램의 기능 코드로 작성. 호출해서 작동
	int work2(int a, int b) {
		System.out.println("work2 메소드 호출 ");		
		return a+b;
	}
	
	// work3
	double work3(int a, double b, String c) {
		System.out.println("work3 메소드 호출");
		System.out.println(a + " , " + b + "," + c);
		return a + b;
	}
	
	
	String work4(String a) {
		return a;
	}
}









public class Using_Object {

	public static void main(String[] args) {
	// 객체 생성 : Main 메소드에서 생성
		
		A a1 =  new A();
		// A : 클래스
		// a1 : 객체
		// new : 객체 생성, Heap에 생성
		// A() : 클래스 내부의 생성자 호출, 기본 생성자
		
		// 객체의 필드 값 출력
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.l);
		System.out.println("=======================");
	
		
		a1.m = 10;
		a1.n = 20;
		a1.k = 30.0;
		a1.l = "안녕하세요";
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.l);
		System.out.println("=======================");
		
		/** 메소드 호출 work1() */
		a1.work1();
		
		// 메소드 호출 work2( 정수, 정수 )
		int k = a1.work2(10,20);
		System.out.println(k);
		System.out.println(a1.work2(40,50 ));
		System.out.println("=======================");
		
		/** 메소드 호출 work3(정수, 더블, 문자열 ) */
		double d = a1.work3(10, 20, "오늘");
		System.out.println(d);
		System.out.println("=======================");
		System.out.println(a1.work3(30,30.0,"날씨"));
		
		// 메소드 호출 work4( 문자열 ) 
		String s = a1.work4("안녕");
		System.out.println(s);
		System.out.println(a1.work4("하세요"));
		
		// 클래스 : 객체 생성 위한 설계도
		// 객체 : 클래스 기반으로 만들어진 인스턴스 <- Heap에 로드됨
		// 인스턴스화 : 클래스는 객체화 해야 사용 가능 하다.
	}

}
