package chapter04.EX04;

import java.util.Scanner;

public class Using_For01 {
	public static void main(String[] args) {
		/*
		 * for( 초기값; 조건; 증감값 ){ 실행문1; <- 조건이 참일동안 계속 반복. 거짓이면 빠져나옴
		 * 
		 * }
		 * 
		 */
		/*
		 * int a; for(a = 0; a < 100; a++) { System.out.println(a); }
		 */
		// 초기 값과 증가값은 ,로 구분해서 여러개의 변수 가능
		/*
		 * int b,c,d; for(b=0,c=10,d=20; b<5; b++,c+=2,d+=5) { // b: +1, c : +2, d : +5씩
		 * System.out.println("b : "+ b + " c :" +c +" d: "+d);
		 * 
		 * }
		 */
		/*
		 * // for 문에서 무한루프( 조건이나 증가값 잘못 처리 -> 무한루프 발생) int e; for(e=0; e < 10; e+=3) {
		 * System.out.println(e); // 조건 true 일 동안 반복 }
		 */
		/*
		 * // 1부터 10까지 for없이 덧셈 int sum1 = 0; sum1 += 1; sum1 += 2; sum1 += 3; sum1 +=
		 * 4; sum1 += 5; sum1 += 6; sum1 += 7; sum1 += 8; sum1 += 9; sum1 += 10;
		 * System.out.println("1~10의 합 : " + sum1);
		 * 
		 * 
		 * 
		 * int i; int sum = 0;
		 * 
		 * for(i = 0; i <= 10; i++) { sum += i;
		 * System.out.printf("sum : %d, i : %d\n",sum,i); }
		 * System.out.println("1~10의 합 : "+sum);
		 */
		/*
		 * for 사용하여 0~1000 7의배수 합계
		 * 
		 */
		/*
		 * Scanner sc = new Scanner (System.in); System.out.println("n을 입력하세요\n"); int
		 * n= sc.nextInt();
		 * 
		 * int i; int sum=0;
		 * 
		 * for(i=0; i<=1000; i++) { if(i%n==0) { sum+=i; } }
		 * System.out.printf("%d의 배수의 합계는 %d입니다.\n",n,sum);
		 */
		/*
		 * for과 if문을 사용해서 1~10까지 더한 값을 출력하되 아래와 같이 출력해라.
		 * 
		 */
		/*
		 * int i; int sum=0;
		 * 
		 * for(i=1;i<=10;i++) { System.out.printf("%d",i); if(i<10) {
		 * System.out.print("+"); } sum+=i;
		 * 
		 * } System.out.println("=" + sum);
		 */
		int i;
		int sum = 0;

		for (i = 1; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.printf("%d", i);
				if (i < 19) {
					System.out.print("+");
				}
				sum += i;
			}

		}
		System.out.println("=" + sum);

	}

}
