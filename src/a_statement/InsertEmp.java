package a_statement;

import java.sql.*;

public class InsertEmp {

	
	
	public static void main(String[] args) {
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.56:1521:xe";
			String user = "scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("디비 연결 성공");
			
			// 3. SQL 문장
			// 10 번 부서의 사원 월급 10% 인상
			 String sql = "Delete from emp where empno = 1212 ";
			
			// 월급 10000이상 삭제
			//String sql = "Delete from emp where sal>=10000";
			
			
			// 4. SQL 전송 객체
			Statement stmt = con.createStatement();
			
			// 5. SQL 전송
			/*
			 * 	- ResultSet executeQuery() : SELECT
			 *  - int executeUpdate() : INSERT/DELETE/UPDATE
			 * 
			 */
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result + " 행 실행");
			
			// 6. 닫기
			stmt.close();
			con.close();
			
		} catch (Exception e) {
				System.out.println("DB 실패 : " + e);
		}
	}

}
