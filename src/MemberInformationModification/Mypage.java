package MemberInformationModification;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class Mypage extends JPanel{

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("My Page");
	private final JPanel panel20 = new JPanel();
	private final JLabel lblNewLabel_1 = new JLabel("ID");
	private final JLabel lblNewLabel_1_1 = new JLabel("Pwd");
	private final JLabel lblNewLabel_1_1_1 = new JLabel("이름");
	private final JLabel lblNewLabel_1_1_1_1 = new JLabel("생년월일");
	private final JLabel lblNewLabel_1_1_1_1_1 = new JLabel("E-mail");
	private final JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("적립금");
	private final JButton btnNewButton = new JButton("확인");
	private final JButton btnNewButton_1 = new JButton("회원탈퇴");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JTextField textField_4 = new JTextField();
	private final JTextField textField_5 = new JTextField();
	private final JButton button1 = new JButton("수정");
	private final JButton btnNewButton_1_1 = new JButton("");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {
					Mypage window = new Mypage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mypage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame("커피한잔의 여유");
		frame.setBounds(100, 100, 403, 603);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		textField.setBounds(122, 85, 190, 28);
		Modifypassword screen = new Modifypassword();
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setForeground(new Color(0, 0, 128));
		textField.setColumns(10);
		panel20.setBounds(0, 0, 390, 562);
		frame.getContentPane().add(panel20);
		panel20.setBackground(new Color(255, 255, 255));
		panel20.setForeground(new Color(255, 255, 255));
		panel20.setLayout(null);
		lblNewLabel_1.setBounds(60, 85, 39, 30);
		lblNewLabel_1.setFont(new Font("휴먼고딕", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
							
		panel20.add(lblNewLabel_1);
		lblNewLabel_1_1.setBounds(52, 145, 70, 30);
		lblNewLabel_1_1.setFont(new Font("휴먼고딕", Font.PLAIN, 20));
		lblNewLabel_1_1.setForeground(new Color(0, 0, 128));
							
		panel20.add(lblNewLabel_1_1);
		lblNewLabel_1_1_1.setBounds(52, 205, 70, 30);
		lblNewLabel_1_1_1.setFont(new Font("휴먼고딕", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 128));
							
		panel20.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1_1.setBounds(37, 265, 85, 30);
		lblNewLabel_1_1_1_1.setFont(new Font("휴먼고딕", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setForeground(new Color(0, 0, 128));
							
		panel20.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1_1.setBounds(52, 325, 70, 30);
		lblNewLabel_1_1_1_1_1.setFont(new Font("휴먼고딕", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setForeground(new Color(0, 0, 128));
							
		panel20.add(lblNewLabel_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1.setBounds(52, 385, 70, 30);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("휴먼고딕", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(0, 0, 128));
							
		panel20.add(lblNewLabel_1_1_1_1_1_1);
		btnNewButton.setBounds(122, 475, 61, 25);
		btnNewButton.setFont(new Font("휴먼고딕", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
							
		panel20.add(btnNewButton);
		btnNewButton_1.setBounds(195, 475, 85, 25);
		btnNewButton_1.setFont(new Font("휴먼고딕", Font.PLAIN, 12));
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
							
		panel20.add(btnNewButton_1);
							
		panel20.add(textField);
		textField_1.setBounds(122, 145, 190, 28);
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setForeground(new Color(0, 0, 128));
		textField_1.setColumns(10);
							
		panel20.add(textField_1);
		textField_2.setBounds(122, 205, 190, 28);
		textField_2.setEditable(false);
		textField_2.setEnabled(false);
     	textField_2.setForeground(new Color(0, 0, 128));
		textField_2.setColumns(10);
							
    	panel20.add(textField_2);
		textField_3.setBounds(122, 265, 190, 28);
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setForeground(new Color(0, 0, 128));
		textField_3.setColumns(10);
							
		panel20.add(textField_3);
		textField_4.setBounds(122, 325, 190, 28);
		textField_4.setEnabled(false);
		textField_4.setEditable(false);
		textField_4.setForeground(new Color(0, 0, 128));
		textField_4.setColumns(10);
							
    	panel20.add(textField_4);
		textField_5.setBounds(122, 385, 190, 28);
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		textField_5.setForeground(new Color(0, 0, 128));
		textField_5.setColumns(10);
							
	    panel20.add(textField_5);
		button1.setBounds(314, 145, 70, 29);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Modifypassword scr = new  Modifypassword();
				scr.main(null);
				panel20.setVisible(false);
				frame.dispose();
				
	
									
									
									
								}
							});
		try {
			frame.setIconImage(ImageIO.read(new File("images/cff.PNG")));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
							button1.setBackground(new Color(0, 0, 128));
							button1.setForeground(new Color(255, 255, 255));
							
							panel20.add(button1);
							
							JTextArea textArea = new JTextArea();
							textArea.setBounds(117, 400, 195, 30);
							panel20.add(textArea);
							
							JPanel panel1 = new JPanel();
							panel1.setBounds(0, 0, 390, 40);
							panel20.add(panel1);
							panel1.setBackground(new Color(0, 0, 128));
							panel1.setForeground(new Color(0, 0, 128));
							panel1.setLayout(null);
							lblNewLabel.setFont(new Font("휴먼고딕", Font.PLAIN, 25));
							lblNewLabel.setForeground(new Color(255, 255, 255));
							lblNewLabel.setBounds(142, 0, 120, 40);
							panel1.add(lblNewLabel);
							btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\1.PNG"));
							btnNewButton_1_1.setBounds(12, 0, 33, 38);
							
							panel1.add(btnNewButton_1_1);
							
	}
}
