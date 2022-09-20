package change_teacher_review.basic2;

import java.util.Scanner;

/*
	for			: 반복 횟수 ㅇ ( 정해져 있음 )
	while		: 반복 횟수 x ( 정해져 있지 않음 )
	do~ while	: 
*/
public class While_Ex02 {

	public static void main(String[] args) {
		// 구구단 입력받아서 해당 단의 구구단 출력
		Scanner sc = new Scanner(System.in);
		/*
		for(int i = 1; i<=9; i++) {
			System.out.printf("(%d단)",i);
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d  *  %d = %d ",i,j,i*j);
			}
			System.out.println();
		}
		*/
		/*
		for(int k = 0; k <10000; k++) {		
		
		System.out.println("해당 단을 입력하세요 :  (종료시 0 입력 )");
		int i = sc.nextInt();
	
		if(i == 0) {	
			System.out.println("종료하겠습니다.");
			break;
		}
		for(int j = 1; j<=9; j++) {
			System.out.printf( "%d * %d = %d \n",i,j,i*j);
		}
		System.out.println();
		
		}
		*/
		/*
		int j = 1;
		System.out.println("해당 단을 입력하세요 :  ");
		int i = sc.nextInt();
		while(j<=9) {
			
			System.out.printf( "%d * %d = %d \n",i,j,i*j);
			j++;
		}
	*/
		/*
		System.out.println("몇번 반복을 할까요?");
		int su = sc.nextInt();
		System.out.println("해당 단을 입력하세요 : ");
		int  i = sc.nextInt();
		for(int k = 0; k <su; k++) {	
			System.out.println();
			System.out.println((k+1) + "번반복");	
			for(int j = 1; j<=9; j++) {		
				System.out.printf( "%d * %d = %d \n",i,j,i*j);
			}

		}
		*/
		/*
		// 2. while 
		while(true) {
			System.out.println("구구단을 입력하세요");
			int i = sc.nextInt();
			for ( int j= 1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i , j, i*j);
			}
			
			System.out.println("반복을 종료 (Y)");
			sc.nextLine();
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("Y")) {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		*/
		do {
			System.out.println("구구단을 입력하세요");
			int i = sc.nextInt();
			for ( int j= 1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i , j, i*j);
			}
			
			System.out.println("계속하시겠습니까 (Y)");
			sc.nextLine();
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("Y")) {
				continue;
			}else {
				System.out.println("종료합니다.");
				break;
			}
			
			}while(true);
			
		
		
		
	}

}
