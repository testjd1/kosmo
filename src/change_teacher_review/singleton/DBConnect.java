package change_teacher_review.singleton;
// ******** Singleton pattern 
public class DBConnect {
	private DBConnect() {
		System.out.println("실제 디비 연결");
	}
	
	private static DBConnect con = null;	// 스태틱메소드에 접근하기위함
	
	public static DBConnect getInstance() { // 객체생성 없이 접근
		if(con == null) {
			con = new DBConnect();
		}
		return con;
		
	}
}
