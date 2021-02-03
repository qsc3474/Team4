package newSwing_ys;

import javax.swing.JPanel;

public class ChangePanel {
	
	public static void mainToRegisterPanel(MainFrame mf, JPanel main, JPanel willChange) {
		
		
		mf.remove(main);
		mf.add(willChange);
		mf.repaint();
		
	}
	
	public static void registerToMain (MainFrame mf, JPanel register, JPanel main) {
		mf.remove(register);
		mf.add(main);
		mf.repaint();
		
	}

	public static void mainToManagerPanel(MainFrame mf, JPanel mainPanel, JPanel Manager) {
		// TODO Auto-generated method stub
		
		mf.remove(mainPanel);
		mf.add(Manager);
		mf.repaint();
	}
	
	public static void modifiedToChangePwd(MainFrame mf, JPanel mypage,JPanel modified_1, JPanel ChangePwd) {
		mf.add(ChangePwd);
		mf.add(modified_1);
		
		mf.remove(mypage);		//remove(리무브)  패널 넘겨받는 
		mf.repaint(); 		//repaint리페이지
	}
	
	public static void modifiedToChangeback(MainFrame mf, JPanel changePwd, Mypage mypage) {
		mf.add(mypage);
		mf.remove(changePwd);	
		mf.repaint();
	}

	public static void mainTowillChange(MainFrame mf, JPanel mainPanel, JPanel willchange) {
		// TODO Auto-generated method stub
		mf.add(willchange);
		mf.remove(mainPanel);
		mf.repaint();
	}

	public static void willchangeToMypage(MainFrame mf, JPanel willchange, JPanel mypage) {
		// TODO Auto-generated method stub
		mf.add(mypage);
		mf.remove(willchange);
		mf.repaint();
	}
	

}
