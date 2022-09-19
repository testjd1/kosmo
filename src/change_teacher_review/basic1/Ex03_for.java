package change_teacher_review.basic1;
/*
	반복문 : for / while / do~while
	
	1) for ( 초기; 조건; 증가){
		반복구문
	}
	
*/
public class Ex03_for {

	public static void main(String[] args) {
		/*
		// 1) 1~5 숫자출력		
		for(int i =0; i<5; i++) {
			System.out.print(i+1 + " ");
		}
		
		*/
		/*
		// 2) 'A'~'Z'출력
		for(char i ='A'; i<='Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(char i ='A'; i<='Z'; i+=2) {
			System.out.print(i + " ");
		}
		*/
		/*
		// 3 ) 'Z'~'A' 출력
		for(char i = 'Z'; i>='A'; i--) {
			System.out.print(i + " ");
		}
		*/// 4) 1~10 합
		int sum = 0;
		for(int i= 0; i<10; i++) {
			sum  += (i+1);		
		}
		System.out.println(sum);
		
		// 5) 1~10 홀수 합
		int sum2 =0;
		for (int i = 0; i<10; i++) {
			if((i+1)%2==1) {
				sum2 += (i+1);
			}
		}
		System.out.println(sum2);
	}

}
