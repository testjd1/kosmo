package chapter04.EX07;

public class Using_Break {

	public static void main(String[] args) {
/*
		break; < 해당 구문을 탈출할 때 사용. if 조건과 같이 사용
		For, while, do while과 같은 반복문 탈출시 사용		
*/		
/*
 		// 1. 단일 루프에서 탈출
		for( int i= 0; i<10; i++) {
			System.out.println(i);
			break;						//1단계 탈출
		}
		System.out.println("---------------------------------------------");
		for( int i= 0; i<10; i++) {
			System.out.println(i);
			if(i==5) {break;}			// i가 5일 때 탈출
		}
*/			
		
		// 2. 다중 루프문에서 break 활용
		// 1) case 1. 하나의 루프문만 사용
		for(int i=0; i<5; i++) { 		// 0~4 4번 루프
			for(int j=0; j <5; j++ ) {
				if(j==2) {
					break;				// 하나의 for 문만 나옴
				}
				System.out.println(i + "," + j);
			}
	
		}
		
/*		
		
		// 한꺼번에 탈출  
		for(int i=0; i<5; i++) { 		// 0~4 4번 루프
			for(int j=0; j <5; j++ ) {
				if(j==2) {
					i = 100;
					break;
				}
				System.out.println(i + "," + j);
			}
			
*/			
		
		// 이중 for문 사용 / label
		// label 이용하여 탈출
			jump : for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(j==2) {
						break jump;
					}
					System.out.println(i + "," + j);
				}
			}
			
			
	
	}

}
