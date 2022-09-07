package chapter07.EX01;

class B{
	// 1. 리턴 타입이 없고, 입력 매개변수가 없는 메소드
	 void print() {
		 System.out.println("안녕");
	 }
	 
	 // 2. 리턴 타입이 int, 입력 매개변수 
	 int data() {		// 호출 하는 곳에 정수 3 돌려줌.
		 
		 return 3;
	 }
	 
	 // 3. 리턴 타입 double, 입력 매개변수 2개인 메서드
	 double sum ( int a, double b) {
		 return a+b;
	 }
	 
	 
	 // 4. 리턴 타입 없음(void),  내부 함수 종료함 (return ;)
	 		// return; 만나면 메소드 종료
	 void printMethod(int m) {
		 if(m <= 0 || m >12) {
			 System.out.println("잘못된 입력이 되어 메소드 종료");
			 return ;
			//	System.out.println("출력되지 않는 부분"); 
			
		 }else {
			 System.out.println("입력한 달은 : " + m + "달입니다.");
		 }
	 }
	 
	 boolean call() {		// call() 호출시 true 돌려줌
		 return true;
	 }
	 
}



public class Using_Method01 {

	public static void main(String[] args) {
		//메소드 사용
		B b = new B();
		b.print();
		System.out.println(b.data());
		System.out.println("===== 리턴 double, 입력매개변수 2개 ===");
		System.out.println(b.sum(3,5.5));
		System.out.println("==== 리턴이 없고 잘못된 입력이 되면 메소드 종료 ===");
		b.printMethod(0);
		
		System.out.println(b.call());
	
	}

}
