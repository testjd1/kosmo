package chapter09.EX04;

class Student{
	static int serialNum = 1000;
	int studentID;				// 학생 공유 ID
	String studentName;			// 학생 이름
	int grade;					// 학년 : 기본값 4
	String address;				// 주소 : 기본값 "서울"
	
	Student(){
		grade= 4;
		address = "서울";
	}
	
	Student(String studentName){
		this();
		this.studentName = studentName;
		serialNum++;
		studentID = serialNum;
		
	}
	void print() {
		System.out.println("학생 공유ID : " + studentID );
		System.out.println("학생 이름 : " + studentName  );
		System.out.println("학년 : " + grade);
		System.out.println("학생 주소 :" + address);
		System.out.println();
	}
	
}

public class Student_Test {

	public static void main(String[] args) {
		// 객체 생성시 자동으로 학번 1000부터 1씩 저장
		// studentId : 1000부터 객체 생성시 적용되어있음.
		System.out.println("========= 1번째 객체 ===========");
		Student lee = new Student("이지원");
		lee.print();
		
		System.out.println("========= 2번째 객체 ===========");
		Student hong = new Student("홍지원");
		hong.print();
		
		System.out.println("========= 3번째 객체 ===========");
		Student jung = new Student("정지원");
		jung.print();
		
		System.out.println("========= 4번째 객체 ===========");
		Student park = new Student("박지원");
		park.print();
		
	}

}
