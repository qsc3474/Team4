package newSwing_ys;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class orderComplete extends JPanel {

	private MainFrame mf;
	private JPanel ordercomplete;
	private Image img;
	public orderComplete(Image img) {
		this.img = img;
		this.setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		this.setLayout(null);
	}


	public void paintComponent(Graphics g) {
		g.drawImage(img, 0 , 0 , null );
	}

	public orderComplete (MainFrame mf, OrderDTO2 odt) {
		
		this.mf = mf;
		this.ordercomplete = this;
		this.setSize(1280, 853);
		OrderPage panel = new OrderPage(new ImageIcon("src/images/coffee12.jpg").getImage());
//		orderMenuScreen222 orderMenu = new orderMenuScreen222(mf);
		
		JLabel Label1 = new JLabel("1석 4조 커피");
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setFont(new Font("굴림", Font.BOLD, 28));
		Label1.setBounds(610, 190, 340, 55);
		this.add(Label1);
		
		JLabel Label2 = new JLabel("주문 완료");
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		Label2.setFont(new Font("굴림", Font.BOLD, 28));
		Label2.setBounds(610, 270, 340, 55);
		this.add(Label2);

		JLabel Label3 = new JLabel("감사합니다");
		Label3.setHorizontalAlignment(SwingConstants.CENTER);
		Label3.setBounds(735, 360, 88, 31);
		this.add(Label3);
		
		JLabel Label4 = new JLabel("곧 음료가 나올 예정이니 잠시만 기다려 주세요");
		Label4.setHorizontalAlignment(SwingConstants.CENTER);
		Label4.setBounds(630, 400, 320, 92);
		this.add(Label4);
	
		JLabel Label8 = new JLabel("선택한 음료 : " + odt.getDrink());
		Label8.setHorizontalAlignment(SwingConstants.CENTER);
		Label8.setBounds(630, 480, 320, 92);
		this.add(Label8);
		
//		JLabel orderLabel = new JLabel();
//		orderLabel.setBounds(247,200,320,92);
//		this.add(orderLabel);
		
		
		JLabel Label5 = new JLabel("온도 : " + odt.getTemperature());
		Label5.setHorizontalAlignment(SwingConstants.CENTER);
		Label5.setBounds(620, 520, 320, 92);
		this.add(Label5);
		
		JLabel orderLabel = new JLabel();
		orderLabel.setBounds(600,530,320,92);
		this.add(orderLabel);
		
		JLabel Label6 = new JLabel("사이즈 : " + odt.getSize());
		Label6.setHorizontalAlignment(SwingConstants.CENTER);
		Label6.setBounds(620, 560, 320, 92);
		this.add(Label6);
		
		JLabel Label7 = new JLabel("샷추가 : " + odt.getShot());
		Label7.setHorizontalAlignment(SwingConstants.CENTER);
		Label7.setBounds(620, 600, 320, 92);
		this.add(Label7);
		
	
		JButton HomeButton = new JButton("홈으로 돌아가기");
		HomeButton.setBounds(700, 680, 181, 40);
		HomeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				ChangePanel.registerToMain(mf, ordercomplete , new MainPanel(mf));
				}
			
		});	
		this.add(HomeButton);
	
		JButton ReOrder = new JButton("계속 주문하기");
		ReOrder.setBounds(700, 730, 181, 40);
		ReOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				ChangePanel.registerToMain(mf, ordercomplete , new OrderPage(mf));
				}
			
		});	
		this.add(ReOrder);
	
		this.add(panel);
		mf.add(ordercomplete);
	}

}
