package chapter10.EX03;

class Animal{		// 최상위 부모 클래스
	String name;
	int age;
	String color;

	void eat() {
		System.out.println("모든 동물은 음식을 먹는다.");
	}
	
	void sleep() {
		System.out.println("모든 동물은 잠을 잔다.");
	}
}

class Tiger extends Animal{
	// Animal 클래스의 모든 필드와 메소드 상속받음.
	int tiger;
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아먹습니다.");
	}
	
	
}

class egle extends Animal{
	// Animal 클래스의 모든 필드와 메소드 상속받음.
	int egle;
	void eglefly(){
		System.out.println("독수리는 하늘을 날라다닙니다.");
	}
	
}

class Dog extends Animal{
	// Animal 클래스의 모든 필드와 메소드 상속받음.
	int dog;
	void dogcry() {
		System.out.println("개는 멍멍멍 짖습니다.");
	}
	
	
}

class Dog_sub extends Dog{
	// Animal 클래스의 모든 필드와 메소드 상속받음.
	// Dog 클래스의 모든 필드와 메소드 상속받음.
	int dog_sub;
	void dogSubcry() {
		System.out.println("새끼강아지는 낑낑거립니다.");
	}
	
	
}
public class Using_Polymorphism02 {

	public static void main(String[] args) {
		
		// 1. Animal 객체를  Animal 타입으로 생성
			// a1 = Animal 타입만 가지고 있음.
				// Animal 클래스의 필드와 메소드만 접근 가능
		Animal a1 = new Animal();
		
		// 2. Tiger 객체를 Tiger 타입으로 생성
			// t1 = Animal, Tiger 내포하고 있고, Tiger 타입으로 지정
			// t1 = Animal
		Tiger t1 = new Tiger();
		
		// 3. Tiger 객체를 Animal 타입으로 생성 // 업 캐스팅
			// a2 = Animal, Tiger을 내포하고 있고, Animal 타입으로 지정 
			// a2 = Animal의 필드와 메소드만 접근
		Animal a2 = new Tiger();
		
		
		// 4. Dog 객체를 Dog 타입으로 생성
			// d1 = Animal, Dog 내포 , Dog 타입으로 지정
			// d1 = Animal, Dog 필드 메소드 모두 가능
		
		Dog d1 = new Dog();
		
		
		// 5. Dog 객체를 Animal 타입으로 생성
			// a3 = Animal, Dog 내포 , Animal 타입으로 지정
			// a3 = Animal의  필드 메소드 가능
		Animal a3 = new Dog();
		
		// 6. Dog_sub 객체를 Dog_sub 타입으로 생성
			// ds1 = Animal, Dog, Dog_sub 타입 내포, Dog_sub 타입으로 지정
			// ds1 = Animal, Dog, Dog_sub 필드 메소드 모두 가능
		Dog_sub ds1 = new Dog_sub();
		
		
		// 7. Dog_sub 객체를 Dog 타입으로 생성
			// ds2 = Animal, Dog, Dog_sub 타입 내포, Dog 타입으로 지정
			// ds2 = Animal, Dog 필드 메소드 모두 가능
		
		Dog ds2 = new Dog_sub();
		
		
		// 7. Dog_sub 객체를 Animal 타입으로 생성
			// a4 = Animal, Dog, Dog_sub 타입 내포, Animal 타입으로 지정
			// a4 = Animal 필드 메소드 모두 가능
		
		Animal a4 = new Dog_sub();
		
		
	
	}

}
