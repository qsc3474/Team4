package newSwing_ys;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import newSwing_ys.MemberDB;
import newSwing_ys.MemberDTO;

import java.io.*;

public class ChangePwd extends JPanel{
	private MainFrame mf;
	private JPanel changePwd;

	public ChangePwd() {}
	public ChangePwd(MainFrame mf) {

		this.mf = mf;
		this.changePwd = this;
		this.setSize(1500, 700);
		this.setLayout(null);

		/* pwd 라벨 */
		JLabel pwdlabel = new JLabel("pwd 수정");
		pwdlabel.setBounds(550, 90, 180, 25);
		pwdlabel.setFont(new Font("휴먼고딕", Font.PLAIN, 20));
		pwdlabel.setForeground(new Color(0, 0, 128));
		this.add(pwdlabel);

		/* 뒤로 가기 버튼*/
		JButton goback = new JButton("");
		goback.setIcon(new ImageIcon("src/images/2.png"));
		goback.setBounds(480, 80, 38, 38);
		this.add(goback);
		goback.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.modifiedToChangeback(mf, changePwd, new Mypage(mf) );
				
			}
		});


		/* 새로운 비밀번호 라벨 */
		JLabel pwd1_1 = new JLabel("새로운비밀번호");
		pwd1_1.setForeground(new Color(0, 0, 128));
		pwd1_1.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1_1.setBounds(440, 223, 127, 25);
		this.add(pwd1_1);

		/* 새로운 비밀번호 확인 라벨 */
		JLabel pwd1_2 = new JLabel("새로운비밀번호학인");
		pwd1_2.setForeground(new Color(0, 0, 128));
		pwd1_2.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1_2.setBounds(440, 309, 149, 25);
		this.add(pwd1_2);

		/* 새로운 비밀번호 텍스트필드 */
		JPasswordField  pwdfild2 = new JPasswordField();
		pwdfild2.setForeground(new Color(0, 0, 128));
		pwdfild2.setBounds(599, 223, 200, 25);
		this.add(pwdfild2);

		/* 새로운 비밀번호 확인 텍스트필드 */
		JPasswordField pwdfild3 = new JPasswordField();
		pwdfild3.setForeground(new Color(0, 0, 128));
		pwdfild3.setBounds(599, 309, 200, 25);
		this.add(pwdfild3);
		
		/* 비밀번호 수정 확인 버튼 */
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				MemberDB mDB = new MemberDB();	
				MemberDTO memberDTO = new MemberDTO();
				ArrayList<MemberDTO> al = new ArrayList<>();
				al = new MemberDB().checkMethod();

				for(int j = 0; j < al.size(); j++) {

					if(pwdfild2.getText().equals(pwdfild3.getText())) {
						JOptionPane.showMessageDialog(null,"비밀번호를 성공적으로 변경되었습니다." );
						al.get(j).setPwd(pwdfild3.getText());
						mDB.insertMember(al);
						ChangePanel.modifiedToChangePwd(mf, changePwd, new MainPanel(mf), changePwd); 
						return;
					}else if(!pwdfild2.getText().equals(pwdfild3.getText())){
						JOptionPane.showMessageDialog(null,"비밀번호의 값이 다릅니다. 다시 입력해주세요.");
						return;
					}
				}
			}

		}); 

		try {
			this.setIcon(ImageIO.read(new File("images/cff.PNG")));
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(580, 475, 65, 25);
		this.add(btnNewButton);

		mf.add(changePwd);
	}
	private void setIcon(BufferedImage bufferedImage) {}

}