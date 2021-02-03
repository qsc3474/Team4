package newSwing_ys;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class ManagerPanel extends JPanel{
	private MainFrame mf;
	private JPanel ManagerPanel;
	
	public ManagerPanel(MainFrame mf) {
		this.mf = mf;
		this.ManagerPanel = this;
		
		
		
		this.setLayout(null);
		this.setSize(800, 700);
		
		/* 뒤로가기 버튼 */
		JButton backButton = new JButton("뒤로가기");
		backButton.setBounds(702, 23, 86, 34);
		
		/* 회원가입 버튼 */
		JButton registerBtn = new JButton("회원가입");
		registerBtn.setBounds(445, 557, 319, 62);

		JLabel lblNewLabel = new JLabel("매니져페이지");
		lblNewLabel.setBounds(110, 89, 327, 76);
		

		this.add(lblNewLabel);
		this.add(registerBtn);
		this.add(backButton);
		

		}
	}
