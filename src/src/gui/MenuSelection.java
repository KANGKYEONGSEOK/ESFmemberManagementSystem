package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {

	public MenuSelection() {

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("Add member");
		JButton button2 = new JButton("Veiw members");
		JButton button3 = new JButton("Edit member");
		JButton button4 = new JButton("Delete member");
		JButton button5 = new JButton("Exit Program");

		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);

		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER); // 전체판이(프레임)이 panel로 설정이 되게 된다.
		this.setSize(300, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);

	}
}
