package chapter06.EX01;

public class Student {
	
	// 필드 : 클래스 블락에 선언된 변수 : Heap 영역에 저장 됨, 강제 초기화됨

	int kor;			// 국어 점수
	int eng;			// 영어 점수
	int mat;			// 수학 점수 
	String name;		// 학생 이름
	
	Student () {};
	Student (int kor, int eng, int mat, String name){
		// kor , eng, mat, name : 지역변수
		this.kor = kor;		// this 키워드 : 자신의 필드 값 의미
		this.eng = eng;
		this.mat = mat;
		this.name =name;
	}
	
	void call() {
		int sum;
		sum = kor +eng + mat;
		double avg ;
		avg = sum / 3.0;
	//	System.out.println(name + "의 총 점수 : " + sum + " 이고, 평균 :" + avg);
		System.out.printf("%s의 총 점수는 %d 이고, 평균은 %.2f입니다.\n",name,sum,avg);
	}
	

}
