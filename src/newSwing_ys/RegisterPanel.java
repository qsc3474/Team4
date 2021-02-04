package newSwing_ys;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class RegisterPanel extends JPanel{
	private JTextField nametextField;
	private MainFrame mf;
	private JPanel registerPanel;
	private JTextField monthtextField;
	private JTextField dayTextField;
	private JTextField EmailTextField;
	private JTextField yearTextField;
	private Image img;
	
	public RegisterPanel(Image img) {
		this.img = img;
		this.setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setLayout(null);
	}


	public void paintComponent(Graphics g) {
		g.drawImage(img, 0 , 0 , null );
	}
	
	public RegisterPanel(MainFrame mf) {
		this.mf = mf;
		this.registerPanel = this;
		RegisterPanel panel = new RegisterPanel(new ImageIcon("src/images/coffee7.jpg").getImage());
		this.setBackground(new Color(255, 215, 0));
		
		MemberCheck memberCheck = new MemberCheck();


		this.setLayout(null);
		this.setSize(1280, 853);

		/* 아이디 입력 및 라벨 */
		JTextField idtextField = new JTextField();
		idtextField.setBounds(320, 230, 230, 30);
		idtextField.setColumns(10);

		JLabel idLabel = new JLabel("아이디");
		idLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(215, 220, 72, 48);

		/* 비밀번호 입력 및 라벨 */
		JPasswordField pwdField = new JPasswordField();
		pwdField.setBounds(320, 340, 230, 30);

		JLabel pwdLabel = new JLabel("비밀번호");
		pwdLabel.setFont(new Font("굴림", Font.BOLD, 16));
		pwdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdLabel.setBounds(210, 340, 92, 34);

		/* 비밀번호 확인 입력 및 라벨 */
		JPasswordField pwdDoubleCheckField = new JPasswordField();
		pwdDoubleCheckField.setBounds(320, 460, 230, 30);

		JLabel pwdDoubleCheckLabel = new JLabel("비밀번호확인");
		pwdDoubleCheckLabel.setFont(new Font("굴림", Font.BOLD, 16));
		pwdDoubleCheckLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdDoubleCheckLabel.setBounds(200, 460, 121, 35);


		/* 아이디 중복확인 버튼 */
		JButton idDoubleCheckbtn = new JButton("중복확인");
		idDoubleCheckbtn.setFont(new Font("휴먼편지체", Font.BOLD, 15));
		idDoubleCheckbtn.setBounds(550, 230, 100, 30);

		/* 이름 입력 및 라벨 */
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setFont(new Font("굴림", Font.BOLD, 16));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(220, 570, 76, 48);

		nametextField = new JTextField();
		nametextField.setColumns(10);
		nametextField.setBounds(320, 580, 230, 30);

		/* 뒤로가기 버튼 */
		JButton backButton = new JButton("");
//		backButton.setForeground(new Color(255, 215, 0));
		backButton.setIcon(new ImageIcon("src/images/2.PNG"));
		backButton.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 12));
//		backButton.setBackground(new Color(255, 215, 0));
	      backButton.setBounds(0, 0, 39, 38);

		/* 회원가입 버튼 */
		JButton registerBtn = new JButton("회원가입");
		
		registerBtn.setFont(new Font("굴림", Font.BOLD, 26));
		registerBtn.setBounds(350, 650, 550, 30);

		/* 태어난 년도 */
		JLabel yearLabel = new JLabel("태어난 년도");
		yearLabel.setFont(new Font("굴림", Font.BOLD, 16));
		yearLabel.setHorizontalAlignment(SwingConstants.CENTER);
		yearLabel.setBounds(683, 220, 90, 48);

		yearTextField = new JTextField();
		yearTextField.setColumns(10);
		yearTextField.setBounds(804, 230, 230, 30);

		/* 태어난 월 */
		JLabel monthLabel = new JLabel("태어난 월");
		monthLabel.setFont(new Font("굴림", Font.BOLD, 16));
		monthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		monthLabel.setBounds(675, 340, 92, 34);


		monthtextField = new JTextField();
		monthtextField.setBounds(804, 340, 230, 30);
		add(monthtextField);

		/* 태어난 일 */
		dayTextField = new JTextField();
		dayTextField.setColumns(10);
		dayTextField.setBounds(804, 460, 230, 30);

		JLabel dayLabel = new JLabel("태어난 일");
		dayLabel.setFont(new Font("굴림", Font.BOLD, 16));
		dayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dayLabel.setBounds(660, 460, 121, 35);

		/* 이메일 주소 */
		EmailTextField = new JTextField();
		EmailTextField.setColumns(10);
		EmailTextField.setBounds(804, 580, 230, 30);

		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setFont(new Font("굴림", Font.BOLD, 16));
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(680, 570, 76, 48);





		/* 뒤로가기 버튼 눌렀을 때 */
		backButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {

				registerPanel.setVisible(false);

				//			 new MainPanel();	
				ChangePanel.registerToMain(mf, registerPanel,new MainPanel(mf));

			}
		});


		/* 회원가입 버튼 눌렀을 때 */
		registerBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {

				/* 비밀번호 일치 및 빈칸이 없을 때 에만 회원 등록 가능 */
				if(memberCheck.pwdCheck(pwdField.getText(), pwdDoubleCheckField.getText()) &&
						memberCheck.blank(idtextField.getText(), pwdField.getText(), pwdDoubleCheckField.getText(), 
								nametextField.getText(), yearTextField.getText(), monthtextField.getText(), dayTextField.getText(),
								EmailTextField.getText())) {

					memberCheck.allCheck(idtextField.getText(), pwdField.getText(), pwdDoubleCheckField.getText(),

							nametextField.getText(), yearTextField.getText(), monthtextField.getText(), dayTextField.getText(), 
							EmailTextField.getText());

					ChangePanel.registerToMain(mf, registerPanel,new MainPanel(mf));

				}
			}
		});


		/* 아이디 중복 체크 */
		idDoubleCheckbtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {

				memberCheck.idCheck(idtextField.getText());


			}
		});

		/* 라벨붙히기 */
		this.add(idLabel);
		this.add(idtextField);
		this.add(pwdLabel);
		this.add(pwdField);
		this.add(pwdDoubleCheckField);
		this.add(pwdDoubleCheckLabel);
		this.add(registerBtn);
		this.add(backButton);
		this.add(nameLabel);
		this.add(nametextField);
		this.add(nametextField);
		this.add(emailLabel);
		this.add(EmailTextField);
		this.add(yearLabel);
		this.add(yearTextField);
		this.add(monthLabel);
		this.add(monthtextField);
		this.add(dayLabel);
		this.add(dayTextField);
		this.add(idDoubleCheckbtn);
		this.add(panel);

	}
}
