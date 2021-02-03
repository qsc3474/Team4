package newSwing_ys;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Mypage extends JPanel{

	private MainFrame mf;
	private JPanel mypage;

	public Mypage(MainFrame mf) {
		this.mf = mf;
		this.mypage = this;
		
		this.setSize(1000, 700);
		this.setLayout(null);
		
		MemberDTO memberDTO = new MemberDTO();
		ArrayList<MemberDTO> al = new ArrayList<>();
		MemberDB memberdb = new MemberDB();
		
		
		JLabel label = new JLabel("My page");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.PLAIN, 25));
		label.setForeground(new Color(0, 0, 128));
		label.setBounds(600, 25, 98, 45);
		
		/* id 라벨 */
		JLabel idlabel = new JLabel("아이디");
		idlabel.setHorizontalAlignment(SwingConstants.CENTER);
		idlabel.setFont(new Font("굴림", Font.PLAIN, 19));
		idlabel.setForeground(new Color(0, 0, 128));
		idlabel.setBounds(394, 102, 98, 45);
		
		
		/* pwd 라벨 */
		JLabel pwddlabel = new JLabel("pwd");
		pwddlabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwddlabel.setFont(new Font("굴림", Font.PLAIN, 19));
		pwddlabel.setForeground(new Color(0, 0, 128));
		pwddlabel.setBounds(394, 182, 98, 45);
		
		/* 이름 라벨 */
		JLabel namelabel = new JLabel("이름");
		namelabel.setHorizontalAlignment(SwingConstants.CENTER);
		namelabel.setFont(new Font("굴림", Font.PLAIN, 19));
		namelabel.setForeground(new Color(0, 0, 128));
		namelabel.setBounds(394, 272, 98, 45);
		
		/* 생년월일 라벨 */
		JLabel daylabel = new JLabel("생년월일");
		daylabel.setHorizontalAlignment(SwingConstants.CENTER);
		daylabel.setFont(new Font("굴림", Font.PLAIN, 19));
		daylabel.setForeground(new Color(0, 0, 128));
		daylabel.setBounds(394, 362, 98, 45);
		
		/* 이메일 라벨 */
		JLabel email = new JLabel("E-mail");
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setFont(new Font("굴림", Font.PLAIN, 19));
		email.setForeground(new Color(0, 0, 128));
		email.setBounds(394, 452, 98, 45);
		
		/* 수정 버튼 */
		JButton Modifiedbut = new JButton("수정");
		Modifiedbut.setHorizontalAlignment(SwingConstants.CENTER);
		Modifiedbut.setBounds(900, 182, 70, 40);
		Modifiedbut.setFont(new Font("굴림", Font.BOLD, 15));
		
		/* 수정 버튼 누를시 */
		Modifiedbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				ChangePanel.modifiedToChangePwd(mf, mypage, new Modified_1(mf), mypage); 
			}
		});
		
		/* 회원탈퇴 버튼 */
		JButton hoewontaltoeibut = new JButton("회원탈퇴");
		hoewontaltoeibut.setHorizontalAlignment(SwingConstants.CENTER);
		hoewontaltoeibut.setBounds(610, 550, 100, 40);
		hoewontaltoeibut.setFont(new Font("굴림", Font.BOLD, 15));
		
		/* 수정 버튼 누를시 */
		hoewontaltoeibut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				ChangePanel.mypageToWithdraw(mf, mypage, new WithdrawPanel(mf));
			}
		});
		
		
		
		/* 뒤로 가기(메뉴주문 페이지로) */
		JButton backbut = new JButton("");
		backbut.setIcon(new ImageIcon("src/images/2.png"));
		backbut.setHorizontalAlignment(SwingConstants.CENTER);
		backbut.setBounds(394, 25, 38, 38);
		backbut.setFont(new Font("굴림", Font.BOLD, 13));
		
		/* 뒤로 가기 누를시 */
		backbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				ChangePanel.modifiedToChangePwd(mf, mypage, new MainPanel(mf), mypage); 
			}
		});
		
		
		/* id 텍스트필드 */
		JTextField idTextField = new JTextField(MemberCheck.mem.getId());
		idTextField.setBounds(544, 102, 330, 45);
		idTextField.setColumns(10);
		idTextField.setEditable(false);	

		
		/* pwd 텍스트필드 */
		JPasswordField pwdField = new JPasswordField(MemberCheck.mem.getPwd());
		pwdField.setBounds(544, 182, 330, 45);
		pwdField.setColumns(10);
		pwdField.setEditable(false);	
		
		/* 이름 텍스트필드 */
		JTextField nameTextField = new JTextField(MemberCheck.mem.getName());
		nameTextField.setBounds(544, 272, 330, 45);
		nameTextField.setColumns(10);
		nameTextField.setEditable(false);	
		
		/* 생년월일 텍스트필드 */
		JTextField dayTextField = new JTextField(MemberCheck.mem.getDay());
		dayTextField.setBounds(544, 362, 330, 45);
		dayTextField.setColumns(10);
		dayTextField.setEditable(false);	
		
		/* 이메일 텍스트필드 */
		JTextField emailTextField = new JTextField(MemberCheck.mem.getEmail());
		emailTextField.setBounds(544, 452, 330, 45);
		emailTextField.setColumns(10);
		emailTextField.setEditable(false);	
		this.add(idTextField);
		this.add(pwdField);
		this.add(nameTextField);
		this.add(dayTextField);
		this.add(emailTextField);
		
		
		
		this.add(label);
		this.add(idlabel);
		this.add(pwddlabel);
		this.add(namelabel);
		this.add(daylabel);
		this.add(email);
		this.add(Modifiedbut);

		this.add(backbut);
		this.add(hoewontaltoeibut);
		
		
		mf.getContentPane().add(mypage);
		
	}
}
