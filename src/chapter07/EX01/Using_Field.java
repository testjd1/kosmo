package chapter07.EX01;

class A{
	int m = 3;
	int n = 4;
	
	// 기본 생성자 생략
	
	//메소드
	void work1() {
		int k = 5;
		System.out.println(k);
		work2(3);
	}
	
	void work2( int i) {
		int j = 4;
		System.out.println(i + j);
	}
	
	
}









public class Using_Field {

	public static void main(String[] args) {
		
		// 객체 생성
		A a = new A(); 		// 기본 생성자 호출, 생략되어있음
		
		// 필드 값 출력
		System.out.println(a.m);		//3
		System.out.println(a.n);		//4
		
		
		// 메소드 호출
		System.out.println("==메소드 호출 ====");
		a.work1();
		
		
	}

}
