package chapter09.EX03;

// 기존 클래스의 외부 클래스 생성 : 다른 패키지에서 접근이 불가능

class A{
	int m = 10;
	int n = 20;
	
	void print() {
		System.out.println(m + "," + n);
	}
}


public class Using_Modifier10 {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		
		B b =  new B();
		b.print();
	}

}
