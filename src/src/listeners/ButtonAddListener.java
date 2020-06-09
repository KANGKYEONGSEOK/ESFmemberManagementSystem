package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.MemberAdder;
import gui.MemberViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {

	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) { // WindowFrame frame : 파라미터
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource(); // 형변환
		//System.out.println(button.getText());
		MemberAdder adder = frame.getMemberadder();
		frame.setupPanel(adder);
	}

}
