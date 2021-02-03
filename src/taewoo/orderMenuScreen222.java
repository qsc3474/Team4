package taewoo;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class orderMenuScreen222 extends JPanel {

	private JFrame frame;
	private MainFrame mf;
	private JPanel ordermenu;
	private final ButtonGroup buttonGroup = new ButtonGroup();



	public  orderMenuScreen222 (MainFrame mf) {
//		frame.setBounds(100, 100, 600, 500);
		this.mf = mf;
		this.ordermenu = this;
		this.setSize(1200, 700);
		
		frame = new JFrame();
		frame.setVisible(true);
//		frame.setBounds(100, 100, 600, 500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);



		JButton btn1 = new JButton("추가");
		btn1.setBounds(122, 131, 57, 23);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setLayout(null);
		this.add(btn1);

	


		JRadioButton sizeS = new JRadioButton("S");
		sizeS.setBounds(241, 424, 33, 23);
		buttonGroup.add(sizeS);
		sizeS.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(sizeS);

		this.add(sizeS);


		JRadioButton sizeM = new JRadioButton("M");
		sizeM.setBounds(279, 424, 37, 23);
		buttonGroup.add(sizeM);
		this.add(sizeM);
		sizeM.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(sizeM);

		JRadioButton sizeL = new JRadioButton("L");
		sizeL.setBounds(321, 424, 33, 23);
		buttonGroup.add(sizeL);
		this.add(sizeL);
		sizeL.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(sizeL);

		Button mypage = new Button("My Page");
		mypage.setBounds(401, 67, 60, 23);
		this.add(mypage);

		JButton btn2 = new JButton("추가");
		btn2.setBounds(220, 116, 57, 23);
		this.add(btn2);

		JButton btn3 = new JButton("추가");
		btn3.setBounds(297, 116, 57, 23);
		this.add(btn3);

		JButton btn4 = new JButton("추가");
		btn4.setBounds(373, 116, 57, 23);
		this.add(btn4);

		JButton btn5 = new JButton("추가");
		btn5.setBounds(162, 234, 57, 23);
		this.add(btn5);

		JButton btn6 = new JButton("추가");
		btn6.setBounds(220, 252, 57, 23);
		this.add(btn6);

		JButton btn7 = new JButton("추가");
		btn7.setBounds(321, 234, 57, 23);
		this.add(btn7);

		JButton btn8 = new JButton("추가");
		btn8.setBounds(401, 234, 57, 23);
		this.add(btn8);

		JLabel Label1 = new JLabel("아메리카노");
		Label1.setBounds(119, 199, 60, 15);
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label1);

		JLabel Label2 = new JLabel("라떼");
		Label2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		Label2.setBounds(241, 199, 24, 15);
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label2);

		JLabel Label3 = new JLabel("더치커피");
		Label3.setBounds(306, 164, 48, 15);
		Label3.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label3);

		JLabel Label4 = new JLabel("카페모카");
		Label4.setBounds(387, 164, 48, 15);
		Label4.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label4);

		JLabel Label5 = new JLabel("모히또");
		Label5.setBounds(183, 278, 36, 15);
		Label5.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label5);

		JLabel Label6 = new JLabel("오랜지");
		Label6.setBounds(241, 303, 36, 15);
		Label6.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label6);

		JLabel Label7 = new JLabel("망고");
		Label7.setBounds(330, 303, 24, 15);
		Label7.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label7);

		JLabel Label8 = new JLabel("딸기");
		Label8.setBounds(406, 303, 24, 15);
		Label8.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label8);

		JRadioButton temperature1 = new JRadioButton("HOT");
		temperature1.setBounds(128, 424, 51, 23);
		buttonGroup.add(temperature1);
		this.add(temperature1);
		temperature1.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(temperature1);

		JRadioButton temperature2 = new JRadioButton("ICED");
		temperature2.setBounds(184, 424, 53, 23);
		buttonGroup.add(temperature2);
		this.add(temperature2);
		temperature2.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(temperature2);

		JLabel Label9 = new JLabel("온도");
		Label9.setBounds(183, 365, 40, 24);
		Label9.setHorizontalAlignment(SwingConstants.CENTER);
		Label9.setFont(new Font("굴림", Font.PLAIN, 20));
		this.add(Label9);

		JLabel Label10 = new JLabel("사이즈");
		Label10.setBounds(268, 365, 60, 24);
		Label10.setHorizontalAlignment(SwingConstants.CENTER);
		Label10.setFont(new Font("굴림", Font.PLAIN, 20));
		this.add(Label10);

		JLabel Label11 = new JLabel("샷추가");
		Label11.setBounds(386, 375, 60, 24);
		Label11.setHorizontalAlignment(SwingConstants.CENTER);
		Label11.setFont(new Font("굴림", Font.PLAIN, 20));
		this.add(Label11);

		JRadioButton buttonYes = new JRadioButton("YES");
		buttonYes.setBounds(373, 424, 49, 23);
		buttonGroup.add(buttonYes);
		this.add(buttonYes);
		buttonYes.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(buttonYes);

		JRadioButton buttonNo = new JRadioButton("NO");
		buttonNo.setBounds(426, 424, 43, 23);
		buttonGroup.add(buttonNo);
		this.add(buttonNo);
		buttonNo.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(buttonNo);
		
		
		
		
		ButtonGroup size = new ButtonGroup();
		size.add(sizeS);
		size.add(sizeM);
		size.add(sizeL);
		
		ordermenu.add(sizeS);
		ordermenu.add(sizeM);
		ordermenu.add(sizeL);
		
		ButtonGroup temperature = new ButtonGroup();
		temperature.add(temperature1);
		temperature.add(temperature2);
		
		ordermenu.add(temperature2);
		ordermenu.add(temperature1);
		
		ButtonGroup shot = new ButtonGroup();
		shot.add(buttonNo);
		shot.add(buttonYes);

		ordermenu.add(buttonNo);
		ordermenu.add(buttonYes);
		
		

		mf.getContentPane().add(ordermenu);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
				}
			
		});
		

		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
				}
			
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
				}
			
		});
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
				}
			
		});
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
				}
			
		});
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
				}
			
		});
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
				}
			
		});
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
				}
			
		});
	}
}
