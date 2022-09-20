package change_teacher_review.basic2;

public class Ex03_369 {
/*
	1~50 중 3 6 9 해당되면 짝 표현
	그렇지않으면 숫자 표현
	ex ) 26
	6
	2
	
*/	
	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			int su = i;
			boolean su369 = false;
			while(su!=0) {
				int na = su%10;
				
				if(na==3||na==6||na==9) {
					System.out.print("짝");
					su369 = true;
				}
				su = su/10;
	
			}

			if(su369)System.out.println();
			else System.out.println(i);
		}

	}

}
