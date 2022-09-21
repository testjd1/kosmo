package change_teacher_review.basic3;

import java.util.Scanner;


public class Ex04_TodayQ1 {
	
	public static boolean checkLower(char c) { // 문자 정보 확인 함수
		
		char c1 = Character.toLowerCase(c); // 일단 받은 문자 소문자화 하여 저장
		if(c1==c) {			// 만약 소문자화 한 값과 입력 값이 같다면 해당 값 출력
			System.out.println("이 문자는 소문자입니다.");
			return true;	
		}else {				// 만약 소문자화 한 값과 입력 값이 다르다면 해당 값 출력
			System.out.println("이 문자는 대문자입니다.");
			return false;
		}
	}
	
	public static void main(String[] args) {
	
		char c; 				// 입력한 문자를 받을 변수 생성
		boolean check;			// 반환한 문자를 받을 변수 생성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자를 입력하세요 ");	
		c= sc.next().charAt(0);		//  문자 입력
		// 문자열 변환
		
		
		check = checkLower(c);		// 문자의 정보 출력해주는 함수 호출 및 결과 반환받아 저장
		
		System.out.println(check);	// 문자의 정보 출력
		
		
		
	}

}
