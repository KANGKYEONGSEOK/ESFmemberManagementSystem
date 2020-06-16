package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MemberManager;

public class WindowFrame extends JFrame {
	
	MemberManager membermanager; 
	MenuSelection menuselection;
	MemberAdder memberadder;
	MemberViewer memberviewer;
	

	public WindowFrame(MemberManager membermanager) {
		
		this.membermanager = membermanager; 
		menuselection = new MenuSelection(this);
		memberadder = new MemberAdder(this);
		memberviewer = new MemberViewer(this, this.membermanager ); 
		
		this.setTitle("ESF Member Management System by.ks");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		
		this.setupPanel(menuselection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	// getter % setter
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public MemberAdder getMemberadder() {
		return memberadder;
	}

	public void setMemberadder(MemberAdder memberadder) {
		this.memberadder = memberadder;
	}

	public MemberViewer getMemberviewer() {
		return memberviewer;
	}

	public void setMemberviewer(MemberViewer memberviewer) {
		this.memberviewer = memberviewer;
	}

}
