package swing_ys;

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



//private JTextField idtextField;

//private JPanel RegisterPanel;


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
		
		
		
		
		
//		/* 뒤로가기 버튼 눌렀을 때 */
//		backButton.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			registerPanel.setVisible(false);
//			
//			ChangePanel.registerToMain(mf, registerPanel,new MainPanel(mf));
//			
//			}
//		});
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("매니져페이지");
		lblNewLabel.setBounds(110, 89, 327, 76);
		
		
		
		
		this.add(lblNewLabel);
		this.add(registerBtn);
		this.add(backButton);
		
		
//		this.add(loginButton);
//		this.add(registerButton);
		
		
		/* 프레임에 붙히기 */
//		mf.add(mainPanel);
		
	
		
		
		
		}
	}

//	 JFrame frame;
//	 JTextField id;
//	JPasswordField pwd;
// JPasswordField pwdDoubleCheck;
//	 JTextField name;
//	 JTextField yearText;
//	JTextField Monthtext;
//	 JTextField daytext;
//	 JTextField emailtextField;
//	 JButton idDoubleCheckbtn;
//	 private JTextField idtextField;
//	 private JPasswordField pwdField;
//	 private JPasswordField pwdDoubleCheckField;
//	
//	
//	public void initialize() {
//		
//		JFrame frame = new JFrame();
//		frame.setBounds(100, 100, 916, 608);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		frame.setVisible(true);
//
//		id = new JTextField();
//		id.setBounds(116, 162, 164, 35);
//		frame.getContentPane().add(id);
//		id.setColumns(10);
//		
//		
//		while(true) {
//			
//			
//		pwd = new JPasswordField();
//		pwd.setBounds(116, 229, 164, 35);
//		frame.getContentPane().add(pwd);
//		
//		pwdDoubleCheck = new JPasswordField();
//		pwdDoubleCheck.setBounds(116, 296, 164, 35);
//		frame.getContentPane().add(pwdDoubleCheck);
//		
//		if(!pwd.equals(pwdDoubleCheck)) {
//			
//			JButton button2 = new JButton("비밀번호를 다시 입력하세요");
//			button2.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					dispose();
//				}
//			});
//			
//		}else {
//			
//			break;
//		}
//		
//		
//		}
//		name = new JTextField();
//		name.setColumns(10);
//		name.setBounds(116, 94, 164, 35);
//		frame.getContentPane().add(name);
//		
//		JLabel nameLabel = new JLabel("이름");
//		nameLabel.setBounds(28, 93, 110, 36);
//		frame.getContentPane().add(nameLabel);
//		
//		JLabel idlabel = new JLabel("아이디");
//		idlabel.setBounds(28, 161, 110, 36);
//		frame.getContentPane().add(idlabel);
//		
//		
//		
//		JLabel pwdLabel = new JLabel("비밀번호");
//		pwdLabel.setBounds(28, 228, 110, 36);
//		frame.getContentPane().add(pwdLabel);
//		
//		JLabel pwdDoubleCheckLabel = new JLabel("비밀번호확인");
//		pwdDoubleCheckLabel.setBounds(28, 295, 110, 36);
//		frame.getContentPane().add(pwdDoubleCheckLabel);
//		
//		JLabel yearLabel = new JLabel("태어난년도");
//		yearLabel.setBounds(445, 94, 110, 36);
//		frame.getContentPane().add(yearLabel);
//		
//		JLabel monthLabel = new JLabel("태어난 월");
//		monthLabel.setBounds(445, 162, 110, 36);
//		frame.getContentPane().add(monthLabel);
//		
//		JLabel dayLabel = new JLabel("태어난 일");
//		dayLabel.setBounds(445, 228, 110, 36);
//		frame.getContentPane().add(dayLabel);
//		
//		yearText = new JTextField();
//		yearText.setBounds(583, 94, 192, 35);
//		frame.getContentPane().add(yearText);
//		yearText.setColumns(10);
//		
//		Monthtext = new JTextField();
//		Monthtext.setColumns(10);
//		Monthtext.setBounds(583, 162, 192, 35);
//		frame.getContentPane().add(Monthtext);
//		
//		daytext = new JTextField();
//		daytext.setColumns(10);
//		daytext.setBounds(583, 235, 192, 35);
//		frame.getContentPane().add(daytext);
//		
//		
//		JButton registerBtn = new JButton("회원가입");
//		registerBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				
//			}
//		});
//		
//		
//		
//		
//		registerBtn.setBounds(306, 452, 249, 62);
//		frame.getContentPane().add(registerBtn);
//		
//		JLabel emailLabel = new JLabel("이메일주소");
//		emailLabel.setBounds(445, 294, 110, 36);
//		frame.getContentPane().add(emailLabel);
//		
//		emailtextField = new JTextField();
//		emailtextField.setColumns(10);
//		emailtextField.setBounds(583, 295, 192, 35);
//		frame.getContentPane().add(emailtextField);
//		
//		idDoubleCheckbtn = new JButton("중복확인");
//		idDoubleCheckbtn.setBounds(306, 162, 91, 35);
//		frame.getContentPane().add(idDoubleCheckbtn);
//		
//	}
//}
