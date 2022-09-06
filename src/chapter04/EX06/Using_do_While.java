package chapter04.EX06;

public class Using_do_While {

	public static void main(String[] args) {
/*
	while : 조건 비교후 실행문 실행
	
	do while : 1번 실행 후 조건 비교후 실행
	
	do {
		실행문
	}while (조건);
	
	
*/	
/*		
	// 1) while	vs do while 비교
		int a; 
		a= 11;
		System.out.println("=====while 문 ( 조건 참일때만 실행 )");
		while(a<10) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		
		a = 11;
		
		System.out.println("=====do while 문 (조건과 상관없이 1번 실행 후 조건 비교 )");
		
		do {
			System.out.println(a + " ");
			a++;
		}while(a<10);
		
*/		
		
		// while 문과 do while 문 10번 실행.
		System.out.println("while");
		int a=0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		a=0;
		System.out.println("do while ");
		do {
			System.out.print(a + " ");  	// 조건과 상관없이 1번은 실행.
			a++;
		}while(a<10);	
		
	}

}
