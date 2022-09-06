package chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D_02 {

	public static void main(String[] args) {
		
		String[][] arr1 = new String[][] {{"홍길동","이순신","세종대왕"},
			{"독수리","부엉이","닭"},{"붕어","가물치","잉어"},{"호랑이","사자"}
		};
		
		
		/*출력 : 사람이름 : 홍길동 이순신 세종대왕
		 		새이름 : 독수리 부엉이 닭 오리
		 		물고기 이름 : 붕어 가물치  잉어
		 		포유류 이름: 호랑이 사자
		 */

		String [] s = new String[]{"사람","새","물고기","포유류"};
		
		// 1.  for문으로 출력
		for(int i =0; i<arr1.length; i++) {
			System.out.print(s[i] + "이름 : ");
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=====================================================");
		// 2. Enhanced for 

		int e =0;
		for (String a[]: arr1){
			
			System.out.print(s[e] +"이름 : ");
			for(String k : a) {
				System.out.print(k + " ");
			}
			System.out.println();
			e++;
		}
		
		/*
		for(String a[]:arr1) {
			for(String k : a) {
				if(k.equals("홍길동")) {System.out.print("사람 이름 : ");}
				if(k.equals("독수리")) {System.out.print("새 이름 : ");}
				if(k.equals("붕어")) {System.out.print("물고기 이름 : ");}
				if(k.equals("호랑이")) {System.out.print("포유류 이름 : ");}
				System.out.print(k + " ");
			}
			System.out.println();
		}
		*/
		System.out.println("=====================================================");
		// 3. Arrays.toString()
		for(int i =0; i<arr1.length; i++) {
			System.out.print(s[i] + "이름 : ");
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		
	}

}
