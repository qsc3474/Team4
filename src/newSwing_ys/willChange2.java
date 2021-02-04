package newSwing_ys;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class willChange2 extends JPanel{


	
	private MainFrame mf;
	private willChange2 willchange;


	public willChange2 (MainFrame mf) {
		this.mf = mf;
		this.willchange = this;
		this.setSize(1000, 700);

		this.setLayout(null);

		

		/* 로그인 버튼 */
		JButton loginButton = new JButton("마이페이지");		
		loginButton.setHorizontalAlignment(SwingConstants.CENTER);
		loginButton.setBounds(330, 392, 370, 45);
		loginButton.setFont(new Font("굴림", Font.BOLD, 20));


		// 패널에 컴포넌트 옮기기
		
		this.add(loginButton);

		

		/* 로그인 버튼 */
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					
//					ChangePanel.willchangeToMypage(mf, willchange, new Mypage(mf));

			
			}

		});
		
		
		
		
		/* 프레임에 붙히기 */
		mf.add(willchange);
		
		
		
	}
	}
