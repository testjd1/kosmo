package chapter10.EX07;


class Animal{
	// 자식 클래스에서 두개 메소드 오버라이딩
	//  Animal타입으로 정의, 배열에 저장 후 오버라이딩 된 메소드 출력 ( for, Enhanced For)
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}

class Tiger extends Animal{
	int count;
	
	Tiger(){}
	
	Tiger(int count){
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("호랑이가 달립니다.");
	}
	void eat() {
		System.out.println("호랑이가 고기를 먹습니다.");
	}
	
	void print() {
		System.out.println("호랑이의 수는 " + count + "마리 입니다.");
	}
}

class Egel extends Animal{
	int count;
	
	Egel(){}
	
	Egel(int count){
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("독수리는 날라다닙니다.");
	}
	void eat() {
		System.out.println("독수리가 물고기를 먹습니다.");
	}
	void print() {
		System.out.println("독수리의 수는 " + count + "마리 입니다.");
	}
	
}

class Fish extends Animal{
		int count;
	
	Fish(){}
	
	Fish(int count){
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("물고기는 수영해서 다닙니다.");
	}
	void eat() {
		System.out.println("물고기는 해조류를 먹습니다.");
	}
	void print() {
		System.out.println("물고기의 수는 " + count + "마리 입니다.");
	}
	
}
class Dog extends Animal{
	int count;
	
	Dog(){}
	
	Dog(int count){
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("강아지는 신나게 뛰어다닙니다.");
	}
	void eat() {
		System.out.println("강아지는 다 먹습니다.");
	}
	void print() {
		System.out.println("강아지의 수는 " + count + "마리 입니다.");
	}
	
}


public class Using_Method_Overriding04 {
	public static void main(String[] args) {
		// 1. 객체 생성
		Animal aa = new Animal();
		Animal t = new Tiger(10);
		Animal e = new Egel(5);
		Animal f = new Fish(50);
		Animal d = new Dog(70);
		
		
		// 객체를 배열에 저장
		
		Animal [] ab = new Animal[] {aa,t,e,f,d};
		
		int sum = 0;
	/*	
		if ( t instanceof Animal) {		
			Tiger t1 = (Tiger) t;
		//	System.out.println(t1.count);
			sum += t1.count;
		}
		if ( e instanceof Animal) {		
			Egel e1 = (Egel) e;
		//	System.out.println(e1.count);
			sum += e1.count;
		}
		if ( f instanceof Animal) {		
			Fish f1 = (Fish) f;
		//	System.out.println(f1.count);
			sum += f1.count;
		}
		if ( d instanceof Animal) {		
			Dog d1 = (Dog) d;
		//	System.out.println(d1.count);
			sum += d1.count;
		}
		
	*/
		// For문 사용해서 출력 : eat(), run(), 
		for(int i = 0; i<ab.length; i++) {
			Animal aaa = ab[i];
			aaa.eat();
			aaa.run();
			if ( aaa instanceof Tiger) {		
				Tiger t1 = (Tiger) aaa;
			//	System.out.println(t1.count);
				sum += t1.count;
			}
			if ( aaa instanceof Egel) {		
				Egel t1 = (Egel) aaa;
			//	System.out.println(e1.count);
				sum += t1.count;
			}
			if ( aaa instanceof Fish) {		
				Fish t1 = (Fish) aaa;
			//	System.out.println(e1.count);
				sum += t1.count;
			}
			if ( aaa instanceof Dog) {		
				Dog t1 = (Dog) aaa;
			//	System.out.println(e1.count);
				sum += t1.count;
			}
		
			/*
			ab[i].eat();
			ab[i].run();
			*/
		}
		System.out.println("================================");
		System.out.println("총 마리수 :" + sum);
	}

}
