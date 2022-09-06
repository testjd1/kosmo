package chapter04.EX05;

import java.util.Scanner;

public class Using_While2 {

	public static void main(String[] args) {
		/*
		"그만" 할때까지 정수 값 넣어서 합계, 평균 구하기
		문자열 정수로 변환
		1. String s = sc.nextLine();
		2. s.split(" ");
		3. String 정수형으로 변환 Inter.PerseInt()
		4. 합계 + 평균
	*/		
		Scanner sc= new Scanner(System.in);
		String s;
		String [] in;
		int count = 0;
		int sum = 0;
		int n=0;
		
		do {
			System.out.println("정수를 입력하세요\n");
			s =sc.nextLine();
			in = s.split(" ");
			if(s.equals("그만")) {
				break;
			}
			for(int i =0; i<in.length; i++) {
					n= Integer.parseInt(in[i]);
					sum += n;
					count++; 
				
			}
	
		}while(true);
		System.out.println("프로그램을 종료합니다.");
		if(count==0) {
			System.out.println("입력된 정수가 없습니다.");
		}else {
			System.out.println("입력된 정수는" + count + "개입니다.");
			System.out.println("입력된 정수의 합은"+sum+"입니다.");
			System.out.println("입력된 정수의 평균은"+(double)sum/count + "입니다.");
		}
	}

}
