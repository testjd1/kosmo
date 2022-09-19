package change_teacher_review.basic1;

import java.util.Scanner;

/*
	제어문 : 프로그램의 흐름을 변경하기 위함
	
		1 ) if
		2 ) switch
		3 ) for
		4 ) while / do ~ while
		5 ) break / continue
	
*/
public class Ex02_control2 {

	public static void main(String[] args) {
		
		String id = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		id = sc.nextLine();
		char sung = id.charAt(7);
		System.out.println(sung);
		
		// sung 변수에 문자가 1,3,9 -> 남자 출력 
		// sung 변수에 문자가 2,4,0 여자 출력
		
		if(sung=='1'|| sung=='3' || sung=='9') {
			System.out.println("남자");
		}else if(sung=='2'||sung =='4'||sung == '0'){
			System.out.println("여자");
		}
		

	}

}
