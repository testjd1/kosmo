package b_intfo;

import java.awt.*;					// awt 모든것 임포트  -> class 만 임포트라서 세부적으로 들어가야함
import java.awt.event.*;			// event 따로 임포트

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 *  화면에 '확인' 버튼 하나 출력
 */
public class EventTest3 {
	JFrame j;
	JButton bCheck;

	EventTest3(){
		j 	= new JFrame("DBTest");
		bCheck 	 = new JButton("확인");
		// 1. 이벤트 핸들러 만들기
		// 핸들러 -> 이벤트 클래스 
		// 2. 핸들러 객체 생성
		// 3. 이벤트 발생할 컴포넌트와 연결
		bCheck.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"이벤트 발생3");		
			
				}
		
			});  			
		}
	
	
	public void addLayout() {
	
		
		
		j.setLayout(new FlowLayout());
		j.add(bCheck);

	
		
		
		j.setBounds(100,100,700,400);
		j.setVisible(true);
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  	
	}

	public static void main(String[] args) {
		EventTest3 event = new EventTest3();
		event.addLayout();
		
	}

}
