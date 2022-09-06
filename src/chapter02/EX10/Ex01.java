package chapter02.EX10;

public class Ex01 {

	public static void main(String[] args) {
		
		// 각 변수의 평균 값을 구하시오
		
		int aa = 80;
		int bb = 90;
		int cc = 100;
		double dd = 75.5;
		double ee = 60.3;
		
		double ff;
		ff = (aa+bb+cc+dd+ee)/5;
		
		System.out.printf("각 과목의 평균 값은 : %.2f입니다.\n",ff);
		System.out.println("각 과목의 평균 값은 : "+ ff+ "입니다.");
		
	}

}
