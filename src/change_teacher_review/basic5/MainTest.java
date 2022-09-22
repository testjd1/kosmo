package change_teacher_review.basic5;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		
		// 값 지정 1 - setter
		Student s = new Student();
		
		Scanner sc = new Scanner(System.in);
		String name; 
		System.out.println("이름 입력");
		name = sc.next();
		
		
		
		s.setName(name);
		s.setKor(100);
		s.setEng(30);
		s.setMth(55);
		
		// 값지정 2 - 생성자
//		Student s = new Student("A",99,88,77);
		
		s.calTotal();
		s.calAvg();
		s.output();
		
		
		
	}

}
