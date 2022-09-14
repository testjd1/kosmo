package chapter08.EX02;

// import 사용 하지 않고 외부 패키지 접근
// A 클래스 : public -> 접근가능
// B 클래스 : default -> 접근 불가능

public class Using_Package03 {

	public static void main(String[] args) {
		chapter08.EX01.A a = new chapter08.EX01.A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		
		a.print();

	}

}
