package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		/*
		 * 이중 for 문 이용하여 1~9단 출력
		 * 
		 */

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("단을 입력하세요"); int a =
		 * sc.nextInt();
		 * 
		 * for(int i=1;i<=a; i++) { System.out.printf("%d단\n",i); for (int j=1;j<=9;
		 * j++) { System.out.printf(" %d * %d = %d \t",i,j,i*j); }
		 * System.out.println(" "); }
		 */
		/*
		 * // 1~ 19단 3의 배수 단만 출력 for(int i=1;i<=19;i++) {
		 * 
		 * if(i%3==0) { System.out.printf("%d단\n",i); for(int j=1; j<=19;j++) {
		 * System.out.printf(" %d * %d = %d \t",i,j,i*j); } System.out.println(" ");
		 * System.out.println(" "); }
		 * 
		 * }
		 */
		/*
		 * scanner 입력받은 단만 출력 해당 단만 아래로 출력
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10000; i++) {

			System.out.println("단을 입력하세요, 종료시 0 입력");
			int a = sc.nextInt();
			if (a == 0) {
				System.out.println("종료 하겠습니다.");
				break;
			}

			System.out.printf("%d단\n", a);
			for (int j = 1; j <= 9; j++) {
				System.out.printf(" %d * %d = %d \n", a, j, a * j);
			}

		}

	}

}
