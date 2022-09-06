package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
/*
		1) Gold : 금메달
		Silver : 은메달
		Bronze : 동메달
		메달이 없습니다.
*/		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("메달을 입력하세요");
		String medal = sc.next();
		
		switch(medal) {
		case "Gold":  case "gold":
			medal = "금메달";
			break;
		case "Silver": case "silver":
			medal = "은메달";
			break;
		case "Bronze": case "bronze":
			medal = "동메달";
			break;
		default :
			System.out.println("메달이 없습니다.");
		}
		System.out.println(medal+"입니다.");
		sc.close();

		
		
		

	//	
	}

}
