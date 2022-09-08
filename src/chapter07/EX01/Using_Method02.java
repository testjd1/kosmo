package chapter07.EX01;

class M {
	String name ;
	int w ;
	
	
	
	void print(String name, int w) {
		double nb = w*w*3.14;
		this.name =name;
		System.out.println(name + "의 넓이는 " + nb + "입니다.");
	}

	
}


public class Using_Method02 {	
	
	public static void main(String[] args) {
		// 원의 지름을 넣었을 때, 전체 넓이를 구하는 객체를 생성 후 출력
		// 피자 : 10
		// 도넛 : 5
		M m = new M();
		m.print("피자", 10);
		m.print("도넛",5);
		
		
		
	}

}

/*
class Circle{
	int radius;
	String name;
	
	Circle(int radius, String name){
		this.radius = radius;
		this.name = name;
		
	}
	
	void call() {
		double area = 3.14*radius*radius;
		System.out.println(name + "의 넓이는 " + area + "입니다.");
	}
}
public class Using_Method02 {	
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10,"피자");
		pizza.call();
		
		Circle donut = new Circle(5,"도넛");
		donut.call();
		
	}
}
*/