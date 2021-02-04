package newSwing_ys;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
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
	   
	   private ImageIcon icon = new ImageIcon("src/images/coffee10.jpg");
	   private Image img = icon.getImage();
	   
	   public void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      g.drawImage(img, 0 , 0 , null );
	   }
	   
	   
	   public WithdrawPanel(MainFrame mf) {
	      setForeground(Color.BLACK);

	      this.mf = mf;
	      this.withdrawPanel = this;
	      this.setSize(1280, 853);
	      this.setLayout(null);
	      this.setBackground(Color.WHITE);

	      MemberCheck memberCheck = new MemberCheck();      
	      MemberDB memberdb = new MemberDB();


	      // id 입력 라벨
	      idLabel = new JLabel("탈퇴하실 회원님의 ID를 입력해주세요. ");
	      idLabel.setFont(new Font("굴림", Font.BOLD, 17));
	      idLabel.setBounds(415, 283, 335, 38);
	      this.add(idLabel);

	      // id 입력 필드
	      idTextField = new JTextField();
	      idTextField.setBounds(415, 331, 376, 29);
	      idTextField.setColumns(10);
	      this.add(idTextField);

	      // 탈퇴 입력 라벨
	      JLabel withdrawLabel = new JLabel("탈퇴를 원하시면 아래에 '탈퇴'라고 입력해주세요. ");
	      withdrawLabel.setFont(new Font("굴림", Font.BOLD, 17));
	      withdrawLabel.setBounds(415, 370, 408, 38);
	      this.add(withdrawLabel);

	      // 탈퇴 입력 필드
	      JTextField withdrawtext = new JTextField();
	      withdrawtext.setBounds(415, 418, 376, 29);
//	      withdrawPanel.add(withdrawtext);
	      withdrawtext.setColumns(10);
	      this.add(withdrawtext);



	      // 뒤로가기 버튼
	      JButton backButton = new JButton("");
	      backButton.setIcon(new ImageIcon("src/images/2.PNG"));
	      backButton.setBounds(0, 0, 39, 38);
	      this.add(backButton);

	      // 탈퇴 버튼
	      JButton withdrawButton = new JButton("탈퇴");
	      withdrawButton.setFont(new Font("굴림", Font.BOLD, 16));
	      withdrawButton.setForeground(Color.RED);
	      withdrawButton.setBounds(415, 476, 376, 29);
	      withdrawPanel.add(withdrawButton);
	      withdrawPanel.add(withdrawLabel);
	      this.add(withdrawButton);
	      
	      // 안내사항 라벨
	      JLabel infoLabel = new JLabel(" * 계정 탈퇴 시 삭제된 정보는 복구가 불가능합니다.");
	      infoLabel.setForeground(Color.RED);
	      infoLabel.setFont(new Font("굴림", Font.BOLD, 16));
	      infoLabel.setBounds(415, 515, 389, 38);
	      add(infoLabel);
	      
	      // 화면 상단 회원 탈퇴 라벨
	      JLabel lblNewLabel = new JLabel("회원 탈퇴");
	      lblNewLabel.setBackground(new Color(0, 0, 0));
	      lblNewLabel.setForeground(new Color(245, 245, 245));
	      lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 55));
	      lblNewLabel.setBounds(462, 73, 276, 97);
	      add(lblNewLabel);
	      
	      
	      // 뒤로가기 버튼 이벤트(클릭시 마이페이지 화면으로)
	      backButton.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {

//	            withdrawPanel.setVisible(false);

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