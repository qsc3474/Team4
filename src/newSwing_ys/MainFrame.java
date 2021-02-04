package newSwing_ys;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {


		this.setBounds(150, 50, 1290, 870);
		
		
		new MainPanel(this);
		
		this.setVisible(true);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
