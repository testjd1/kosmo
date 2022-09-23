package change_teacher_review.poly;

public class MainTest {
	public static void main(String[] args) {
	/*
//		Mom m = new Mom();
//		m.job();
//		m.gene();
		
		Daughter d = new Daughter();
		d.job();
		d.gene();
		d.study();
	*/	
		
		//Daughter d = new Mom();
		// 부모변수에 자식객체 생성 가능
		Mom m = new Daughter();
		m.gene();
		m.job();				
		// -> 부모객체에 없는건 호출 못하지만 있는건 가능
		//m.study();
		
		
		// 형변환 : casting
		// 1. 기본형 끼리만 가능
		// 2. 참조형에서 상속관계 있는 경우만 가능
		
		/*
		 * String s = new String("~~");
		 * StringBuffer sb = (StringBuffers)s;   ==> 불가능
		 */
		System.out.println("====================");
		
		Daughter d= new Daughter();
		m = (Mom) d;				//	업캐스팅 
		
		System.out.println("=======================");
		Daughter d2 = (Daughter)m;	//  다운 캐스팅
	}
}
