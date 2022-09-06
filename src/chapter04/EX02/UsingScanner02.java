package chapter04.EX02;

import java.util.Scanner;

public class UsingScanner02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 콘솔에서 인풋 : 공백으로 한꺼번에 변수 값 할당
		//				엔터를 이용하여 하나씩 값 할당
		// 주의 : 자료형과 변수의 갯수에 잘 맞추어서 인픗 
	/*	System.out.println("이름 입력"); // 콘솔에서 인풋값 받음. 문자열
		String aa = sc.next();
		
		System.out.println("나이 입력"); // 콘솔에서 인풋값 받음. 정수
		int bb = sc.nextInt();
		
		System.out.println("몸무게 입력"); // 콘솔에서 인풋값 받음. 실수
		double cc = sc.nextDouble();
	*/	
		System.out.println("이름, 나이, 몸무게"
				+ "공백으로 구분해서 입력하세요");
		String aa = sc.next();
		int bb = sc.nextInt();
		double cc = sc.nextDouble();
		
		System.out.printf("당신의 이름은 %s이고, 나이는 %d이며,"
				+ "당신의 몸무게는 %.2f 입니다.\n ",aa,bb,cc);
		
		System.out.println("당신의 이름은 " + aa + "이고, 나이는 " +
		bb + "살 이며, 몸무게는 "+cc + "kg 입니다.");
		
		
		
	}
}
