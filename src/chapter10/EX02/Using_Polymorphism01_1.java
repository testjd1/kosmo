package chapter10.EX02;

class Aa{
	int a = 10;
}

class Bb extends Aa{
	int b = 20;
}

class Cc extends Bb{
	int c = 30;
}

class Dd extends Bb{
	int d = 40;
}

public class Using_Polymorphism01_1 {

	public static void main(String[] args) {
		// 다형적 표현
		Aa a1 = new Aa();				// 타입 : Aa, 객체 : Aa()
		System.out.println(a1.a);
			
		Bb b1 = new Bb();				// 타입 : Bb, 객체 : Bb()
		System.out.println(b1.a);		// 상속
		System.out.println(b1.b);		// 자신
		
		// 자식 객체를 생성시킴 부모타입으로 지정 -> 부모 필드와 메소드만 접근 가능
		// 좌, 우 타입은 같아야함
		// 업 캐스팅 : 자식 타입을 부모 타입으로 변환 ( 자동 )
		
		Aa a2 = new Bb();				// 타입 : Aa, 객체 : Bb()
										// B는 A이다.
		System.out.println(a2.a);
		
		// 다운 캐스팅 : 부모타입을 자식타입으로 변환 ( 수동 )
		System.out.println(" == Aa 타입의 객체 a2를 Bb 타입으로 다운 캐스팅 ==");
		Bb b2 = (Bb) a2;
		System.out.println(b2.a);		// Aa 필드
		System.out.println(b2.b); 		// Bb 필드
		
		// 업 캐스팅 : 자동으로 적용
		Aa a3 = b2;						// Aa a3 = (Aa) b2
		System.out.println(a3.a);
		
		// 다운 캐스팅 
		Bb b3 = (Bb) a3;
		System.out.println(b3.a);
		System.out.println(b3.b);
		
		System.out.println("=================================================");
		
		// Dd() 객체를 생성하면서 Aa타입으로 업 캐스팅
		Aa a5 = new Dd();
		System.out.println(a5.a);
		
		// Aa 타입 a5를 Bb 타입으로 다운캐스팅
		
		Bb b10 = (Bb) a5;
		System.out.println(b10.a);
		System.out.println(b10.b);
		
		// Bb 타입 b10을 Dd 타입으로 다운캐스팅
		
		Dd d10 = (Dd) b10;
		System.out.println(d10.a);
		System.out.println(d10.b);
		System.out.println(d10.d);
		
		
		// Aa 타입의 a5를 Dd 타입으로 다운 캐스팅
		
		Dd d11 = (Dd) a5;
		System.out.println(d11.a);
		System.out.println(d11.b);
		System.out.println(d11.d);
		
		// 업 캐스팅
		
		Aa a20 = d11;

	}

}
