package change_teacher_review.test;
import java.util.Calendar;
import java.util.Scanner;

public class Test02_1 {

	public static void main(String[] args) {
		int year;		//	 태어난 년도 저장 변수 선언
		//year = 1999;	// 태어난 년도 대입
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력하세요.");
		year = sc.nextInt();
	
		Calendar time = Calendar.getInstance(); // Calendar 클래스 임포트함.
		age = time.get(Calendar.YEAR)-year; // 현재 년도 저장 변수
	
		System.out.println("태어난 년도 : " +year);				// 태어난 년도 출력
		System.out.println("현재 나이 : " +age);				// 현재 나이 출력

	}

}
