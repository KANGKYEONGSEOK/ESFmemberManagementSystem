package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MemberAdder extends JFrame {

	public MemberAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		//Id
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10); // 10은 길이를 뜻함
		labelID.setLabelFor(fieldID); //labelID는 fieldID 의 것이라는 뜻.
		panel.add(labelID);
		panel.add(fieldID);

		//Name
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10); 
		labelName.setLabelFor(fieldName); 
		panel.add(labelName);
		panel.add(fieldName);

		// Email
		JLabel labelEmail = new JLabel("E-mail: ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10); 
		labelEmail.setLabelFor(fieldEmail); 
		panel.add(labelEmail);
		panel.add(fieldEmail);

		//Phone
		JLabel labelPhone = new JLabel("Phone: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10); 
		labelPhone.setLabelFor(fieldPhone); 
		panel.add(labelPhone);
		panel.add(fieldPhone);

		//Campus
		JLabel labelCampus = new JLabel("Campus: ", JLabel.TRAILING);
		JTextField fieldCampus = new JTextField(10); 
		labelCampus.setLabelFor(fieldCampus); 
		panel.add(labelCampus);
		panel.add(fieldCampus);

		//Position
		JLabel labelPosition = new JLabel("Position: ", JLabel.TRAILING);
		JTextField fieldPosition = new JTextField(10); 
		labelPosition.setLabelFor(fieldPosition); 
		panel.add(labelPosition);
		panel.add(fieldPosition);

		//AttendingChurch
		JLabel labelAttendingChurch = new JLabel("AttendingChurch: ", JLabel.TRAILING);
		JTextField fieldAttendingChurch = new JTextField(10); 
		labelAttendingChurch.setLabelFor(fieldAttendingChurch); 
		panel.add(labelAttendingChurch);
		panel.add(fieldAttendingChurch);

		panel.add(new JButton("SAVE"));
		panel.add(new JButton("Cancel"));
		SpringUtilities.makeCompactGrid(panel, 8, 2, 6, 6, 6, 6);
		this.setSize(300, 300); // 사이즈 설정.
		this.setContentPane(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true); 
	}
}
