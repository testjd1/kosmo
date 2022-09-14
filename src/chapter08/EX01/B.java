package chapter08.EX01;

// default : 같은 패키지 내에서만 접근. 다른 패키지에서는 접근 불가능


class B {
	int a = 3 ;
	int b = 4;
	
	

 void print() {
	System.out.println("B클래스 접근");
	}
}