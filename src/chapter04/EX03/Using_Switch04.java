package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch04 {

	public static void main(String[] args) {
/*		
		2) 스캐너로 월 인풋받아서
		해당월 날짜 출력 
		<월> 은 <일> 까지 있습니다.
		
		
*/	
		
		Scanner sc = new Scanner (System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		int date = 0;	
		if(month>12 || month<1) {
		
		System.out.println("제대로 된 값을 입력해주세요.\n"); 

		}
		else {
			switch(month) {		
			case 2 : 
				date = 28;
				break;
			case 4: case 6: case 9: case 11: 
				date = 30;
				break;
			default:
				date = 31;
			}
			System.out.printf("<%d>월은 <%d>일 까지 있습니다.",month,date);
		}
		sc.close();
	}

}
