package gui.a_sample;
import java.awt.*;
import javax.swing.*;




public class Infoview {
	// 1. 멤버 변수 선언
	JFrame f;
	JTextField tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JLabel jL;
	
	// 2. 멤버 변수 객체 선언
	Infoview(){
		f = new JFrame("DBTest");
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
		tfName = new JTextField(15); 
		tfId = new JTextField(15); 
		tfTel = new JTextField(15); 
		tfGender = new JTextField(15); 
		tfAge = new JTextField(15); 
		tfHome = new JTextField(15); 
		ta = new JTextArea(40,20);
		jL = new JLabel();
		jL.setHorizontalAlignment(JLabel.CENTER);

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
			
			 f.add(ta, BorderLayout.CENTER);      
			
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

	public static void main(String[] args) {
		Infoview a = new Infoview();
		a.addLayout();
		
	}

}
