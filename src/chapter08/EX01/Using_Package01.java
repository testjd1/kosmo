package chapter08.EX01;
import chapter08.EX01.B;
public class Using_Package01 {

	public static void main(String[] args) {
		// A 클래스와 같은 패키지에 존재 : import 없이 바로 접근 가능
		A a = new A();
		
		
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
		System.out.println("==B 클래스 접근 ==");
		 
		B b = new B();
		System.out.println(b.a);
		System.out.println(b.b);
		b.print();
	}
	

}
