package newSwing_ys;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {


		this.setBounds(150, 50, 1290, 870);
		this.setTitle("커피한잔의 여유");
		
		new MainPanel(this);
		
		this.setVisible(true);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
