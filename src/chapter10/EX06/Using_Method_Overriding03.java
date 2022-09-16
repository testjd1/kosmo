package chapter10.EX06;

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
	@Override
	void run() {
		System.out.println("호랑이가 달립니다.");
	}
	void eat() {
		System.out.println("호랑이가 고기를 먹습니다.");
	}
}

class Egel extends Animal{
	@Override
	void run() {
		System.out.println("독수리는 날라다닙니다.");
	}
	void eat() {
		System.out.println("독수리가 물고기를 먹습니다.");
	}
	
}

class Fish extends Animal{
	@Override
	void run() {
		System.out.println("물고기는 수영해서 다닙니다.");
	}
	void eat() {
		System.out.println("물고기는 해조류를 먹습니다.");
	}
	
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("강아지는 신나게 뛰어다닙니다.");
	}
	void eat() {
		System.out.println("강아지는 다 먹습니다.");
	}
	
}


public class Using_Method_Overriding03 {

	public static void main(String[] args) {
		// 1. Animal 객체 생성
		
		Animal aa = new Animal();
		Animal t = new Tiger();
		Animal e = new Egel();
		Animal f = new Fish();
		Animal d = new Dog();
		
		Animal [] am = new Animal[] {aa,t,e,f,d};
		System.out.println("===== for ============");
		for ( int i = 0; i< am.length; i++) {
			am[i].eat();
			am[i].run();
		}
		
		System.out.println("====== Enhanced for ==========");
		for(Animal k : am) {
			k.eat();
			k.run();
		}
		
		
		
	}

}
