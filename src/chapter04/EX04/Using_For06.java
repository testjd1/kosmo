package chapter04.EX04;

public class Using_For06 {

	public static void main(String[] args) {
/*
 	for 문에서 무한 루프
 
		for( int i = 0;          ; i++) {
			System.out.println(i);    				// 무한 루프 발생
			
		}
		
		System.out.println("문자열 출력");				// 도달할 수 없는 코드
*/	
/*
 		무한 루프 탈출 방법 : break; 사용
 		if문 내에 break; 넣기
*/	
		for( int i = 0;          ; i++) {
			System.out.println(i);    				// 무한 루프 발생
			if ( i==100) {
				break;
			}
			
		}
		
		System.out.println("문자열 출력");				// 도달할 수 없는 코드
		
		
		
		
		
	
	}

}
