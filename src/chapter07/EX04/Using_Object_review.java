package chapter07.EX04;
class Person{
	// class : 객체를 생성하기 위한 템플릿 
	// Object ( 객체 , 인스턴스 ) : 붕어빵, 건축줄 <- 인스턴스화
	
	// 1. 필드 : 클래스 블럭에서 선언. 지역변수 : 메소드 블락에서 선언된 변수.
	
	String name;		// 이름		 : null
	float height;		// 키		 : 0.0
	float weight;		// 몸무게		 : 0.0
	int age;			// 나이		 : 0
	
	// 2. 생성자 ( Constructor ) : 1. 리턴타입x , 2. 클래스 이름과 동일 ( 메소드 )
	// 필드의 기본 값 초기화
	// 생성자 오버로딩 : 생성자 이름은 동일, 식별자 ( 인풋 매개변수 타입, 갯수 )
	
	Person(){			// 기본 생성자 : 비어 있는 생성자. 생략 가능	
	}
	Person(String s){
		name = s;
	}
	Person(String name, float height){		// this : 인풋 매개변수명, 값을 받는 변수, 필드명 동일  
		this.name = name;
		this.height = height;	
	}
	Person(String name, float height, int age,float weight){		  
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
	}
	
	// 3. 메소드 ( 함수 ) : 기능을 실행하는 코드가 저장. 호출시 작동, 메소드명()
	
	void show() {	 //  필드의 내용을 출력
		System.out.println(name + ", " + height + ", " + weight + ", " + age);
	}
	
	
	// 4. Getter, Setter : 필드의 내용 출력 / 입력
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	 
	
	
}




public class Using_Object_review {

	public static void main(String[] args) {
		
		// 객체 생성, main method
		Person person = new Person();
		
		// 필드 내용 출력 ( 1. 객체 명으로 출력 )
		System.out.println(person.name);
		System.out.println(person.height);
		System.out.println(person.weight);
		System.out.println(person.age);
		
		
		// getter 을 사용해서 출력
		System.out.println("=== getter 사용 =============");
		System.out.println(person.getName());
		System.out.println(person.getHeight());
		System.out.println(person.getWeight());
		System.out.println(person.getAge());
		
		// show()
		System.out.println("=== show() 메소드 사용 =============");
		person.show();
		
		// 2. 매개변수가 1개인 생성자 호출
		Person Lee = new Person("이순신");
		System.out.println(Lee.name);			// 이순신
		System.out.println(Lee.height);			// 0.0
		System.out.println(Lee.weight);			// 0.0
		System.out.println(Lee.age);			// 0
		
		Lee.show();
		
		// 3. 매개변수가 4개인 생성자 호출
		System.out.println("=== 매개변수가 4개인 생성자 호출 ==============");
		Person hong = new Person("홍길동",185.5F,35,80.3F);
		System.out.println(hong.name);			
		System.out.println(hong.height);			
		System.out.println(hong.weight);			
		System.out.println(hong.age);			
		hong.show();
		
		// Setter 이용해서 필드 값 할당, Getter 사용해서 필드 값 출력
		System.out.println(" == Setter / Getter 사용 == ");
		Person jung = new Person();
		
		// Setter 사용해서 필드 값 할당.
		jung.setName("정도령");
		jung.setHeight(175.5F);
		jung.setWeight(85.3F);
		jung.setAge(40);
		
		// Getter 이용하여 필드 값 호출
		System.out.print(jung.getName() + " ");
		System.out.print(jung.getAge() + " ");
		System.out.print(jung.getHeight() + " ");
		System.out.print(jung.getWeight());
		
		
		
	}

}
