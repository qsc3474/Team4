package newSwing_ys;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



import javax.swing.JPasswordField;

public class MainPanel extends JPanel{


	
	private MainFrame mf;
	private JPanel mainPanel;
	private JPasswordField pwdField;
	private Image img;
	public MainPanel(Image img) {
		this.img = img;
		this.setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0 , 0 , null );
	}


	public MainPanel (MainFrame mf) {
		this.mf = mf;
		this.mainPanel = this;
		this.setSize(1280, 853);
		MainPanel panel = new MainPanel(new ImageIcon("src/images/coffee6.jpg").getImage());

		this.setLayout(null);

		// 기본 화면
		JLabel logolabel = new JLabel("커피한잔의 여유");
		logolabel.setHorizontalAlignment(SwingConstants.CENTER);
		logolabel.setFont(new Font("굴림", Font.BOLD, 60));
		logolabel.setBounds(220, 100, 600, 100);
		this.add(logolabel);

		/* 아이디 text */
		JTextField idtextField = new JTextField();
		idtextField.setBounds(463, 300, 237, 33);
		idtextField.setColumns(10);

		/* 아이디 라벨 */
		JLabel idlLabel = new JLabel("아이디");
		idlLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idlLabel.setFont(new Font("굴림", Font.BOLD, 19));
		idlLabel.setBounds(334, 300, 98, 45);

		/* 비번 라벨 */
		JLabel pwdLabel = new JLabel("비밀번호");
		pwdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdLabel.setFont(new Font("굴림체", Font.BOLD, 19));
		pwdLabel.setBounds(334, 380, 98, 39);

		/* 로그인 버튼 */
		JButton loginButton = new JButton("로그인");		
		loginButton.setHorizontalAlignment(SwingConstants.CENTER);
		loginButton.setBounds(330, 450, 370, 45);
		loginButton.setFont(new Font("굴림", Font.BOLD, 20));

		/* 회원가입 버튼 */
		JButton registerButton = new JButton("회원가입");		
		registerButton.setHorizontalAlignment(SwingConstants.CENTER);
		registerButton.setBounds(330, 520, 370, 45);
		registerButton.setFont(new Font("굴림", Font.BOLD, 20));

		pwdField = new JPasswordField();
		pwdField.setBounds(463, 380, 237, 33);

		// 패널에 컴포넌트 옮기기
		this.add(idlLabel);
		this.add(idtextField);
		this.add(pwdLabel);
		this.add(loginButton);
		this.add(registerButton);
		this.add(pwdField);
		
//		JPanel panel = new JPanel();
//		panel.setBounds(269, 181, 481, 404);
		add(panel);

		/* 로그인 버튼 */
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/* 매니져 로그인 시 */
				if(MemberCheck.Manager(idtextField.getText(), pwdField.getText())) {

					ChangePanel.mainToManagerPanel(mf, mainPanel, new ManagerPanel(mf));
				
					/* 멤버 로그인 시 */
				}else if(MemberCheck.loginCheck(idtextField.getText(), pwdField.getText())) {
					ChangePanel.mainToRegisterPanel(mf, mainPanel, new willChange(mf));

				}else {
					/* 회원가입이 안되어 있는 경우 */
					JOptionPane.showMessageDialog(null, "회원가입을 해주세요");
					
				}

			}
			
		});


		/* 회원가입 버튼 */
		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePanel.mainToRegisterPanel(mf, mainPanel, new RegisterPanel(mf));
			}

		});

		/* 프레임에 붙히기 */
		mf.getContentPane().add(mainPanel);

	}
}