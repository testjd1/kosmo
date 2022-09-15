package chapter10.EX01;


class Fruit{	// 부모 클래스
	
	String name; 			// 과일 이름
	String color; 			// 과일 색상
	int large;				// 과일 크기
	
	void eat() {
		System.out.println("모든 과일은 맛있습니다.");
	}
	
	void print() {
		System.out.println(name + ", " + color + ", " + large );
	}
}

class Apple extends Fruit{	// 자식 클래스
	// 자식 클래스만 가지는 필드1, 메소드1
	int AppleCode;
	void tja() {
		System.out.println("해당 과일은 원형입니다.");
	}
/*	
	 int appleCount;
	 void show(){
		System.out.print("사과의 갯수 : "+ appleCount);
	 }
*/	
}

class Orange extends Fruit{	// 자식 클래스
	// 자식 클래스만 가지는 필드1, 메소드1
	int OrangeCode;
	void tjo() {
		System.out.println("해당 과일은 타원형입니다.");
	}
	/*	
	 int OrangeCount;
	 void show(){
		System.out.print("오렌지의 갯수 : "+ OrangeCount);
	 }
*/
}

class Banana extends Fruit{	// 자식 클래스
	// 자식 클래스만 가지는 필드1, 메소드1
	int BananaCode;
	void tjb() {
		System.out.println("해당 과일은 긴 원형입니다.");
	}
	/*	
	 int BananaCount;
	 void show(){
		System.out.print("바나나의 갯수 : "+ BananaCount);
	 }
	 */
	
	
}
public class Using_Inheritance02 {

	public static void main(String[] args) {
		// 1.  Fruit
		System.out.println("========== Fruit 기본 틀 ========");
		Fruit f = new Fruit();
		f.name = "과일";
		f.color = "색상";
		f.large = 100;
		
		f.eat();
		f.print();
		
		
		// 2. Apple
		System.out.println("=========== Apple ========");		
		Apple a = new Apple();
		a.name = "사과";
		a.color = "빨강";
		a.large = 20;
		a.AppleCode = 1000;
		
		a.eat();
		a.print();
		a.tja();
		// a. show();
		
		
		
		// 3. Orange
		System.out.println("=========== Orange ========");		
		Orange o = new Orange();
		o.name = "오렌지";
		o.color = "주황";
		o.large = 15;
		o.OrangeCode = 1001;
		
		o.eat();			// 상속 메소드
		o.print();			// 상속 메소드
		o.tjo();			// 자신 메소드
	//  o. show();
		
		
		
		
		// 4. Banana
		System.out.println("=========== Banana ========");		
		Banana b = new Banana();
		b.name = "바나나";
		b.color = "노랑";
		b.large = 40;
		b.BananaCode = 1003;
		
		b.eat();
		b.print();
		b.tjb();
		// b. show();
	}

}
