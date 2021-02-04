package newSwing_ys;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
	private Image img;
	public ChangePwd(Image img) {
		this.img = img;
		this.setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setLayout(null);
	}


	public void paintComponent(Graphics g) {
		g.drawImage(img, 0 , 0 , null );
	}

	public ChangePwd() {}
	public ChangePwd(MainFrame mf) {

		this.mf = mf;
		this.changePwd = this;
		this.setSize(1280, 853);
		this.setLayout(null);
		ChangePwd panel = new ChangePwd(new ImageIcon("src/images/coffee3.jpg").getImage());
		
		 MemberDB memberdb = new MemberDB();

		/* pwd 라벨 */
		JLabel pwdlabel = new JLabel("pwd 수정");
		pwdlabel.setBounds(560, 150, 180, 60);
		pwdlabel.setFont(new Font("휴먼고딕", Font.BOLD, 50));

		/* 뒤로 가기 버튼*/
		JButton goback = new JButton("");
		goback.setIcon(new ImageIcon("src/images/2.png"));
		goback.setBounds(0, 0, 39, 38);
		goback.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.modifiedToChangeback(mf, changePwd, new Mypage(mf) );
				
			}
		});


		/* 새로운 비밀번호 라벨 */
		JLabel pwd1_1 = new JLabel("새로운비밀번호");
		pwd1_1.setForeground(new Color(0, 0, 0));
		pwd1_1.setFont(new Font("휴먼고딕", Font.PLAIN, 20));
		pwd1_1.setBounds(440, 280, 180, 25);
		

		/* 새로운 비밀번호 확인 라벨 */
		JLabel pwd1_2 = new JLabel("새로운비밀번호학인");
		pwd1_2.setForeground(new Color(0, 0, 0));
		pwd1_2.setFont(new Font("휴먼고딕", Font.PLAIN, 20));
		pwd1_2.setBounds(440, 370, 180, 25);
		

		/* 새로운 비밀번호 텍스트필드 */
		JPasswordField  pwdfild2 = new JPasswordField();
		pwdfild2.setForeground(new Color(0, 0, 128));
		pwdfild2.setBounds(630, 280, 200, 25);

		/* 새로운 비밀번호 확인 텍스트필드 */
		JPasswordField pwdfild3 = new JPasswordField();
		pwdfild3.setForeground(new Color(0, 0, 128));
		pwdfild3.setBounds(630, 370, 200, 25);
		
		/* 비밀번호 수정 확인 버튼 */
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(415, 476, 376, 29);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				MemberDB mDB = new MemberDB();	
				ArrayList<MemberDTO> changepwd = new ArrayList<>();
				changepwd = new MemberDB().checkMethod();

				for(int j = 0; j < changepwd.size(); j++) {

					if(pwdfild2.getText().equals(pwdfild3.getText()) && changepwd.get(j).getPwd().equals(MemberCheck.mem.getPwd())) {
						JOptionPane.showMessageDialog(null,"비밀번호를 성공적으로 변경되었습니다." );
						changepwd.get(j).setPwd(pwdfild3.getText());
						mDB.changeMember(changepwd);
						ChangePanel.modifiedToChangePwd(mf, changePwd, new MainPanel(mf)); 
						break;
					}else if(!pwdfild2.getText().equals(pwdfild3.getText())){
						JOptionPane.showMessageDialog(null,"비밀번호의 값이 다릅니다. 다시 입력해주세요.");
						return;
					}
				}
			}

		}); 
		
		btnNewButton.setBounds(580, 490, 65, 25);
		this.add(goback);
		this.add(pwd1_1);
		this.add(pwd1_2);
		this.add(btnNewButton);
		this.add(pwdfild2);
		this.add(pwdfild3);
		this.add(pwdlabel);
		this.add(panel);
		mf.add(changePwd);
	}
	private void setIcon(BufferedImage bufferedImage) {}

}
