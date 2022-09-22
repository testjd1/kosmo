package change_teacher_review.singleton;

public class WorkA {
	DBConnect con;
	public WorkA() {
		con = DBConnect.getInstance();
	}
	public void use() {
		System.out.println("A 작업");
	}
}
