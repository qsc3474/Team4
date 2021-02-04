package newSwing_ys;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
private Image img;
	
	public Mypage(Image img) {
		this.img = img;
		this.setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setLayout(null);
	}


	public void paintComponent(Graphics g) {
		g.drawImage(img, 0 , 0 , null );
	}

	public Mypage(MainFrame mf) {
		this.mf = mf;
		this.mypage = this;
		
		this.setSize(1280, 853);
		Mypage panel = new Mypage(new ImageIcon("src/images/coffee8.jpg").getImage());
		this.setLayout(null);
		
		MemberDTO memberDTO = new MemberDTO();
		ArrayList<MemberDTO> al = new ArrayList<>();
		MemberDB memberdb = new MemberDB();
		
		
		JLabel label = new JLabel("My page");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.PLAIN, 25));
		label.setBounds(660, 85, 98, 45);
		
		/* id 라벨 */
		JLabel idlabel = new JLabel("아이디");
		idlabel.setHorizontalAlignment(SwingConstants.CENTER);
		idlabel.setFont(new Font("굴림", Font.PLAIN, 19));
		idlabel.setBounds(485, 148, 98, 45);
		
		
		/* pwd 라벨 */
		JLabel pwddlabel = new JLabel("pwd");
		pwddlabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwddlabel.setFont(new Font("굴림", Font.PLAIN, 19));
		pwddlabel.setBounds(485, 230, 98, 45);
		
		/* 이름 라벨 */
		JLabel namelabel = new JLabel("이름");
		namelabel.setHorizontalAlignment(SwingConstants.CENTER);
		namelabel.setFont(new Font("굴림", Font.PLAIN, 19));
		namelabel.setBounds(485, 320, 98, 45);
		
		/* 생년월일 라벨 */
		JLabel daylabel = new JLabel("생년월일");
		daylabel.setHorizontalAlignment(SwingConstants.CENTER);
		daylabel.setFont(new Font("굴림", Font.PLAIN, 19));
		daylabel.setBounds(485, 410, 98, 45);
		
		/* 이메일 라벨 */
		JLabel email = new JLabel("E-mail");
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setFont(new Font("굴림", Font.PLAIN, 19));
		email.setBounds(485, 500, 98, 45);
		
		/* 수정 버튼 */
		JButton Modifiedbut = new JButton("수정");
		Modifiedbut.setHorizontalAlignment(SwingConstants.CENTER);
		Modifiedbut.setBounds(915, 230, 66, 45);
		Modifiedbut.setFont(new Font("굴림", Font.BOLD, 15));
		
		/* 수정 버튼 누를시 */
		Modifiedbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				ChangePanel.modifiedToChangePwd(mf, mypage, new Modified_1(mf)); 
			}
		});
		
		/* 회원탈퇴 버튼 */
		JButton hoewontaltoeibut = new JButton("회원탈퇴");
		hoewontaltoeibut.setHorizontalAlignment(SwingConstants.CENTER);
		hoewontaltoeibut.setBounds(660, 650, 100, 40);
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
		backbut.setIcon(new ImageIcon("src/images/2.PNG"));
		backbut.setHorizontalAlignment(SwingConstants.CENTER);
		backbut.setBounds(394, 25, 38, 38);
		backbut.setFont(new Font("굴림", Font.BOLD, 13));
		
		/* 뒤로 가기 누를시 */
		backbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				ChangePanel.registerToMain(mf, mypage, new willChange(mf)); 
			}
		});
		
		
		/* id 텍스트필드 */
		JTextField idTextField = new JTextField(MemberCheck.mem.getId());
		idTextField.setBounds(585, 150, 330, 45);
		idTextField.setColumns(10);
		idTextField.setEditable(false);	

		
		/* pwd 텍스트필드 */
		JPasswordField pwdField = new JPasswordField(MemberCheck.mem.getPwd());
		pwdField.setBounds(585, 230, 330, 45);
		pwdField.setColumns(10);
		pwdField.setEditable(false);	
		
		/* 이름 텍스트필드 */
		JTextField nameTextField = new JTextField(MemberCheck.mem.getName());
		nameTextField.setBounds(585, 320, 330, 45);
		nameTextField.setColumns(10);
		nameTextField.setEditable(false);	
		
		/* 생년월일 텍스트필드 */
		JTextField dayTextField = new JTextField(MemberCheck.mem.getDay());
		dayTextField.setBounds(585, 410, 330, 45);
		dayTextField.setColumns(10);
		dayTextField.setEditable(false);	
		
		/* 이메일 텍스트필드 */
		JTextField emailTextField = new JTextField(MemberCheck.mem.getEmail());
		emailTextField.setBounds(585, 500, 330, 45);
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
		this.add(panel);
		
		
		mf.getContentPane().add(mypage);
		
	}
}
