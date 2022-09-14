package chapter07.EX05;

import java.util.Scanner;

class Car{
/*
	this 키워드 : 필드나 메소드 선언시 사용 불가
				생성자 , 메서드 내부에서 필드나 메서드 사용 시 객체필드나 메소드 지킴
				기본적으로 생략 
	this() 	  : 생성자 내부에서만 사용, 반드시 첫 라인에 위치
				자신의 객체와 다른 생성자 호출
				생성물 오버라이딩 -> 코드 간략하게 사용
				
*/
	String companyName;				// 현대 자동차
	String color;					// 검은색
	double maxSpeed;				// 200.0 km/h
	
	Car(){
		companyName = "현대자동차" ;	// this 키 생략시 자동으로 컴파일러 할당
		color = "검은색";		
		maxSpeed = 200.0;
	}
	Car(String companyName){
		this();
		this.companyName = companyName;
	}
	Car(String companyName, String color){
		this(companyName);
		this.color = color;
	}
	Car(String companyName, String color, double maxSpeed){
		this(companyName,color);
		this.maxSpeed = maxSpeed;
	}
	
	void print() {
		System.out.println("회사의 이름은 " + companyName + "입니다.");
		System.out.println("색깔은 " + color + "입니다.");
		System.out.println("최고 속력은 " + maxSpeed + "km/h입니다.");
	}
	
	
	
}


public class ThisMethod04 {

	public static void main(String[] args) {

		System.out.println("========매개변수 0개 일때 ======");
		Car c = new Car();
		c.print();
		
		System.out.println("========매개변수 1개 일때 ======");
		Car c1 = new Car("벤츠");
		c1.print();
		
		System.out.println("========매개변수 2개 일때 ======");
		Car c2 = new Car("벤츠","빨간색");
		c2.print();
		
		System.out.println("========매개변수 3개 일때 ======");
		Car c3 = new Car("벤츠","빨간색",240);
		c3.print();
		
		System.out.println("========매개변수 직업 입력 ======");
		Scanner sc = new Scanner(System.in);
		System.out.println("회사를 입력하세요 : ");
		String a = sc.nextLine();
		System.out.println("색깔을 입력하세요 : ");
		String b = sc.nextLine();
		System.out.println("최고 속력을 입력하세요 : ");
		double d = sc.nextDouble();
		Car c4 = new Car(a,b,d);
		c4.print();
		
	}

}
