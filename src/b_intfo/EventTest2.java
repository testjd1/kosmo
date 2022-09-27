package b_intfo;

import java.awt.*;					// awt 모든것 임포트  -> class 만 임포트라서 세부적으로 들어가야함
import java.awt.event.*;			// event 따로 임포트

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 *  화면에 '확인' 버튼 하나 출력
 */
public class EventTest2 {
	JFrame j;
	JButton bCheck;

	EventTest2(){
		j 	= new JFrame("DBTest");
		bCheck 	 = new JButton("확인");
		// 2. 핸들러 객체 생성
		// 3. 이벤트 발생할 컴포넌트와 연결
		bCheck.addActionListener(new MyHandler());  			// 연결시켜줌
	}
	// 1. 이벤트 핸들러 만들기
	// 핸들러 -> 이벤트 클래스 
	class MyHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"이벤트 발생2");		
			
		}
		
	}
	
	public void addLayout() {
	
		
		
		j.setLayout(new FlowLayout());
		j.add(bCheck);

	
		
		
		j.setBounds(100,100,700,400);
		j.setVisible(true);
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  	
	}

	public static void main(String[] args) {
		EventTest2 event = new EventTest2();
		event.addLayout();
		
	}

}
