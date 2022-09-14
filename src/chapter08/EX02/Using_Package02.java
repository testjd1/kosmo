package chapter08.EX02;

import chapter08.EX01.A;

// import chapter08.EX01.A; -> 동일한 클래스는 하나만 가능

//import chapter08.EX01.B; -> 접근 제어자가 default
public class Using_Package02 {

	public static void main(String[] args) {
		
		// A 클래스는 동일한 패키지 내에 존재 x , import해서 사용
		// -- A class는 접근 제어자가 public, protected (상속) 지정되어있어야함.
		
		
		A a = new A();			// 다른 패키지에서 접근
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
		System.out.println("== B 클래스 ( default) =====");
		// b 클래스는 다른 패키지에 존재하고, 접근 제어자가 default로 할당
		// B b = new B();
		
		System.out.println("=====com.A 클래스 객체 생성======");
		chapter08.EX01.com.A  aa = new chapter08.EX01.com.A();
		System.out.println(aa.aa);
		System.out.println(aa.bb);
		
		aa.print();
		
	}

}
