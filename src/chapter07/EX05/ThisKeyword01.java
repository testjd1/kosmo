package chapter07.EX05;

class A {
	int m;
	int n;
	
	//A(){} : 기본 생성자 [ 생략 ]
	
	void init( int a, int b) {
		int c;
		c= 3;
		this.m = a ; 			// this 자신의 객체를 의미. 보통 생략
		this.n = b;
	}
	
	void work() {
		init(2,3);
		System.out.println(this.m + "," + this.n); // this생략시 컴파일러 자동 할당
	}
}



public class ThisKeyword01 {

	public static void main(String[] args) {
	/*
		This Keyword : 클래스의 필드와 메소드에 컴파일러가 자동으로 할당
		-> 객체 자신을 뜻함.
		필드와 메소드를 선언시에는 this 키워드를 사용하면 안됨.
		필드와 메소드가 클래스와 메소드 내에서 사용될 때 컴파일러가 자동으로 할당.
		기본적으로는 생략되어 있음.
		메소드나 생성자에서 인풋 매개변수 이용, 필드이름이 동일할 경우 명시해야함.
		
		
		This Method : 클래스 내에서 다른 생성자 호출, 생성자에서 사용
	*/
	}

}
