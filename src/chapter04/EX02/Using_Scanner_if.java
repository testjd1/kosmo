package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
		/* Q : scanner을 이용하여 국어, 영어, 수학, 과학, 음악 점수 인풋 받기
			if문을 이용하여 평균이 90점 넘으면 A , 80:B , 70:C , 60:D , 나머지:F
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int aa = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int bb = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int cc = sc.nextInt();
		System.out.println("과학 점수를 입력하세요");
		int dd = sc.nextInt();
		System.out.println("음악 점수를 입력하세요");
		int ee = sc.nextInt();
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		double kor = sc.nextDouble();
		System.out.println("영어 점수를 입력하세요");
		double eng = sc.nextDouble();
		System.out.println("수학 점수를 입력하세요");
		double mth = sc.nextDouble();
		System.out.println("과학 점수를 입력하세요");
		double sct = sc.nextDouble();
		System.out.println("음악 점수를 입력하세요");
		double msc = sc.nextDouble();
		
		double avg = (kor+eng+mth+sct+msc)/5 ;
		
		if (avg >=90) {
			System.out.printf("평균 점수는 %.2f이고, A학점 입니다.",avg);
		}else if(avg>=80) {
			System.out.printf("평균 점수는 %.2f이고, B학점 입니다.",avg);
		}else if(avg>=70) {
			System.out.printf("평균 점수는 %.2f이고, C학점 입니다.",avg);
		}else if(avg>=60) {
			System.out.printf("평균 점수는 %.2f이고, D학점 입니다.",avg);
		}else {
			System.out.printf("평균 점수는 %.2f이고, F학점 입니다.",avg);
		}
		
		
		sc.close();
	}

}
