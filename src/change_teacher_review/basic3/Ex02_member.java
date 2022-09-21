package change_teacher_review.basic3;

public class Ex02_member {
	static int a = 10, b=20;
	static int sum = 0;
	
	public static void main(String[] args) {
		
		add();
		// 두 수 더한결과 출력
		System.out.println("합 : "+sum);
	}
	static void add() {
		// 두 수 더하기
		sum = a + b;
	}

}
