package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		/*
		 나이 (age)가 8세 미만이면 : "취학 전 아동입니다."
		 14세 미만 : "초등학생 입니다." / 입장료는 2000원 입니다.
		 20세 미만 : " 중, 고등학생 입니다. " / 입장료 2500
		 20세 이상 : "일반인입니다." / 3000
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		int price = 1000;
		
		
		System.out.printf("%d세는 ",age);
		if(age<8) {
			System.out.println("취학 전 아동입니다.");
		}else if(age<14) {
			price = 2000;
			System.out.println("초등 학생입니다.");
		}else if(age<20) {
			price = 2500;
			System.out.println("중, 고등학생입니다.");
		}else {
			price = 3000;
			System.out.println("성인입니다.");
		}
		System.out.printf("입장료는 %d원 입니다.",price);
		sc.close();
		
		
	}

}
