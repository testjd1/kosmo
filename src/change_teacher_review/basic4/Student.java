package change_teacher_review.basic4;

public class Student {
	
	private	String hakbun;
	private	String name;
	private int kor, eng, mth;
	private int total;
	private double avg;
	
	public Student() {// 기본생성자
//		this.name = "이름없음";
//		this.kor = 50;
//		this.eng = 50;
//		this.mth = 50;
		this("이름없음",50,50,50); 				// this -> 무조건 젤 처음라인
		System.out.println("기본생성자");
	}
	
	
	public Student(String name, int kor, int eng, int mth) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mth = mth;
		System.out.println("인자있는 생성자");
		
	}
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMth() {
		return mth;
	}
	public void setMth(int mth) {
		this.mth = mth;
	}
	public void calTotal() {
		total = kor + eng + mth;
	}
	public void calAvg(){
		avg = total /3;
	}
	public void output() {
		System.out.println(name + "님 성적 : " + total + "/" + avg);
	}
}

/*
	캡슐화
	- 멤버번수 ( field ) : private
	- 멤버메소드 : public

*/