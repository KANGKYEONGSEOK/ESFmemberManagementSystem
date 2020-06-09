package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.MemberAdder;
import gui.MemberViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {

	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) { // WindowFrame frame : �Ķ����
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource(); // ����ȯ
		//System.out.println(button.getText());
		MemberAdder adder = frame.getMemberadder();
		frame.setupPanel(adder);
	}

}
