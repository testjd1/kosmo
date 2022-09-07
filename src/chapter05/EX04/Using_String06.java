package chapter05.EX04;

import java.util.Arrays;

public class Using_String06 {

	public static void main(String[] args) {
	/*
		String의 다양한 메소드
		5. 문자열 수정(toLowerCase() : 소문자로 변환
					toUpperCase() : 대문자로 변환
	 */	
		
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println("================================");
		 
		
		
		// replace(원본,수정) // 원본을 수정으로 변환해라
		String str2 = str1.replace("Study","공부");
		System.out.println(str1.replace("Study","공부"));
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("================================");
		
		// substring() : 글자 잘라서 출력
		System.out.println(str1.substring(0,5));	// Java
		System.out.println(str1.substring(3,8));	// a Stu 3은 포함, 8은 미포함
		System.out.println(str1.substring(5));		// Study 5부터 뒤로 모두 자름
		System.out.println("================================");
		
		
		// split() : 특정 문자 기준으로 잘라서 배열에 저장
		// '/' '-' ' ' 기준으로 잘라서 저장 |  == or
		
		String[] strArr1 = "abc/def-ghi jkl".split("/|-| ");
		
		for (int i=0; i<strArr1.length; i++) {
			System.out.print(strArr1[i] + " ");
			
		}
		System.out.println();
		
		for (String k: strArr1) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(strArr1));
		System.out.println("================================");
		
		//  공백을 기준으로 배열에 저장 후 출력 : for / Enhaced for / Arrays~
		String a = "오늘은 날씨가 매우 맑습니다. 참 화창한 날씨 입니다. ";
		String[] b = a.split(" ");
		for(int i = 0 ; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		for(String k : b) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(b));
		
		// trim() : 좌우 공백 제거
		System.out.println("         avc".trim());
		
		// 6. 문자열 비교 ( == ) : 참조 자료형일때 Stack의 주소 비교
		String str3 = new String("Java");
		String str4 = new String("Java");
		String str5 = new String("java");
		
		System.out.println(str3 == str4); 		// false  <- 주소 비교
		System.out.println(str4 == str5); 		// false
		System.out.println(str5 == str3); 		// false
		System.out.println("================================");
		
		//equals() : Heap값 비교
		System.out.println(str3.equals(str4));	// true
		System.out.println(str4.equals(str5));	// false
		System.out.println(str4.equalsIgnoreCase(str5)); // true = 대소문자 구분x
	}

}
