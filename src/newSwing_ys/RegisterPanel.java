package newSwing_ys;

import java.awt.Color;
import java.awt.Font;
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
	
	public RegisterPanel(MainFrame mf) {
		this.mf = mf;
		this.registerPanel = this;
		this.setBackground(new Color(255, 215, 0));
		
		MemberCheck memberCheck = new MemberCheck();


		this.setLayout(null);
		this.setSize(1200, 700);

		/* 아이디 입력 및 라벨 */
		JTextField idtextField = new JTextField();
		idtextField.setBounds(145, 119, 311, 34);
		idtextField.setColumns(10);

		JLabel idLabel = new JLabel("아이디");
		idLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(20, 109, 72, 48);

		/* 비밀번호 입력 및 라벨 */
		JPasswordField pwdField = new JPasswordField();
		pwdField.setBounds(145, 212, 311, 34);

		JLabel pwdLabel = new JLabel("비밀번호");
		pwdLabel.setFont(new Font("굴림", Font.BOLD, 16));
		pwdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdLabel.setBounds(12, 210, 92, 34);

		/* 비밀번호 확인 입력 및 라벨 */
		JPasswordField pwdDoubleCheckField = new JPasswordField();
		pwdDoubleCheckField.setBounds(145, 327, 311, 34);

		JLabel pwdDoubleCheckLabel = new JLabel("비밀번호 확인");
		pwdDoubleCheckLabel.setFont(new Font("굴림", Font.BOLD, 16));
		pwdDoubleCheckLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdDoubleCheckLabel.setBounds(12, 325, 121, 35);


		/* 아이디 중복확인 버튼 */
		JButton idDoubleCheckbtn = new JButton("중복확인");
		idDoubleCheckbtn.setFont(new Font("휴먼편지체", Font.BOLD, 17));
		idDoubleCheckbtn.setBounds(469, 116, 103, 35);

		/* 이름 입력 및 라벨 */
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setFont(new Font("굴림", Font.BOLD, 16));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(20, 423, 76, 48);

		nametextField = new JTextField();
		nametextField.setColumns(10);
		nametextField.setBounds(145, 432, 312, 34);

		/* 뒤로가기 버튼 */
		JButton backButton = new JButton("뒤로가기");
		backButton.setForeground(new Color(255, 215, 0));
		backButton.setIcon(new ImageIcon("C:\\Users\\park\\Desktop\\back.PNG"));

		backButton.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 12));
		backButton.setBackground(new Color(255, 215, 0));
		backButton.setBounds(0, 0, 50, 33);

		/* 회원가입 버튼 */
		JButton registerBtn = new JButton("회원가입");
		registerBtn.setBackground(new Color(255, 0, 255));
		registerBtn.setFont(new Font("굴림", Font.BOLD, 26));
		registerBtn.setBounds(145, 533, 970, 34);

		/* 태어난 년도 */
		JLabel yearLabel = new JLabel("태어난 년도");
		yearLabel.setFont(new Font("굴림", Font.BOLD, 16));
		yearLabel.setHorizontalAlignment(SwingConstants.CENTER);
		yearLabel.setBounds(683, 115, 92, 47);

		yearTextField = new JTextField();
		yearTextField.setColumns(10);
		yearTextField.setBounds(804, 123, 311, 34);

		/* 태어난 월 */
		JLabel monthLabel = new JLabel("태어난 월");
		monthLabel.setFont(new Font("굴림", Font.BOLD, 16));
		monthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		monthLabel.setBounds(683, 205, 92, 47);


		monthtextField = new JTextField();
		monthtextField.setBounds(804, 212, 311, 34);
		add(monthtextField);

		/* 태어난 일 */
		dayTextField = new JTextField();
		dayTextField.setColumns(10);
		dayTextField.setBounds(804, 328, 311, 34);

		JLabel dayLabel = new JLabel("태어난 일");
		dayLabel.setFont(new Font("굴림", Font.BOLD, 16));
		dayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dayLabel.setBounds(683, 320, 92, 47);

		/* 이메일 주소 */
		EmailTextField = new JTextField();
		EmailTextField.setColumns(10);
		EmailTextField.setBounds(804, 430, 311, 34);

		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setFont(new Font("굴림", Font.BOLD, 16));
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(683, 432, 92, 47);





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

	}
}
