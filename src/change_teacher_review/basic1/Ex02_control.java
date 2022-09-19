package change_teacher_review.basic1;

import java.util.Calendar;
import java.util.Scanner;

/*
	제어문 : 프로그램의 흐름을 변경하기 위함
	
		1 ) if
		2 ) switch
		3 ) for
		4 ) while / do ~ while
		5 ) break / continue
	
*/
public class Ex02_control {

	public static void main(String[] args) {
	/*
		String id = "990222-1234567";
		
		char sung = id.charAt(7);
		System.out.println(sung);
		
		// sung 변수에 문자가 1,3,9 -> 남자 출력 
		// sung 변수에 문자가 2,4,0 여자 출력
		
		if(sung=='1'|| sung=='3' || sung=='9') {
			System.out.println("남자");
		}else if(sung=='2'||sung =='4'||sung == '0'){
			System.out.println("여자");
		}
		
		char chul = id.charAt(8);
		System.out.println(chul);

		
		
		// chul 변수가 0 -> '서울' 1 -> '인천/부산'
		String home = null;
		switch(chul) {
		case '0': 
			home = "서울";	
			break;
		case '1':
			home = "인천/부산";
			break;
		case '2' :
			home = "경기";
			break;
		case '3' :
			home = "구미";
			break;
		case '4' : 
			home = "대구";
			break;
		
		case '9' : 
			home = "제주";
			break;
					
		default:
				
		}
		System.out.println(home);
	*/
		
		// String id = "202012-4234567";
		String id = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		id = sc.nextLine();
		char sung = id.charAt(7);
		char q2 = id.charAt(7);
		
		String nai = id.substring(0,2);
		int sunai = Integer.parseInt(nai);
		

		int age = 0;
		
		Calendar c =  Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		if(q2=='3'||q2=='4') {
			System.out.println("20"+sunai+"년생 입니다" );
			age = year - (2000+sunai) + 1;
			System.out.println(age + "살입니다. ");
		}else if(q2=='1'||q2=='2') {
			System.out.println("19"+sunai+"년생 입니다" );
			age = year-(1900 + sunai )+ 1;
			System.out.println(age+ "살입니다. ");
		}else if(q2=='9'||q2=='0'){
			System.out.println("18"+sunai+"년생 입니다" );
			age = year - (1800+sunai) + 1;
			System.out.println(age+ "살입니다. ");
		}else {
			System.out.println("잘못넣었습니다.");
		}
		
		
	}
}