package taewoo;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {


		this.setBounds(100, 100, 600, 500);
		new orderMenuScreen222(this); 
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	
}
