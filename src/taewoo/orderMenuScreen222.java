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
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class orderMenuScreen222 extends JPanel {

	private JFrame frame;
	private MainFrame mf;
	private JPanel ordermenu;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private OrderDTO2 odt = new OrderDTO2(); 


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



	

	


		JRadioButton sizeS = new JRadioButton("S");
		sizeS.setBounds(120, 60, 33, 23);
		buttonGroup.add(sizeS);
		sizeS.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(sizeS);

		this.add(sizeS);


		JRadioButton sizeM = new JRadioButton("M");
		sizeM.setBounds(160, 60, 37, 23);
		buttonGroup.add(sizeM);
		this.add(sizeM);
		sizeM.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(sizeM);

		JRadioButton sizeL = new JRadioButton("L");
		sizeL.setBounds(200, 60, 33, 23);
		buttonGroup.add(sizeL);
		this.add(sizeL);
		sizeL.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(sizeL);

		Button mypage = new Button("My Page");
		mypage.setBounds(470, 20, 100, 50);
		this.add(mypage);

		Button logout = new Button("Logout");
		logout.setBounds(470, 70, 100, 50);
		this.add(logout);
		
		JButton btn1 = new JButton("주문");
		btn1.setBounds(20, 200, 100, 50);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setLayout(null);
		this.add(btn1);
		
		JButton btn2 = new JButton("주문");
		btn2.setBounds(170, 200, 100, 50);
		this.add(btn2);

		JButton btn3 = new JButton("주문");
		btn3.setBounds(320, 200, 100, 50);
		this.add(btn3);

		JButton btn4 = new JButton("주문");
		btn4.setBounds(470, 200, 100, 50);
		this.add(btn4);

		JButton btn5 = new JButton("주문");
		btn5.setBounds(20, 300, 100, 50);
		this.add(btn5);

		JButton btn6 = new JButton("주문");
		btn6.setBounds(170, 300, 100, 50);
		this.add(btn6);

		JButton btn7 = new JButton("주문");
		btn7.setBounds(320, 300, 100, 50);
		this.add(btn7);

		JButton btn8 = new JButton("주문");
		btn8.setBounds(470, 300, 100, 50);
		this.add(btn8);

		JLabel Label1 = new JLabel("아메리카노");
		Label1.setBounds(40, 180, 65, 15);
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label1);

		JLabel Label2 = new JLabel("라떼");
		Label2.setBounds(190, 180, 65, 15);
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label2);

		JLabel Label3 = new JLabel("더치커피");
		Label3.setBounds(340, 180, 70, 15);
		Label3.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label3);

		JLabel Label4 = new JLabel("카페모카");
		Label4.setBounds(490, 180, 70, 15);
		Label4.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label4);

		JLabel Label5 = new JLabel("모히또");
		Label5.setBounds(40, 280, 70, 15);
		Label5.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label5);

		JLabel Label6 = new JLabel("오랜지");
		Label6.setBounds(190, 280, 70, 15);
		Label6.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label6);

		JLabel Label7 = new JLabel("망고");
		Label7.setBounds(340, 280, 70, 15);
		Label7.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label7);

		JLabel Label8 = new JLabel("딸기");
		Label8.setBounds(490, 280, 70, 15);
		Label8.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Label8);

		JRadioButton temperature1 = new JRadioButton("HOT");
		temperature1.setBounds(120, 20, 50, 25);
		buttonGroup.add(temperature1);
		this.add(temperature1);
		temperature1.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(temperature1);

		JRadioButton temperature2 = new JRadioButton("ICED");
		temperature2.setBounds(170, 20, 60, 25);
		buttonGroup.add(temperature2);
		this.add(temperature2);
		temperature2.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(temperature2);

		JLabel Label9 = new JLabel("온도 :");
		Label9.setBounds(20, 20, 100, 24);
		Label9.setHorizontalAlignment(SwingConstants.CENTER);
		Label9.setFont(new Font("굴림", Font.PLAIN, 20));
		this.add(Label9);

		JLabel Label10 = new JLabel("사이즈 :");
		Label10.setBounds(20, 60, 100, 24);
		Label10.setHorizontalAlignment(SwingConstants.CENTER);
		Label10.setFont(new Font("굴림", Font.PLAIN, 20));
		this.add(Label10);

		JLabel Label11 = new JLabel("샷추가 :");
		Label11.setBounds(20, 100, 100, 24);
		Label11.setHorizontalAlignment(SwingConstants.CENTER);
		Label11.setFont(new Font("굴림", Font.PLAIN, 20));
		this.add(Label11);

		JRadioButton buttonYes = new JRadioButton("YES");
		buttonYes.setBounds(120, 100, 60, 23);
		buttonGroup.add(buttonYes);
		this.add(buttonYes);
		buttonYes.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(buttonYes);

		JRadioButton buttonNo = new JRadioButton("NO");
		buttonNo.setBounds(170, 100, 43, 23);
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
		
		
		JPanel resultPanel = new JPanel();
//		JLabel text = new JLabel("테스트 출력용");
//		resultPanel.add(text);
		mf.add(resultPanel, "South");
		

		mf.getContentPane().add(ordermenu);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> personalOrder = new ArrayList<>();
				
				
				
//				OrderCHEC.ameorder(size, temperature, shot);
				odt.setDrink("아메리카노가 주문되었습니다");
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf, odt));
				}
			
		});
		

		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				odt.setDrink("라떼가 주문되었습니다");
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf, odt));
				}
			
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				odt.setDrink("더치커피가 주문되었습니다");
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf, odt));
				}
			
		});
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				odt.setDrink("모카가 주문되었습니다");
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf, odt));
				}
			
		});
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				odt.setDrink("모히또가 주문되었습니다");
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf, odt));
				}
			
		});
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				odt.setDrink("오렌지가 주문되었습니다");
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf, odt));
				}
			
		});
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				odt.setDrink("망고가 주문되었습니다");
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf, odt));
				}
			
		});
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				odt.setDrink("딸기가 주문되었습니다");
				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf, odt));
	
			}
				
			
			
		});
		
		sizeS.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				text.setText("Small size가 선택되었습니다.");
				odt.setSize("Small size가 선택되었습니다.");
			}
		});
		
		sizeM.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				text.setText("Medium size가 선택되었습니다.");
				odt.setSize("Medium size가 선택되었습니다.");
			}
		});
		
		sizeL.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				odt.setSize("Large size가 선택되었습니다.");
//				text.setText("Large size가 선택되었습니다.");
	
			}
		});
		
		temperature1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				text.setText("HOT 입니다.");
				odt.setTemperature("HOT 입니다.");
			}
		});
		
		temperature2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				text.setText("ICED 입니다.");
				odt.setTemperature("ICED 입니다.");
			}
		});
		
		buttonNo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				text.setText("Shot 추가 No 입니다.");
				odt.setShot("NO 입니다.");
			}
		});
		
		buttonYes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				text.setText("Shot 추가 Yes입니다");
				odt.setShot("YES 입니다.");
			}
		});
		
		
		mypage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				ChangePanel.ordermenuToMyPage(mf, , (mf));
				}
				
			
			
		});

	}
}
