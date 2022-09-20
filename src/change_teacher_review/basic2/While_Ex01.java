package change_teacher_review.basic2;

public class While_Ex01 {

	public static void main(String[] args) {
	/*
		// 0 . for 문 1~10 합
		int sum = 0;
		for ( int i = 0; i<10; i++) {
			sum+=i+1;
			
		}
		System.out.println(sum);
		
		
	*/
	/*	
		// 초기치를 반복블록 위로
		// 증가치를 반복문 끝으로
		int sum=0;
		int i = 1;
		while ( i<=10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	*/
		// do ~ while
		int sum=0;
		int i = 1;
		do {
			
			sum += i;
			i++;
		}while ( i<=10);
		System.out.println(sum);
		
		
		
	}

}
