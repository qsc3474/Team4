//package taewoo;
//
//import java.awt.Button;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.SwingConstants;
//
//public class orderMenuScreen extends JPanel {
//
//	private MainFrame mf;
//	private JPanel ordermenu;
//
//
//
//	public  orderMenuScreen (MainFrame mf) {
//
//		this.mf = mf;
//		this.ordermenu = this;
//		this.setSize(1000, 700);
//
//
//
//		JButton btn1 = new JButton("추가");
//		btn1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btn1.setBounds(123, 68, 79, 87);
//		this.add(btn1);
//
//
//		JRadioButton sizeS = new JRadioButton("S");
////		sizeS.setAction(action);
//		sizeS.setHorizontalAlignment(SwingConstants.CENTER);
//		sizeS.setBounds(258, 386, 33, 23);
//		this.add(sizeS);
//
//		this.add(sizeS);
//
//
//		JRadioButton sizeM = new JRadioButton("M");
//		this.add(sizeM);
//		sizeM.setHorizontalAlignment(SwingConstants.CENTER);
//		sizeM.setBounds(296, 386, 46, 23);
//		this.add(sizeM);
//
//		JRadioButton sizeL = new JRadioButton("L");
//		this.add(sizeL);
//		sizeL.setHorizontalAlignment(SwingConstants.CENTER);
//		sizeL.setBounds(338, 386, 46, 23);
//		this.add(sizeL);
//
//		Button mypage = new Button("My Page");
//		mypage.setBounds(474, 10, 89, 35);
//		this.add(mypage);
//
//		JButton btn2 = new JButton("추가");
//		btn2.setBounds(214, 68, 79, 87);
//		this.add(btn2);
//
//		JButton btn3 = new JButton("추가");
//		btn3.setBounds(396, 68, 79, 87);
//		this.add(btn3);
//
//		JButton btn4 = new JButton("추가");
//		btn4.setBounds(305, 68, 79, 87);
//		this.add(btn4);
//
//		JButton btn5 = new JButton("추가");
//		btn5.setBounds(396, 204, 79, 87);
//		this.add(btn5);
//
//		JButton btn6 = new JButton("추가");
//		btn6.setBounds(305, 204, 79, 87);
//		this.add(btn6);
//
//		JButton btn7 = new JButton("추가");
//		btn7.setBounds(214, 204, 79, 87);
//		this.add(btn7);
//
//		JButton btn8 = new JButton("추가");
//		btn8.setBounds(123, 204, 79, 87);
//		this.add(btn8);
//
//		JLabel Label1 = new JLabel("아메리카노");
//		Label1.setHorizontalAlignment(SwingConstants.CENTER);
//		Label1.setBounds(133, 165, 69, 29);
//		this.add(Label1);
//
//		JLabel Label2 = new JLabel("라떼");
//		Label2.setHorizontalAlignment(SwingConstants.CENTER);
//		Label2.setBounds(224, 165, 69, 29);
//		this.add(Label2);
//
//		JLabel Label3 = new JLabel("더치커피");
//		Label3.setHorizontalAlignment(SwingConstants.CENTER);
//		Label3.setBounds(308, 165, 69, 29);
//		this.add(Label3);
//
//		JLabel Label4 = new JLabel("카페모카");
//		Label4.setHorizontalAlignment(SwingConstants.CENTER);
//		Label4.setBounds(399, 165, 69, 29);
//		this.add(Label4);
//
//		JLabel Label5 = new JLabel("모히또");
//		Label5.setHorizontalAlignment(SwingConstants.CENTER);
//		Label5.setBounds(133, 302, 69, 29);
//		this.add(Label5);
//
//		JLabel Label6 = new JLabel("오랜지");
//		Label6.setHorizontalAlignment(SwingConstants.CENTER);
//		Label6.setBounds(214, 301, 69, 29);
//		this.add(Label6);
//
//		JLabel Label7 = new JLabel("망고");
//		Label7.setHorizontalAlignment(SwingConstants.CENTER);
//		Label7.setBounds(308, 301, 69, 29);
//		this.add(Label7);
//
//		JLabel Label8 = new JLabel("딸기");
//		Label8.setHorizontalAlignment(SwingConstants.CENTER);
//		Label8.setBounds(399, 302, 69, 29);
//		this.add(Label8);
//
//		JRadioButton temperature1 = new JRadioButton("HOT");

//		this.add(temperature1);
//		temperature1.setHorizontalAlignment(SwingConstants.CENTER);
//		temperature1.setBounds(90, 386, 51, 23);
//		this.add(temperature1);
//
//		JRadioButton temperature2 = new JRadioButton("ICED");
//		this.add(temperature2);
//		temperature2.setHorizontalAlignment(SwingConstants.CENTER);
//		temperature2.setBounds(145, 386, 53, 23);
//		this.add(temperature2);
//
//		JLabel Label9 = new JLabel("온도");
//		Label9.setHorizontalAlignment(SwingConstants.CENTER);
//		Label9.setFont(new Font("굴림", Font.PLAIN, 20));
//		Label9.setBounds(99, 357, 76, 23);
//		this.add(Label9);
//
//		JLabel Label10 = new JLabel("사이즈");
//		Label10.setHorizontalAlignment(SwingConstants.CENTER);
//		Label10.setFont(new Font("굴림", Font.PLAIN, 20));
//		Label10.setBounds(279, 357, 76, 23);
//		this.add(Label10);
//
//		JLabel Label11 = new JLabel("샷추가");
//		Label11.setHorizontalAlignment(SwingConstants.CENTER);
//		Label11.setFont(new Font("굴림", Font.PLAIN, 20));
//		Label11.setBounds(426, 357, 76, 23);
//		this.add(Label11);
//
//		JRadioButton buttonYes = new JRadioButton("YES");
//		this.add(buttonYes);
//		buttonYes.setHorizontalAlignment(SwingConstants.CENTER);
//		buttonYes.setBounds(411, 386, 57, 23);
//		this.add(buttonYes);
//
//		JRadioButton buttonNo = new JRadioButton("NO");
//		this.add(buttonNo);
//		buttonNo.setHorizontalAlignment(SwingConstants.CENTER);
//		buttonNo.setBounds(472, 386, 57, 23);
//		this.add(buttonNo);
//
//
//		mf.add(ordermenu);
//		
//		btn1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
//				}
//			
//		});
//		
//
//		btn2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
//				}
//			
//		});
//		btn3.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
//				}
//			
//		});
//		btn4.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
//				}
//			
//		});
//		btn5.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
//				}
//			
//		});
//		btn6.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
//				}
//			
//		});
//		btn7.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
//				}
//			
//		});
//		btn8.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ChangePanel.ordermenuToOrdercomplete(mf, ordermenu, new orderComplete(mf));
//				}
//			
//		});
//	}
//}
