package c_info2;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InfoModel {

	void insertInfo(InfoVo vo) throws SQLException; // end of Info	
	/*
	 * 전체 Info_tab의 레코드 검색
	 */

	ArrayList<InfoVo> selectAll() throws SQLException; // end of selectAll() 
	
	/*
	 * 전화번호를 넘겨받아서 해당하는 사람의 정보 검색
	 */
	
	InfoVo selectByTel(String tel) throws SQLException; // end of select
	
	
	void modify(InfoVo vo) throws SQLException; 		// end of modify
	
	/*
	 * 전화번호를 넘겨받아 해당 사람의 정보 삭제 
	 */
	
	int delete(String tel) throws SQLException;		// end of delete 
	
}