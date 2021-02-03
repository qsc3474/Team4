//package taewoo;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//import java.awt.Font;
//import javax.swing.SwingConstants;
//import javax.swing.JButton;
//
//public class orderComplete2 extends JPanel {
//
//	private MainFrame mf;
//	private JPanel ordercomplete;
//
//
//	public orderComplete2 (MainFrame mf) {
//		
//		this.mf = mf;
//		this.ordercomplete = this;
//		setLayout(null);
//
//		
//		
//		JLabel Label1 = new JLabel("1석 4조 커피");
//		Label1.setHorizontalAlignment(SwingConstants.CENTER);
//		Label1.setFont(new Font("굴림", Font.BOLD, 28));
//		Label1.setBounds(235, 175, 167, 33);
//		this.add(Label1);
//		
//		JLabel Label2 = new JLabel("주문 완료");
//		Label2.setHorizontalAlignment(SwingConstants.CENTER);
//		Label2.setFont(new Font("굴림", Font.BOLD, 28));
//		Label2.setBounds(476, 175, 125, 33);
//		this.add(Label2);
//
//		JLabel Label3 = new JLabel("감사합니다");
//		Label3.setHorizontalAlignment(SwingConstants.CENTER);
//		Label3.setBounds(342, 259, 60, 15);
//		this.add(Label3);
//		
//		JLabel Label4 = new JLabel("곧 음료가 나올 예정이니 잠시만 기다려 주세요");
//		Label4.setHorizontalAlignment(SwingConstants.CENTER);
//		Label4.setBounds(273, 310, 252, 15);
//		this.add(Label4);
//	
//		JButton HomeButton = new JButton("홈으로 돌아가기");
//		HomeButton.setBounds(309, 409, 121, 23);
//		this.add(HomeButton);
//		
//		
//		mf.getContentPane().add(ordercomplete);
//	}
//
//}
