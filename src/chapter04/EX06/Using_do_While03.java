package chapter04.EX06;

import java.util.Scanner;

public class Using_do_While03 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int nu = 0;						// 스캐너에서 정수 인풋
		
		do {
			System.out.println("===================================================");
			System.out.println("1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("===================================================");
			System.out.println("원하는 숫자를 선택하세요.");
			
			nu = sc.nextInt();
			if(nu==1) {
				System.out.println("=======1. 19단 출력========");
				for(int i = 1; i<=19; i++) {
					System.out.println();
					System.out.printf("%d단\n",i);
					for(int j = 1; j<=19; j++) {		
						System.out.printf("%d  * %d = %d\t",i,j,i*j);
						
					}System.out.println();
				}
				
			}else if (nu ==2) {
				System.out.println("=======2. 홀수단 출력========");
				for(int i = 1; i<=19; i++) {
					if(i%2==1) {
						System.out.println();
						System.out.printf("%d단\n",i);
						for(int j = 1; j<=19; j++) {		
							System.out.printf("%d  * %d = %d\n",i,j,i*j);
						}
					}
					
				}
				
			}else if (nu ==3) {
				System.out.println("=======3. 3의 배수단 출력========");
				for(int i = 1; i<=19; i++) {
					if(i%3==0) {
						System.out.println();
						System.out.printf("%d단\n",i);
						for(int j = 1; j<=19; j++) {		
							System.out.printf("%d  * %d = %d\n",i,j,i*j);
						}
					}
					
				}
			}else if (nu ==4 ) {
				break;
			}else {
				System.out.println("다시 정수를 입력해주세요.");
				System.out.println();
			}
			
		
			
			
		}while(run);					// 무한 루프
		

/*		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int nu = 0;						// 스캐너에서 정수 인풋
		
		do {
			System.out.println("===================================================");
			System.out.println("1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("===================================================");
			System.out.println("원하는 숫자를 선택하세요.");
			
			nu = sc.nextInt();
			if(nu==1) {
				System.out.println("=======1. 19단 출력========");
				for(int i = 1; i<=19; i++) {
					System.out.println();
					System.out.printf("%d단\n",i);
					for(int j = 1; j<=19; j++) {		
						System.out.printf("%d  * %d = %d\n",i,j,i*j);
					}
				}
				
			}else if (nu ==2) {
				System.out.println("=======2. 홀수단 출력========");
				for(int i = 1; i<=19; i++) {
					if(i%2==1) {
						System.out.println();
						System.out.printf("%d단\n",i);
						for(int j = 1; j<=19; j++) {		
							System.out.printf("%d  * %d = %d\n",i,j,i*j);
						}
					}
					
				}
				
			}else if (nu ==3) {
				System.out.println("=======3. 3의 배수단 출력========");
				for(int i = 1; i<=19; i++) { 			
						System.out.printf("%d  * %d = %d\n",nu,i,nu*i);
						
					
					
				}
			}else if (nu ==4 ) {
				break;
			}else {
				System.out.println("다시 정수를 입력해주세요.");
				System.out.println();
			}
			
		
			
			
		}while(run);					// 무한 루프
		sc.close;
*/
	}

}
