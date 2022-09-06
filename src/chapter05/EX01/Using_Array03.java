package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array03 {

	public static void main(String[] args) {
		//한국을 빛낸 5명의 위인들 s String에 저장 후 4가지로 출력
	
		
		Scanner sc = new Scanner(System.in);
	
		String [] s = new String[5];
		for (int i=0;i<5;i++) {
			System.out.printf("위인을 입력하세요.(%d번째)\n",i);
			s[i] = sc.next();
		}
		
		
		// 1.  직접 출력
		System.out.println("========직접 출력=======");
		System.out.println(s[0]);
		System.out.println(s.length);   			//  배열의 방 개수 출력
		
		// 2.  for 문 사용 : 원하는 방의 값만 출력 가능
		System.out.println("========원하는 방만 출력=======");
		for ( int i = 0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		
		// 3. 향상된 for 사용
		System.out.println("=====향상된 for 이용 출력 ======");
		for(String k : s) {
			System.out.print(k + " ");
		}
		
		// 4 . 배열 변수 이용
		System.out.println("=== Arrays.toString(s)=====");
		System.out.println(Arrays.toString(s));
	}

}
