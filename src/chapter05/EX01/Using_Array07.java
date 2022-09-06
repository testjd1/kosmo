package chapter05.EX01;

public class Using_Array07 {

	public static void main(String[] args) {
		
		// 배열 변수의 값 대입 방법 1 
		int [] arr1 = new int[3];									// 배열 선언 후, 초기화 후 값 입력
																	// 선언, 초기화 분리 가능
		
		
		int [] arr11;
		arr11 = new int [3];
		System.out.println("========================================");
		
		
		// 대입 방법2
		int [] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};				// 배열 선언과 동시에 값 입력
																	// *주의, 방 지정하면 오류
		for(int i = 0; i< arr2.length; i++) {						// 선언, 초기화 분리 가능
			System.out.print(arr2[i] + " ");
		}
		
		int [] arr22;
		arr22 = new int[] {22,33,44,55};
		
		System.out.println();
		
		System.out.println("========================================");
		
		// 대입 방법3  									 			// ( new int[] ) 생략 후 바로 값 할당
																	// 선언과 초기화 분리x
		int [] arr3 = {11,12,13,14,15};
		for(int i = 0; i< arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		/*오류 
		  	int [] arr33;
			arr33 = {77,88,99};
		 */
		
	}

}
