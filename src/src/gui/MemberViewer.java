package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MemberViewer extends JPanel {

	WindowFrame frame;

	public MemberViewer(WindowFrame frame) {
		this.frame = frame;
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

	}
}
