package gui_cal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalTest {
	// 1. 멤버 변수 선언
	JFrame f;								// UI 보여줌
	JTextField tf;							// 결과 값 출력 텍스트 창
	JButton []bNum;		// 0~9 숫자 표현 버튼
	JButton []bOp;			// +,-,*,/ 연산자 표현할 버튼들
	JButton bEqual;							// = 연산자 포현
	
	int first, second;
	String op;
	
	
	// 2. 객체 생성
	CalTest(){
		 f  =new JFrame("초딩 테스트");		//  UI 제목 선언
		 tf=new JTextField(10);			// 결과창 출력하는 텍스트 선언
		 bNum = new JButton[10];
		 bOp = new JButton[4];
		 for(int i = 0; i<=9; i++) {
			 bNum[i] = new JButton(Integer.toString(i));	// 버튼 선언
		 }
		
		 bOp[0] = new JButton("+");
		 bOp[1] = new JButton("-");
		 bOp[2] = new JButton("*");
		 bOp[3] = new JButton("/");
		 bEqual = new JButton("=");
		 
		 
	}// end of CalTest
	
	// 3.  화면 구성 및 화면 출력
	
	void addLayout() {
		// 번호 출력
		JPanel jpb=new JPanel();
		jpb.setLayout(new GridLayout(5,3));
		for(int i = 1; i<=9; i++) {
			jpb.add(bNum[i]);		// 1~9 버튼 추가
		}
	
		jpb.add(bOp[0]);			// + 버튼 추가
		jpb.add(bNum[0]);			// 0 버튼 추가
		jpb.add(bEqual);			// = 버튼 추가
		for(int i=1; i<=3; i++) {
			jpb.add(bOp[i]);		// -,*,/ 버튼 추가
		}
		
		f.add(jpb);
		// 텍스트 창 생성
		JPanel jptxt=new JPanel();
		jptxt.add(tf);
		f.add(jptxt,BorderLayout.NORTH);
	
		tf.setPreferredSize(new Dimension(400, 50));
		
		
		f.setBounds(100,100,500,350);      //사이트의 크기 설정
	    f.setVisible(true);               //true이기 때문에 프로그램이 보이게 작동함
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //x키를 누르면 프로그램 자동 종료
	} // end of addLayout()
	
	// 4. 이벤트 처리
	
	void eventProc() {
	// 숫자 버튼 눌렸을 때
		for(int i =0; i<bNum.length; i++) {
			bNum[i].addActionListener(new ActionListener(){                  //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
		         public void actionPerformed(ActionEvent e) {                 //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
		        	// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
		        	 
		        	 JButton eBtn=(JButton)e.getSource();			
			           String su = tf.getText()+eBtn.getText();
			           tf.setText(su);	    
		        }         
			});  	   
		}
		

		//연산자 버튼 눌렸을 때
				for(int i = 0; i<bOp.length; i++) {
					bOp[i].addActionListener(new ActionListener(){                  //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
				         public void actionPerformed(ActionEvent e) {                 //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				        	// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
				        	 JButton eBtn=(JButton)e.getSource();			
					           op = eBtn.getText();      
					           first = Integer.parseInt(tf.getText());
					           tf.setText(null);
				         }
					});  	   
					
				}
		
	// = 버튼 눌렸을 때
		 bEqual.addActionListener(new ActionListener(){                  //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
	         public void actionPerformed(ActionEvent e) {                 //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
	        	 second = Integer.parseInt(tf.getText());
	        	 int result = 0;
	        	 switch(op) {
	        	 case "+" : result = first + second; break;
	        	 case "-" : result = first - second; break;
	        	 case "/" : result = first / second; break;
	        	 case "*" : result = first * second; break;
	        	 }
	        	 
	        	 tf.setText(String.valueOf(result));
	         }   
	      });  	   
		 
		 
		 
		 
		 
	}
	public static void main(String[] args) {
		CalTest cal = new CalTest();
		cal.addLayout();
		cal.eventProc();
		
	}
}
