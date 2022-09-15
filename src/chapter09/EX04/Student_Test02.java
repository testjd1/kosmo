package chapter09.EX04;

class Student02{
	
	// 필드의 접근 제어자 : default로 구성 -> 외부 클래스에서 객체 생성 후 수정 가능
	
	static int serialNum = 1000;
	int studentID;				// 학생 공유 ID
	String studentName;			// 학생 이름
	int grade;					// 학년 : 기본값 4
	String address;				// 주소 : 기본값 "서울"
	
	
	
}
class Student03{
/*	
	필드의 접근 제어자는 보안을 위해 private으로 선언하는 경우 많음.
	-> 필드의 값 직접 수정 x
*/	
	private static int serialNum = 1000;
	private int studentID;				// 학생 공유 ID
	private String studentName;			// 학생 이름
	int grade;					// 학년 : 기본값 1~4
	private String address;				// 주소 : 기본값 "서울"
	int month;							// 값 : 1 ~ 12
	/*
		필드의 접근제어자를 private로 설정하면 외부에서 접근 불가
		-> 생성자나 메소드 (Setter)를 이용하여 필드 내용 수정
			원하는 값 입력 가능
	*/
	Student03(){
		serialNum ++;
		studentID = serialNum;
		grade = 4;
		address = "서울";		
	}
	
	Student03(String studentName){
		this();
		this.studentName = studentName;		
	}
	
	void print() {
		System.out.println("학생 ID : " + studentID);
		System.out.println("학생 이름 : " + studentName  );
		System.out.println("학년 : " + grade);
		System.out.println("학생 주소 :" + address);
		System.out.println("월 : " + month);
		System.out.println();
	
	}
	void setGrade(int grade) {				// setter : grade 필드의 값을 할당하는 setter
		if(grade >= 1 && grade <=4) {
			this.grade = grade;
		}else {
			System.out.println("잘못된 값을 입력했습니다. (1 ~ 4까지만 입력하세요 )");
			 return;						// 메소드 종료
			 
		}
	}
	void setMonth(int month) {
		if(month>=1&& month<=12) {
			this.month=month;
		}else {
			System.out.println("잘못된 값을 입력했습니다. (1 ~ 12까지만 입력하세요 )");
			 return;						// 메소드 종료

		}
	}

	
}




public class Student_Test02 {

	public static void main(String[] args) {
		// 객체 생성
		Student02 s = new Student02();
		
		// default 접근제어자 -> 동일 패키지에서 존재하는 클래스에서 필드 값 직접 수정
//		s.serialNum = 2000;
//		s.studentID = 100;
//		s.studentName = "홍길동";
		
		Student03 s3 = new Student03("홍길동");
	//	s3.serialNum = 2000;
	//	s3.studentID = 100;
	//	s3.studentName = "홍길동";
		
//		s3.grade = 100;				// 1~4 
//		s3.month = 200;				// 1~12
		
		s3.setGrade(3);
		s3.setMonth(12);
		s3.print();
	}

}
