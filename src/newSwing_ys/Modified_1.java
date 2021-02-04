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
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import newSwing_ys.MemberDB;
import newSwing_ys.MemberDTO;

public class Modified_1 extends JPanel{

	private MainFrame mf;
	public JPanel modified_1;
	private Image img;
	public Modified_1(Image img) {
		this.img = img;
		this.setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		
	}


	public void paintComponent(Graphics g) {
		g.drawImage(img, 0 , 0 , null );
	}

	public Modified_1(MainFrame mf) {
		this.mf = mf;
		this.modified_1 = this;		
		this.setSize(1280, 853);
		this.setLayout(null);
		Modified_1 panel = new Modified_1(new ImageIcon("src/images/coffee4.jpg").getImage());

		/* pwd 수정 라벨 */
		JLabel label2 = new JLabel("pwd 수정");
		label2.setFont(new Font("휴먼고딕", Font.PLAIN, 20));
		label2.setBounds(550, 270, 180, 25);
		

		/* 이름 라벨 */
		JLabel label = new JLabel("이름을 입력해주세요 ");
		label.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		label.setBounds(400, 400, 180, 25);
		

		/* 뒤로 가기 버튼*/
		JButton goback = new JButton("");
		goback.setIcon(new ImageIcon("src/images/2.png"));
		goback.setBounds(480, 260, 38, 38);
		

		/* 뒤로가기 버튼 */
		goback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.modifiedToChangeback(mf, modified_1, new Mypage(mf) );

			}
		});

		/* 이름 적는 필드 */
		JTextField name = new JTextField();
		name.setBounds(600, 400, 200, 25);
		this.add(name);

		/* 확인 버튼 */
		JButton confirmBtn = new JButton("확인");
//		confirmBtn.setForeground(new Color(255, 255, 255));
		confirmBtn.setBounds(550, 500, 65, 25);
		

		/* 확인버튼 눌렀을 때 */
		confirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MemberDTO memberDTO = new MemberDTO();

				ArrayList<MemberDTO> al = new ArrayList<>();
				al = new MemberDB().checkMethod();

				for(int j = 0; j < al.size(); j++) {

					if(MemberCheck.mem.getName().equals(name.getText())) {

						JOptionPane.showMessageDialog(null,"회원중에 일치하는 이름이 있습니다.");

						ChangePanel.modifiedToChangePwd(mf, modified_1, new ChangePwd(mf));

						return;

					}else {
						JOptionPane.showMessageDialog(null,"회원중에 일치하는 이름이 없습니다.");
						return;
					}
				}	



			}
		});
		this.add(confirmBtn);
		this.add(goback);
		this.add(label2);
		this.add(label);

		
		this.add(panel);
		mf.getContentPane().add(modified_1);

	}

}
