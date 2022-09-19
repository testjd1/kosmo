package change_teacher_review.basic1;

public class EX_02_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a = 3;
		if (a>3 & ++a >3) {
			System.out.println("조건 만족");	// false
		}
		System.out.println("a = " + a);			// 4
		
		if(a>1 | ++a > 3) {
			System.out.println("조건 만족2");		//true
		}
		System.out.println("a = " + a);		// 5
	}

}
