package chapter04.EX02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		double aa = sc.nextDouble();
		System.out.println("영어 점수를 입력하세요");
		double bb = sc.nextDouble();
		System.out.println("수학 점수를 입력하세요");
		double cc = sc.nextDouble();
		System.out.println("과학 점수를 입력하세요");
		double dd = sc.nextDouble();
		System.out.println("음악 점수를 입력하세요");
		double ee = sc.nextDouble();
		System.out.println("역사 점수를 입력하세요");
		double ff = sc.nextDouble();
		System.out.println("체육 점수를 입력하세요");
		double gg = sc.nextDouble();
		
		double avg = (aa+bb+cc+dd+ee+ff+gg) / 7 ;
		
		System.out.printf("평균 점수는 %.2f이고, ",avg);
		if(avg>=90) {
			System.out.println(" A학점 입니다.");
		}else if(avg>=80) {
			System.out.println(" B학점 입니다.");
		}else if(avg>=80) {
			System.out.println(" C학점 입니다.");
		}else if(avg>=80) {
			System.out.println(" D학점 입니다.");
		}else  {
			System.out.println(" F학점 입니다.");
		}
		
		sc.close();
		
		
	}

}
