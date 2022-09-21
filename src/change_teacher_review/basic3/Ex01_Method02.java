package change_teacher_review.basic3;

public class Ex01_Method02 {

	public static void main(String[] args) {
		int sum=0;
		int [] result = add();
		for(int i = 0; i <result.length; i++) {
			sum += result[i];
		}
		System.out.println("합  : "+ sum);
		
		
	}
	static int [] add() {
		int a = 10, b = 20;
		int [] arr = {a,b};
		return arr;
	}

}
