package chapter04.EX05;

import java.util.Scanner;

public class Using_While02 {

	public static void main(String[] args) {
/*
	"그만" 할때까지 정수 값 넣어서 합계, 평균 구하기
	
*/		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int n=0;
		System.out.println("정수 값을 입력하세요, (그만)입력시 종료");
		String s=sc.next();
	
		while(true) {
			s= sc.next();

			if(s.equals("그만")) {
			break;
			}
			n = Integer.parseInt(s);
			
			sum+=n;
			count++;
		}
		
		if(count==0) {
			System.out.println("입력된 정수가 없습니다.");
		}else {
			System.out.println("입력된 정수는" + count + "개입니다.");
			System.out.println("입력된 정수의 합은"+sum+"입니다.");
			System.out.println("입력된 정수의 평균은"+(double)sum/count + "입니다.");
		}
		
		
	}

}
