package newSwing_ys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class orderComplete extends JPanel {

	private MainFrame mf;
	private JPanel ordercomplete;


	public orderComplete (MainFrame mf, OrderDTO2 odt) {
		
		this.mf = mf;
		this.ordercomplete = this;
		this.setSize(1000, 700);
		
//		orderMenuScreen222 orderMenu = new orderMenuScreen222(mf);
		
		JLabel Label1 = new JLabel("1석 4조 커피");
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setFont(new Font("굴림", Font.BOLD, 28));
		Label1.setBounds(140, 10, 340, 55);
		this.add(Label1);
		
		JLabel Label2 = new JLabel("주문 완료");
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		Label2.setFont(new Font("굴림", Font.BOLD, 28));
		Label2.setBounds(140, 79, 340, 55);
		this.add(Label2);

		JLabel Label3 = new JLabel("감사합니다");
		Label3.setHorizontalAlignment(SwingConstants.CENTER);
		Label3.setBounds(266, 157, 88, 31);
		this.add(Label3);
		
		JLabel Label4 = new JLabel("곧 음료가 나올 예정이니 잠시만 기다려 주세요");
		Label4.setHorizontalAlignment(SwingConstants.CENTER);
		Label4.setBounds(147, 170, 320, 92);
		this.add(Label4);
	
		JLabel Label8 = new JLabel("선택한 음료 : " + odt.getDrink());
		Label8.setHorizontalAlignment(SwingConstants.CENTER);
		Label8.setBounds(147, 200, 320, 92);
		this.add(Label8);
		
//		JLabel orderLabel = new JLabel();
//		orderLabel.setBounds(247,200,320,92);
//		this.add(orderLabel);
		
		
		JLabel Label5 = new JLabel("온도 : " + odt.getTemperature());
		Label5.setHorizontalAlignment(SwingConstants.CENTER);
		Label5.setBounds(147, 230, 320, 92);
		this.add(Label5);
		
		JLabel orderLabel = new JLabel();
		orderLabel.setBounds(247,200,320,92);
		this.add(orderLabel);
		
		JLabel Label6 = new JLabel("사이즈 : " + odt.getSize());
		Label6.setHorizontalAlignment(SwingConstants.CENTER);
		Label6.setBounds(147, 260, 320, 92);
		this.add(Label6);
		
		JLabel Label7 = new JLabel("샷추가 : " + odt.getShot());
		Label7.setHorizontalAlignment(SwingConstants.CENTER);
		Label7.setBounds(147, 280, 320, 92);
		this.add(Label7);
		
	
		JButton HomeButton = new JButton("홈으로 돌아가기");
		HomeButton.setBounds(221, 416, 181, 65);
		HomeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				ChangePanel.registerToMain(mf, ordercomplete , new MainPanel(mf));
				}
			
		});	
		this.add(HomeButton);
	
		JButton ReOrder = new JButton("계속 주문하기");
		ReOrder.setBounds(221, 351, 181, 65);
		ReOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				ChangePanel.registerToMain(mf, ordercomplete , new willChange(mf));
				}
			
		});	
		this.add(ReOrder);
	
		
		mf.add(ordercomplete);
	}

}
