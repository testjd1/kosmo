package c_info2;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class Infoview {
	// 1. 멤버 변수 선언
	JFrame f;
	JTextField tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JLabel jL;
	ImageIcon image;


	// 비지니스 로직 - 모델 단위
	InfoModel model;

	// 2. 멤버 변수 객체 선언
	Infoview(){
		f 		 = new JFrame("DBTest");
		bAdd 	 = new JButton("Add");				// 추가버튼
		bShow 	 = new JButton("Show");				// 전체보기버튼
		bSearch  = new JButton("Search");			// 검색버튼
		bDelete  = new JButton("Delete");			// 삭제버튼
		bCancel  = new JButton("Cancel");			// 취소버튼
		bExit 	 = new JButton("수정하기");
		tfName 	 = new JTextField(15); 
		tfId 	 = new JTextField(15); 
		tfTel 	 = new JTextField(15); 
		tfGender = new JTextField(15); 
		tfAge 	 = new JTextField(15); 
		tfHome 	 = new JTextField(15); 
		ta 		 = new JTextArea(40,20);
		jL 		 = new JLabel();
		jL.setHorizontalAlignment(JLabel.CENTER);

		// bEixt 관련 키워드
		bExit.setHorizontalTextPosition(JButton.CENTER);	// 문자 가운데
		bExit.setVerticalTextPosition(JButton.BOTTOM);		// 문자 바닥
		bExit.setRolloverIcon(new ImageIcon("src\\b_info\\imgs\\eye.png")); //  마우스 올라가면 이미지 바뀜
		bExit.setPressedIcon(new ImageIcon("src\\b_info\\imgs\\present.png")); // 마우스 클릭하면 바뀜
		bExit.setToolTipText("나가기버튼");		// 마우스 올라가면 텍스트박스 뜸
		bExit.setMnemonic('x');


		//
		try {
			model = new infoModelImp1();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}



	}

	// 3. 화면 구성하고 출력
	/*
	 	전체 프레임 : BorderLayout
	 	West, 	 - JPanel 붙이기 ( GridLayout(6,2))
	 	Center	 - TextArea;
	 	South	 - JPanel;( GridLayout(1,6))
	 */
	public void addLayout() {
		// West, 	 -JPanel 붙이기 



		JPanel peast = new JPanel();

		peast.add(new JLabel("Name",JLabel.CENTER));
		peast.add(tfName);
		peast.add(new JLabel("ID",JLabel.CENTER));
		peast.add(tfId);
		peast.add(new JLabel("Tel",JLabel.CENTER));
		peast.add(tfTel);
		peast.add(new JLabel("Sex",JLabel.CENTER));
		peast.add(tfGender);
		peast.add(new JLabel("Age",JLabel.CENTER));
		peast.add(tfAge);
		peast.add(new JLabel("Home",JLabel.CENTER));
		peast.add(tfHome);
		peast.setLayout (new GridLayout(6,2));

		f.add(peast, BorderLayout.WEST);

		f.add(new JScrollPane(ta), BorderLayout.CENTER);      

		// South	 - JPanel;( GridLayout(1,6))
		JPanel group = new JPanel();
		group.add(bAdd);
		group.add(bShow);
		group.add(bSearch);
		group.add(bDelete);
		group.add(bCancel);
		group.add(bExit);
		f.add(group,BorderLayout.SOUTH);
		group.setLayout (new GridLayout(1,6));




		// 화면 출력 작업
		f.setBounds(100,100,700,400);
		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  	

	}

	void eventProc() {
		// Add 버튼이 눌렸을 때
		bAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				insertData();
				selectAll();
			}
		}); 

		// Show 버튼이 눌렸을 때
		bShow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				selectAll();
			}
		}); 
		// Search 버튼이 눌렸을 때
		bSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				selectByTel();
				
			}
		});

		// Delete 버튼이 눌렸을 때,
		bDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				deleteByTel();
				selectAll();
			}
		});
		
		// 수정하기 버튼 눌렀을 때,
		bExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				modify();
				selectAll();
			}
		});
		
		// 엔터 쳤을 때
		tfTel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}
		});

	} //  end of eventProc()
	
	
	void modify() { // 수정하기 관련 메소드
		// (1) 사용자 입력 값 얻어오기
		String name = tfName.getText();
		String id = tfId.getText();
		String tel = tfTel.getText();
		String gender = tfGender.getText();
		int age = Integer.parseInt(tfAge.getText());
		String home = tfHome.getText();

		// (2) 1번의 값들 InfoVo 에 지정 -> 생성자 or setter // 
		InfoVo vo = new InfoVo();
		//InfoVo vo = new InfoVo(name, id, tel, gender, age, home);
		vo.setName(name);
		vo.setId(id);
		vo.setTel(tel);
		vo.setGender(gender);
		vo.setAge(age);
		vo.setHome(home);

		// (3) 모델의 modify() 호출
		try {
			model.modify(vo);
		}catch (SQLException e) {
			e.printStackTrace();
		}

		// (4) 화면의 입력값들 지우기
		clearText();
	}
	void deleteByTel() {
		// (1) 입력한 전화번호 값을 얻어오기
		String tel = tfTel.getText();
		// (2) 모델단에  deleteByTel() 호출
		try {
			model.delete(tel);
			// (3) 화면 지우기
			clearText();
		}catch(SQLException e) {
			ta.setText("삭제 실패 : " + e.getMessage());
		}


	}
	void insertData() {
		// (1) 사용자 입력 값 얻어오기
		String name = tfName.getText();
		String id = tfId.getText();
		String tel = tfTel.getText();
		String gender = tfGender.getText();
		int age = Integer.parseInt(tfAge.getText());
		String home = tfHome.getText();

		// (2) 1번의 값들 InfoVo 에 지정 -> 생성자 or setter // 
		InfoVo vo = new InfoVo();
		//InfoVo vo = new InfoVo(name, id, tel, gender, age, home);
		vo.setName(name);
		vo.setId(id);
		vo.setTel(tel);
		vo.setGender(gender);
		vo.setAge(age);
		vo.setHome(home);

		// (3) 모델의 insertInfo() 호출
		try {
			model.insertInfo(vo);
		}catch (SQLException e) {
			e.printStackTrace();
		}

		// (4) 화면의 입력값들 지우기
		clearText();

	}

	void selectAll() {
		try {
			ArrayList<InfoVo> data = model.selectAll();
			ta.setText("------ 검색 결과 ----------\n");
			for(InfoVo vo : data) {

				ta.append(vo.toString());			//  show 버튼 누르면 값들 출력
			}

		}catch(SQLException e) {
			ta.setText("검색 실패 : " + e.getMessage());
		}
	}

	void clearText() { // 초기화
		tfName.setText(null);
		tfId.setText(null);
		tfTel.setText(null);
		tfGender.setText(null); 
		tfAge.setText(null);
		tfHome.setText(null);
	}

	void selectByTel() {
		try {


			// (1) 입력한 전화번호 값 가져오기
			String tel = tfTel.getText();

			// (2) 모델단에 selectByTel() 호출
			InfoVo vo = model.selectByTel(tel);

			// (3) 받은 결과를 각각의 텍스트 필드에 지정 ( 출력)
			tfName.setText(vo.getName());
			tfId.setText(vo.getId());
			tfTel.setText(vo.getTel());
			tfGender.setText(vo.getGender());
			tfAge.setText(String.valueOf(vo.getAge()));
			tfHome.setText(vo.getHome());

		}catch( Exception ex) {
			ta.setText("전화번호 검색 실패 : " + ex.getMessage());
		}
	} // end of selectByTel()
	public static void main(String[] args) {
		Infoview a = new Infoview();
		a.addLayout();
		a.eventProc();

	}

}
