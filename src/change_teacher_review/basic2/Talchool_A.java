package change_teacher_review.basic2;

public class Talchool_A {
/*
	8 숫자 세기
	1~ 10000
	8 숫자 카운팅
	
*/
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i<=10000; i++) {
			int su = i;
			while(su!=0) {
				int na = su%10;
				
				if(na==8) {
					count++;
				}
				su = su/10;
	
			}
		}
		System.out.println(count);
	
	
	}

}
