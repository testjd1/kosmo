package c_info2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class infoModelImp1 implements InfoModel {

	final static String DRIVER 	= "oracle.jdbc.driver.OracleDriver";			// final static 붙인 경우 잘보이게 대문자로 변수명 선언
	final static String	URL 	= "jdbc:oracle:thin:@192.168.0.56:1521:xe";		// 오라클 링크 연결
	final static String USER 	= "scott";										// db 아이디
	final static String PASS 	= "tiger";										// 비밀번호

	public infoModelImp1() throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName(DRIVER);
		System.out.println("드라이버 로딩 성공");
	}



	/*
	 * 사용자 입력값 받아서  DB에 저장
	 * 
	 */

	@Override
	public void insertInfo(InfoVo vo) throws SQLException{
		// 2. 연결객체 얻어오기
		Connection con = null;								// 전역변수 선언
		PreparedStatement ps = null;						// 전역변수 선언


		try{
			con = DriverManager.getConnection(URL,USER,PASS);		// 드라이브 통해 연결


			// 3. sql 문장 #
			String sql = "INSERT INTO info_tab(name, jumin,tel,gender,age,home) "
					+ " VALUES(?,?,?,?,?,?)";							// 테이블 변수명  값 입력

			//4. 전송 객체
			ps = con.prepareStatement(sql);							// 값 입력
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getTel());
			ps.setString(4, vo.getGender());
			ps.setInt(5, vo.getAge());
			ps.setString(6, vo.getHome());



			// 5. 전송
			ps.executeUpdate();



		}finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
	} // end of Info	
	/*
	 * 전체 Info_tab의 레코드 검색
	 */

	@Override
	public ArrayList<InfoVo> selectAll() throws SQLException { // 전체 검색


		//2.연결객체 얻어오기
		Connection con= null;
		PreparedStatement ps= null; //선언을 바깥에서 해야 다 가져다 쓸 수 있음
		ResultSet rs = null;
		try {
			con= DriverManager.getConnection(URL,USER,PASS);

			//3. SQL 문장
			String sql = "SELECT * FROM info_tab";			// info_tab 테이블이랑 연결

			//4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);

			//5. 전송
			rs = ps.executeQuery();

			ArrayList<InfoVo> list = new ArrayList<InfoVo>();
			while(rs.next()) {
				InfoVo vo = new InfoVo();
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setGender(rs.getString("GENDER"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));

				list.add(vo);
			}
			return list;

		}finally {
			//6. 닫기
			rs.close();
			ps.close();
			con.close();


		} // end of finally
	} // end of selectAll() 



	@Override
	public InfoVo selectByTel(String tel) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;								// 전역변수 선언
		PreparedStatement ps = null;						// 전역변수 선언
		InfoVo vo = new InfoVo();
		try {
			con= DriverManager.getConnection(URL,USER,PASS);
			// 3.SQL 문장
			String sql = " SELECT * FROM info_tab WHERE tel = ?";
			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);  // ? 자리에 해당 값 지정
			// 5. 전송 
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setGender(rs.getString("GENDER"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));
			}
		}finally {
			//6. 닫기
			ps.close();
			con.close();
		} // end of finally
		return vo;
	} // end of selectByTel

	/*
	 * 메소드명 	: delete
	 * 인자 		: 전화번호
	 * 리턴 값 	: 삭제한 행 수
	 * 역할 		: 전화번호를 넘겨받아 해당 전화번호의 레코드를 삭제
	 */

	@Override
	public int delete(String tel) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;								// 전역변수 선언
		PreparedStatement ps = null;						// 전역변수 선언
		
		try {
			con= DriverManager.getConnection(URL,USER,PASS);
			// 3.SQL 문장
			String sql = " DELETE  FROM info_tab WHERE tel = ?";
			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);  // ? 자리에 해당 값 지정
			// 5. 전송 
			ps.executeUpdate();
			System.out.println("지우기 완료");
			
			/*	
					if(rs.next()) {
						vo.setName(rs.getString("NAME"));
						vo.setId(rs.getString("JUMIN"));
						vo.setTel(rs.getString("TEL"));
						vo.setGender(rs.getString("GENDER"));
						vo.setAge(rs.getInt("AGE"));
						vo.setHome(rs.getString("HOME"));
					}
			 */
		}finally {
			//6. 닫기
			ps.close();
			con.close();
		} // end of finally
		return 0;
	}
	
	public void modify(InfoVo vo) throws SQLException{
		// 2. 연결객체 얻어오기
		Connection con = null;								// 전역변수 선언
		PreparedStatement ps = null;						// 전역변수 선언


		try{
			con = DriverManager.getConnection(URL,USER,PASS);		// 드라이브 통해 연결


			// 3. sql 문장 #
			String sql = " UPDATE info_tab SET name = ? , jumin = ?, gender = ?, "
					+ " age = ?, home = ?    "
					+ " where tel = ? ";							// 테이블 변수명  값 입력

			//4. 전송 객체
			ps = con.prepareStatement(sql);							// 값 입력
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getGender());
			ps.setInt(4, vo.getAge());
			ps.setString(5, vo.getHome());
			ps.setString(6, vo.getTel());

			// 5. 전송
			ps.executeUpdate();

		}finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
	} // end of Info



}
