package change_teacher_review.test;

public class Book {					// Book 클래스 생성
	String title;					//  책 제목 값 저장할 변수 선언
	String author;					// 책 저자 값 저장할 변수 선언
	String puble;					// 출판사 값 저장할 변수 선언
	public Book(){		}				// Book 기본 생성자 생성
	
	public void Book(String title, String author, String puble){	// 책 제목, 저자, 출판사 정보 입력시 
																	// 해당 생성자 출력

		this.title = title;
		this.author = author;
		this.puble = puble;
		System.out.println("책 제목 : " +title);		// 책 제목 정보 출력
		System.out.println("책 저자 : " +author);		// 책 저자 정보 출력
		System.out.println("출판사 : " + puble);		// 출판사 정보 출력
	}
	public static void main(String[] args) {
		Book b = new Book();
		b.Book("제목","책 저자", "출판사");
	}

}