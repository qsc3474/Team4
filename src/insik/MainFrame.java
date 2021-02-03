package insik;

import javax.swing.JFrame;


public class MainFrame extends JFrame{
	
	public MainFrame() {

		
		this.setTitle("회원 탈퇴");
		this.setBounds(150, 50, 1200, 700);
		
		new WithdrawPanel(this);
				
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}



