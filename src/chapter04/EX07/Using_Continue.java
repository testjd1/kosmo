package chapter04.EX07;

public class Using_Continue {

	public static void main(String[] args) {
/*
		continue : 아래 코드 실행 x
		단독으로 사용x if 문과 함께 사용
		
*/	
/*
		// 1. 단일 루프에서 사용
		
		for(int i = 0; i<10; i++) {
			System.out.println("A");
		
				continue; 
			 
			
			// System.out.println("B");  도달 할 수 없는 코드 		
		}
		for(int i = 0; i<10; i++) {
			System.out.println("A");
			 if(i%2==0) {
				continue; 
			 }
			
			System.out.println("B");
		}
*/		
		for(int i = 0; i<10; i++) {
			
			if(i==5|| i ==7) {
				continue;
			}
			System.out.println( i + " ");
		}
		
		
		
	}

}
