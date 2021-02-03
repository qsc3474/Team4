package GUI_App;

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
import java.io.*;

import swing_ys.MemberDB;
import swing_ys.MemberDTO;

public class ChangePwd extends JPanel{
	private MainFrame mf;
	private JPanel changePwd;

	public ChangePwd() {

	}
	public ChangePwd(MainFrame mf) {

		this.mf = mf;
		this.changePwd = this;
		
		this.setSize(1500, 700);
		this.setLayout(null);

		/* pwd 라벨 */
		JLabel pwdlabel = new JLabel("pwd 수정");
		pwdlabel.setBounds(580, 80, 89, 24);
		pwdlabel.setFont(new Font("굴림", Font.BOLD, 20));
		pwdlabel.setForeground(new Color(0, 0, 128));
		this.add(pwdlabel);

		/* 뒤로 가기 버튼*/
		JButton goback = new JButton("");
		goback.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\2.PNG"));
		goback.setBounds(450, 80, 38, 38);
		this.add(goback);
		goback.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel2.modifiedToChangeback(mf, changePwd, new Mypage(mf) );
				
			}
		});

		/* 기본비밀번호 라벨 */
		JLabel pwd1 = new JLabel("기존비밀번호");
		pwd1.setForeground(new Color(0, 0, 128));
		pwd1.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1.setBounds(440, 191, 127, 25);
		this.add(pwd1);

		/* 새로운 비밀번호 라벨 */
		JLabel pwd1_1 = new JLabel("새로운비밀번호");
		pwd1_1.setForeground(new Color(0, 0, 128));
		pwd1_1.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1_1.setBounds(440, 274, 127, 25);
		this.add(pwd1_1);

		/* 새로운 비밀번호 확인 라벨 */
		JLabel pwd1_2 = new JLabel("새로운비밀번호학인");
		pwd1_2.setForeground(new Color(0, 0, 128));
		pwd1_2.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1_2.setBounds(440, 360, 149, 25);
		this.add(pwd1_2);

		/* 기존비밀번호 텍스트필드 */
		JPasswordField pwdfild1 = new JPasswordField();
		pwdfild1.setForeground(new Color(0, 0, 128));
		pwdfild1.setBounds(599, 189, 200, 25);
		this.add(pwdfild1);

		/* 새로운 비밀번호 텍스트필드 */
		JPasswordField  pwdfild2 = new JPasswordField();
		pwdfild2.setForeground(new Color(0, 0, 128));
		pwdfild2.setBounds(599, 273, 200, 25);
		this.add(pwdfild2);

		/* 새로운 비밀번호 확인 텍스트필드 */
		JPasswordField pwdfild3 = new JPasswordField();
		pwdfild3.setForeground(new Color(0, 0, 128));
		pwdfild3.setBounds(599, 359, 200, 25);
		this.add(pwdfild3);
		
		/* 비밀번호 수정 확인 버튼 */
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				MemberDB mDB = new MemberDB();	
				MemberDTO memberDTO = new MemberDTO();
				ArrayList<MemberDTO> al = new ArrayList<>();


				al = new MemberDB().checkMethod();

				for(int j = 0; j < al.size(); j++) {

					if(al.get(j).getPwd().equals(pwdfild1.getText())) {
						
					}else {
						JOptionPane.showMessageDialog(null, "기존비밀번호가 아닙니다. 다시 입력해주세요.");
						return;
					}

					if(pwdfild2.getText().equals(pwdfild3.getText())) {

						JOptionPane.showMessageDialog(null,"비밀번호를 성공적으로 변경되었습니다." );
						//						JOptionPane.showMessageDialog(null,"회원정보수정으로 돌아갑니다.");
						al.get(j).setPwd(pwdfild3.getText());
						mDB.insertMember(al);
						al = new MemberDB().checkMethod();
						changePanel2.modifiedToChangePwd(mf, changePwd, new Mypage(mf), changePwd); 

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

	private void setIcon(BufferedImage bufferedImage) {
		

	}

	

}