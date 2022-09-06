package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
	//  점수, 학년 받기 / 60이상 합격 미만 불합격	
	// 4학년 => 70이상 합격	
	// 점수 : score , 학년 year	
		Scanner sc = new Scanner (System.in);	
		
		System.out.println("점수를 입력하세요");
		double score = sc.nextDouble();
		System.out.println("학년을 입력하세요");
		int year = sc.nextInt();
		System.out.printf("학년 : %d, 점수 : %.2f\n",year,score);
/*		
		if(year==4) {
			if(score>=70) {
				System.out.println("축하합니다. 합격 입니다.");
			}else {
				System.out.println("죄송합니다. 불합격 입니다.");
			}
		}else {
			if(score>=60) {
				System.out.println("축하합니다. 합격 입니다.");
			}else {
				System.out.println("죄송합니다. 불합격 입니다.");
			}
*/
		if(score>=60) {
			if(year!= 4) {
				System.out.println("축하합니다. 합격 입니다.");				// 4학년 아니면 60 이상 합격
			} else if(score>=70) {
				System.out.println("축하합니다. 합격 입니다.");				// 4학년 + 70이상 합격
			}else {
				System.out.println("죄송합니다. 불합격 입니다.");				// 4학년 + 70이하 불합격
			}
		}
			else {
				System.out.println("죄송합니다. 불합격 입니다.");				// 60점 미만 불합격
			}
		
			sc.close();
		}
		
		
		
		
		
		
		
	

}
