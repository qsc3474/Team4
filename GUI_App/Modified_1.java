package GUI_App;

import java.awt.Color;
import java.awt.Font;
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

import swing_ys.MemberDB;
import swing_ys.MemberDTO;





public class Modified_1 extends JPanel{

	private MainFrame mf;
	public JPanel modified_1;

	public Modified_1(MainFrame mf) {
		this.mf = mf;
		this.modified_1 = this;		
		this.setSize(1000, 700);
		this.setLayout(null);
		
		/* 이름 라벨 */
		JLabel label = new JLabel("이름을 입력해주세요 ");
		label.setForeground(new Color(0, 0, 128));
		label.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		label.setBounds(400, 200, 180, 25);
		this.add(label);
		
		/* 뒤로 가기 버튼*/
		JButton goback = new JButton("");
		goback.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\2.PNG"));
		goback.setBounds(450, 80, 38, 38);
		this.add(goback);
		goback.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel2.modifiedToChangeback(mf, modified_1, new Mypage(mf) );
				
			}
		});

		/* 이름 적는 필드 */
		JTextField name = new JTextField();
		name.setForeground(new Color(0, 0, 128));
		name.setBounds(600, 200, 200, 25);
		this.add(name);

		/* 확인 버튼 */
		JButton confirmBtn = new JButton("확인");
		confirmBtn.setBackground(new Color(0, 0, 128));
		confirmBtn.setForeground(new Color(255, 255, 255));
		confirmBtn.setBounds(550, 425, 65, 25);
		this.add(confirmBtn);

		/* 확인버튼 눌렀을 때 */
		confirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
				MemberDTO memberDTO = new MemberDTO();
				ArrayList<MemberDTO> al = new ArrayList<>();

				al = new MemberDB().checkMethod();
				/* 임의로 DB생성 */
//				al.add(new MemberDTO("abc", "pass1", "pass", "kim", null , null, null, null));
//				al.add(new MemberDTO("abc2", "pass2", "pass2", "lee", null , null, null, null));
//				al.add(new MemberDTO("abc3", "pass3", "pass3", "cho", null , null, null, null));

				for(int j = 0; j < al.size(); j++) {

					if(al.get(j).getName().equals(name.getText())) {
						JOptionPane.showMessageDialog(null,"회원중에 일치하는 이름이 있습니다.");
						changePanel2.modifiedToChangePwd(mf, modified_1, new ChangePwd(mf), modified_1);

						return;

					}else {
						JOptionPane.showMessageDialog(null,"회원중에 일치하는 이름이 없습니다.");
						return;
					}
				}	



			}
		});







		mf.getContentPane().add(modified_1);




	}



}
