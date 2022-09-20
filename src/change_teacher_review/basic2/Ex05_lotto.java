package change_teacher_review.basic2;
/*
 * Math.random() : 0.0~1.0 사이
 * 
 */
public class Ex05_lotto {

	public static void main(String[] args) {
		
		int [] lotto =  new int [6];
		
		for(int i = 0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
		}
		// 정렬 

		for(int i = lotto.length-1; i>0;i--) {
			for(int j =0 ;j<i ;j++ ) {
				if(lotto[j]==lotto[j+1]) {
					lotto[j]=lotto[j]+1;
				}
				else if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1] = temp;
				} 
			}
			
		}
	
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "/");
		}
		
	}

}
