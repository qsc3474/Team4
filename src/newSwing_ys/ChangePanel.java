package newSwing_ys;

import javax.swing.JPanel;

public class ChangePanel {
	
	/* 메인에서 회원가입 */
	public static void mainToRegisterPanel(MainFrame mf, JPanel main, JPanel willChange) {
		
		
		mf.remove(main);
		mf.add(willChange);
		mf.repaint();
		
	}
	
	/* 회원가입에서 메인으로 */
	public static void registerToMain (MainFrame mf, JPanel register, JPanel main) {
		mf.remove(register);
		mf.add(main);
		mf.repaint();
		
	}

	/* 메인에서 매니져 로그인 시 */
	public static void mainToManagerPanel(MainFrame mf, JPanel mainPanel, JPanel Manager) {
		// TODO Auto-generated method stub
		
		mf.remove(mainPanel);
		mf.add(Manager);
		mf.repaint();
	}
	
	/* 이름매칭 후 비밀번호 수정 */
	public static void modifiedToChangePwd(MainFrame mf, JPanel ChangePwd, JPanel modified_1) {
		mf.remove(ChangePwd);
		mf.add(modified_1);
		mf.repaint(); 		//repaint리페이지
	}
	
	public static void modifiedToChangeback(MainFrame mf, JPanel changePwd, JPanel mypage) {
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
	


	public static void mypageToWithdraw(MainFrame mf, JPanel mypage, JPanel withdrawPanel) {
		// TODO Auto-generated method stub
		mf.add(withdrawPanel);
		mf.remove(mypage);
		mf.repaint();
	}

	public static void WithdrawPanelToMyPage(MainFrame mf, JPanel withdrawPanel, JPanel willChange) {
		// TODO Auto-generated method stub
		mf.add(willChange);
		mf.remove(withdrawPanel);
		mf.repaint();
	}

	public static void withdrawToMainpanel(MainFrame mf, JPanel withdrawPanel, JPanel mainPanel) {
		// TODO Auto-generated method stub
		mf.add(mainPanel);
		mf.remove(withdrawPanel);
		mf.repaint();
		
	}

	
	public static void modifiedToMain(MainFrame mf, JPanel mypage, JPanel willChange) {
		// TODO Auto-generated method stub
		mf.add(willChange);
		mf.remove(mypage);
		mf.repaint();
	}

}
