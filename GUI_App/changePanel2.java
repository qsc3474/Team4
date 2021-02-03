package GUI_App;

import javax.swing.JPanel;

public class changePanel2 {

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
	
}
