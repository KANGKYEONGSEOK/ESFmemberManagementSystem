package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MemberViewer extends JFrame {

	public MemberViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Phone");
		model.addColumn("Campus");
		model.addColumn("Position");
		model.addColumn("AttendingChurch");
		model.addColumn("Contact INFO.");

		JTable table = new JTable(model);
		JScrollPane jscroll = new JScrollPane(table);
		this.add(jscroll);
		this.setSize(700, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);
	}
}
