package newSwing_ys;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


public class WithdrawPanel extends JPanel {

	private MainFrame mf;
	private JPanel withdrawPanel;
	private JTextField idTextField;
	private JLabel idLabel;	

	public WithdrawPanel(MainFrame mf) {
		setForeground(Color.BLACK);

		this.mf = mf;
		this.withdrawPanel = this;
		this.setSize(1179, 782);
		this.setLayout(null);
		this.setBackground(Color.WHITE);

		MemberCheck memberCheck = new MemberCheck();		
		MemberDB memberdb = new MemberDB();

		//		ArrayList<MemberDTO> str = new ArrayList<>();

		//		str.add(new MemberDTO("1", "1", "1", null, null, null, null, null));
		//		str.add(new MemberDTO("2", "2", "2", null, null, null, null, null));
		//		str.add(new MemberDTO("3", "3", "3", null, null, null, null, null));		

		// id 입력 라벨
		idLabel = new JLabel("탈퇴하실 회원님의 ID를 입력해주세요. ");
		idLabel.setFont(new Font("굴림", Font.BOLD, 16));
		idLabel.setBounds(349, 154, 335, 38);
		this.add(idLabel);

		// id 입력 필드
		idTextField = new JTextField();
		idTextField.setBounds(349, 211, 376, 29);
//		withdrawPanel.add(idTextField);
		idTextField.setColumns(10);
		this.add(idTextField);

		// 탈퇴 입력 라벨
		JLabel withdrawLabel = new JLabel("탈퇴를 원하시면 아래에 '탈퇴'라고 입력해주세요. ");
		withdrawLabel.setFont(new Font("굴림", Font.BOLD, 16));
		withdrawLabel.setBounds(349, 262, 376, 38);
		this.add(withdrawLabel);

		// 탈퇴 입력 필드
		JTextField withdrawtext = new JTextField();
		withdrawtext.setBounds(349, 310, 376, 29);
//		withdrawPanel.add(withdrawtext);
		withdrawtext.setColumns(10);
		this.add(withdrawtext);



		// 뒤로가기 버튼
		JButton backButton = new JButton("뒤로");
		backButton.setBounds(0, 0, 91, 23);
		this.add(backButton);

		// 탈퇴 버튼
		JButton withdrawButton = new JButton("탈퇴");
		withdrawButton.setFont(new Font("굴림", Font.BOLD, 16));
		withdrawButton.setForeground(Color.RED);
		withdrawButton.setBounds(349, 392, 376, 29);
		withdrawPanel.add(withdrawButton);
		withdrawPanel.add(withdrawLabel);
		this.add(withdrawButton);
		
		// 안내사항 라벨
		JLabel infoLabel = new JLabel(" * 계정 탈퇴 시 삭제된 정보는 복구가 불가능합니다.");
		infoLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		infoLabel.setBounds(349, 448, 376, 38);
		add(infoLabel);
		
		JLabel lblNewLabel = new JLabel("회원 탈퇴");
		lblNewLabel.setForeground(new Color(0, 51, 153));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 55));
		lblNewLabel.setBounds(408, 0, 276, 97);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(251, 0, 588, 782);
		add(panel);
		
		
		// 뒤로가기 버튼 이벤트(클릭시 마이페이지 화면으로)
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

//				withdrawPanel.setVisible(false);

				ChangePanel.WithdrawPanelToMyPage(mf, withdrawPanel, new willChange(mf));
			}
		});


		// 회원 탈퇴 버튼 이벤트 
		withdrawButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(memberCheck.withdrawIdCheck(idTextField.getText(), withdrawtext.getText())) {
					
					ChangePanel.withdrawToMainpanel(mf, withdrawPanel, new MainPanel(mf));

					
				}
				
		



			}
		});

		mf.getContentPane().add(withdrawPanel);


	}
}
