package a_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmpDept {
	public static void main(String[] args) {
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");

			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.56:1521:xe";
			String user = "scott";
			String pass = "tiger";

			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("디비 연결 성공2");

			// 3. SQL 문장 (*****)
			// -> 20번 부서의 사원들의 정보 - 사번, 사원명, 월급, 부서명, 근무지
			String sql = "SELECT e.empno empno, e.ename ename,e.sal sal,d.dname dname ,d.loc dloc  "
					+ " from emp e left outer join dept d"
					+ " on e.deptno = d.deptno"
					+ " where e.deptno = 20";

			// 4. SQL 전송 객체
			Statement stmt = con.createStatement();

			// 5. SQL 전송
			/*
			 * 	- ResultSet executeQuery() : SELECT
			 *  - int executeUpdate() : INSERT/DELETE/UPDATE
			 * 
			 */
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int empno = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				int sal = rs.getInt("SAL");
				String dname = rs.getString("DNAME");
				String loc = rs.getString("dloc");
				System.out.println(empno + "/" + ename + "/" + sal + "/" + dname + "/" + loc);
			}
			
			
			// 6. 닫기
			rs.close();
			stmt.close();
			con.close();

		}catch(Exception e) {
			System.out.println("실패 : " + e);
		}

	}
}
