package MemberInformationModification;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Modifypassword extends JPanel{

	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modifypassword window = new Modifypassword();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Modifypassword() {
	//	finalize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

	
		frame = new JFrame("커피한잔의 여유");
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 434, 562);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 434, 40);
		panel.add(panel1);
		panel1.setBackground(new Color(0, 0, 128));
		panel1.setForeground(new Color(0, 0, 128));
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("pwd 수정");
		lblNewLabel.setBounds(163, 5, 89, 24);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel1.add(lblNewLabel);
		
		JButton goback = new JButton("");
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mypage mypage = new Mypage();
				mypage.setVisible(true);
				mypage.main(null);
				frame.dispose();
				
			}
		});
		goback.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\2.PNG"));
		goback.setBounds(12, 0, 38, 38);
		panel1.add(goback);
		
		JLabel pwd1 = new JLabel("기존비밀번호");
		pwd1.setForeground(new Color(0, 0, 128));
		pwd1.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1.setBounds(45, 141, 127, 25);
		panel.add(pwd1);
		
		JLabel pwd1_1 = new JLabel("새로운비밀번호");
		pwd1_1.setForeground(new Color(0, 0, 128));
		pwd1_1.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1_1.setBounds(45, 224, 127, 25);
		panel.add(pwd1_1);
		
		JLabel pwd1_2 = new JLabel("새로운비밀번호학인");
		pwd1_2.setForeground(new Color(0, 0, 128));
		pwd1_2.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1_2.setBounds(38, 310, 149, 25);
		panel.add(pwd1_2);
		
		JPasswordField pwdfild1 = new JPasswordField();
		pwdfild1.setForeground(new Color(0, 0, 128));
		pwdfild1.setBounds(199, 139, 200, 25);
		panel.add(pwdfild1);
		
		JPasswordField  pwdfild2 = new JPasswordField();
		pwdfild2.setForeground(new Color(0, 0, 128));
		pwdfild2.setBounds(199, 223, 200, 25);
		panel.add(pwdfild2);
		
		JPasswordField pwdfild3 = new JPasswordField();
		pwdfild3.setForeground(new Color(0, 0, 128));
		pwdfild3.setBounds(199, 309, 200, 25);
		panel.add(pwdfild3);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Mypage mypage = new Mypage();
//				mypage.setVisible(true);
//				mypage.main(null);
//				frame.dispose();
				
				String pwd = "1234";
				String pwd2 = "12345";
				String pwd3 = "12345";
				if(pwd.equals(pwdfild1.getText())) {
					
				}else {
					JOptionPane.showMessageDialog(null, "기존비밀번호가 아닙니다. 다시 입력해주세요.");
					return;
				}
					
					if(pwd3.equals(pwdfild3.getText())) {
						JOptionPane.showMessageDialog(null,"비밀번호를 성공적으로 변경되었습니다.");
						JOptionPane.showMessageDialog(null,"회원정보수정으로 돌아갑니다.");
					}
					if(!pwd2.equals(pwdfild3.getText())){
						JOptionPane.showMessageDialog(null,"비밀번호의 값이 다릅니다. 다시 입력해주세요.");
						
					}

			}
		}); 
		
		
		try {
			frame.setIconImage(ImageIO.read(new File("images/cff.PNG")));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(179, 425, 65, 25);
		panel.add(btnNewButton);
		
		
	}
}
