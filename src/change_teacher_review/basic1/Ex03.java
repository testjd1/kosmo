package change_teacher_review.basic1;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[]args) {
		// 0123 4 56789
		
		int year2=0;
		String dh2 = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력하세요");
		String  id = sc.nextLine();
		
		char dh = id.charAt(4);
		
		String hg = id.substring(5,7);
		int hg2 = Integer.parseInt(hg);

	
		String hg3 = null;
		String year = id.substring(0,4);
		year2 = Integer.parseInt(year);
		
		if(dh=='1') {
			dh2 = "공대 ";
			if(hg2==11) {
				hg3 = "컴퓨터";			
			}else if(hg2==12) {
				hg3 = "소프트웨어";
			}else if(hg2==13) {
				hg3= "모바일";
			}else if(hg2==22) {
				hg3 = "자바";
			}else if(hg2==33) {
				hg3 = "서버";
			}else {
				System.out.println("없는 정보입니다.");
				return;	
			}
			
		}else if(dh=='2') {
			dh2 = "사회대 ";
			if(hg2==11) {
				hg3="사회";
			}else if(hg2==12) {
				hg3="경영";
			}else if(hg2 ==13) {
				hg3 = "경제";
			}else {
				
			}
			
		}else {
			System.out.println("없는 정보입니다.");
			return;	
		}
		
		System.out.println(id + "는 "+year2+"년도에 입학한 " 
				+dh2 +hg3 + "학과 학생입니다.");
		
				}
}
	
		
		/*
		if(dh=='1') {
			dh2 = "공대 ";
			switch(hg2) {
			case 11:
				hg3="컴퓨터";break;
			case 12:
				hg3="소프트웨어"; break;
			case 13:
				hg3 = "모바일"; break;
			case 22:
				hg3 = "자바"; break;
			case 33:
				hg3 = "서버"; break;
			default :
				System.out.println("없는 정보입니다.");
			}
			
		}else if(dh=='2') {
			dh2 = "사회대 ";
			switch(hg2) {
			case 11:
				hg3="사회";break;
			case 12:
				hg3="경영"; break;
			case 13:
				hg3 = "경제"; break;
			default :
				System.out.println("없는 정보입니다.");
		
		
		
		}
	
	}
		System.out.println(id + "는 "+year2+"년도에 입학한 " 
				+dh2 +hg3 + "학과 학생입니다.");
}
}
		*/