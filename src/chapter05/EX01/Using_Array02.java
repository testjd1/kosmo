package chapter05.EX01;

import java.util.Arrays;

public class Using_Array02 {

	public static void main(String[] args) {
/*
		Array (배열)
		참조변수를 선언 후 초기화하면 값 자동으로 등록.
		정수 : 기본값 0 / 실수 : 0.0 /  String : null
		Heap 영역에는 값이 반드시 할당되어 있어야 함.
		
		
*/	
		// 1. 배열 선언 및 초기화
		double []  d = new double[6];		// heap 영역의 double 방 6개 생성 후 주소값을 d 변수에 할당.
		System.out.println(d[0]);			// 각 방의 기본값으로 0.0 할당
		
		// 2. 배열의 값 할당
		d[0] = 10.5;
		d[1] = 20.5;
		d[2] = 30.5;
		d[3] = 40.5;
		d[4] = 50.5;
		d[5] = 60.5;
		
		// 3. 배열 방의 값 출력
		
		// 3-1 ) 직접 출력
		System.out.println(d[3]);
		System.out.println(d.length);  		// 배열 방의 개수 출력
		
		System.out.println("====for 사용하여 출력========");
		
		for(int i = 0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		
		
		// 3-2) for 문 사용 : 원하는 방의 값만 출력 가능
		System.out.println("========원하는 방만 출력=======");
		for ( int i = 3; i<6; i++) {
			System.out.println(d[i]);
		}
		
		// 3-3 ) 향상된 for 사용
		
		System.out.println("=====향상된 for 이용 출력 ======");
		for ( double k : d) {
			System.out.println(k);
		}
		
		// 3-4) 배열 변수 이용
		System.out.println("=== Arrays.toString(d)=====");
		System.out.println(Arrays.toString(d));
	
	}

}
