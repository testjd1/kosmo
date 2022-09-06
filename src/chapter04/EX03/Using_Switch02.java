package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {
	public static void main(String[] args) {
		/* 에스프레소, 아메리카노, 카페라떼 주문할 경우 가격이 3,500
		  아메리카노 : 2500
		  그 외의 메뉴 주문 : 우리 매장에 없는 메뉴입니다.
		  
		  
		  출력 : 주문하신 < @ > 는 가격이 <ㅁ > 입니다.
		 */
		Scanner sc = new Scanner (System.in);
		
		System.out.println("주문할 커피 메뉴를 고르세요.");
		System.out.println("====================================");
		System.out.println("||                                ||");
		System.out.println("|| 에스프레소 카페라떼 아보카도 아메리카노 ||" );
		System.out.println("||                                ||");
		System.out.println("====================================");
		String order = sc.next();
		int price = 0;
		
		switch(order) {
		case "아보카도":  case "카페라떼": case "에스프레소":
			price = 3500;
			break;
		case "아메리카노":
			price = 2500;
			break;
		default:
			System.out.println("우리 매장에는 없는 메뉴입니다.");
		}	
		System.out.println("당신이 주문한 커피는 : " + order + " 입니다.");
		System.out.printf("당신이 주문하신 %s는 가격이 %d원 입니다.",order,price);	
		sc.close();
	
		
	}
}
