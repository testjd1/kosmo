package change_teacher_review.singleton;

public class WorkB {
	DBConnect con;
	public WorkB() {
		con = DBConnect.getInstance();
	}
	public void use() {
		System.out.println("B 작업");
	}
}
