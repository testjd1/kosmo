package change_teacher_review.basic2;

import java.util.Scanner;

public class Ex04_Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor[]  = new int[5];
		int count = 0;
		for(int i=0;i<kor.length;i++) {
			System.out.println((i+1) + "번 학생 국어점수 입력");
			kor[i] = sc.nextInt();
			count++;

		}
		// 출력 
		for(int i=0;i<kor.length;i++) {

			System.out.println((i+1)+"번 학생의 점수 " +kor[i]);
		}
		
		// 위 학생들 점수의 총점과 평균 출력
		int sum = 0;
		for(int i=0;i<kor.length;i++) {
			sum += kor[i];
		}
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " + (double)sum/count);
	}

}
