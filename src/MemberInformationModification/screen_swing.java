package MemberInformationModification;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ActionMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class screen_swing extends JFrame{
	

public screen_swing() {
		
		JPanel panel2 = new JPanel();
		JPanel panel = new JPanel();
		this.setTitle("커피한잔의 여유");
		
		
		
		add(panel2);
		add(panel);
		
		setVisible(true);//창보이게
		setSize(400,300);//사이즈
		setLocationRelativeTo(null);//가운데서 뜬다
		setResizable(false);//사이즈 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setLayout(null);
		
		JLabel labe = new JLabel("비밀번호 수정 ");
		JLabel label = new JLabel("기존비밀번호       : ");
		JLabel label2 = new JLabel("새로운 비밀번호  : ");
		JLabel label3 = new JLabel("새로운 비밀번호  : ");
		JButton button = new JButton("확인");// 확인버튼
		JButton button2 = new JButton();// 확인버튼
		
		JPasswordField pwdText = new JPasswordField(20);
		JPasswordField pwdText2 = new JPasswordField(20);
		JPasswordField pwdText3 = new JPasswordField(20);
		
		
		panel2.add(labe);
		panel2.add(button2);
		
		panel.add(label);
		panel.add(pwdText);
		panel.add(label2);
		panel.add(pwdText2);
		panel.add(label3);
		panel.add(pwdText3);
		panel.add(button);
		
		
		
		button2.setBounds(10, 8, 30, 25);
		label2.setBounds(50, 100, 110, 25);
		labe.setBounds(145, 9, 110, 25);
		panel2.setBackground(new Color(000, 051, 102));
		panel2.setSize(400,40);
		
		label.setBounds(50, 60, 110, 25);
		label3.setBounds(50, 140, 120, 25);
		pwdText.setBounds(180, 60, 165, 25);
		pwdText2.setBounds(180, 100, 165, 25);
		pwdText3.setBounds(180, 140, 165, 25);
		button.setBounds(150, 190, 80, 25);
		labe.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		try {
			this.setIconImage(ImageIO.read(new File("images/asd.PNG")));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		
		
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String label = "1234";
				String label2 = "12345";
				String label3 = "12345";

				
				if(label.equals(pwdText.getText())) {
					
				}else {
					JOptionPane.showMessageDialog(null, "기존비밀번호가 아닙니다.");
				}
				if(label2.equals(pwdText2.getText())) {
					
				}
				if(label3.equals(pwdText3.getText())) {
					JOptionPane.showMessageDialog(null, "비밀번호가 수정되었습니다.");
				}
				
				
			}
		});
		
		
	}
	public static void main(String[] args) {
		new screen_swing();
	}

}
