package chapter05.EX01;

public class Using_Array06 {

	public static void main(String[] args) {
	
		
		// 배열 선언 방법 1 ( 자료형 뒤 대괄호 )   <- 권장 사항
		int [] array1 = new int [3];
		
		int [] array2;  // 배열 선언
		
		array2 = new int[3];	// 초기화
		
		
		// 배열 선언 방법 2 ( 변수명 뒤 대괄호)
		int array3[] = new int[3];	//	선언과 동시에 초기화
		
		int array4[]; 			// 배열 선언
		array4 = new int[3];	// 초기화
		
		// 다양한 방법으로 배열 선언
		// 배열 : 참조 자료형 , Stack : 변수명(heap의 주소), heap 값
		// heap영역은 반드시 값 할당 되어 있어야 함, 초기는 JVM이 자동으로 할당.
		
		
		boolean[] array5 = new boolean[3];		//	false 가 기본값
		System.out.println(array5[0]);
		
		int [] array6 = new int[3];				//	 0 이 기본값
		System.out.println(array6[0]);
		
		double [] array7 = new double[3];				//	 0.0 이 기본값
		System.out.println(array7[0]);
		
		String [] array8 = new String[3];				//	 null 이 기본값
		System.out.println(array8[0]);
	}

}
