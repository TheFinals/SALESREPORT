package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class GraphTableView {

	private JFrame frame;
	private JButton reportButton;
	protected JButton employeeBtn;

	public GraphTableView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setBounds(100, 100, 1041, 640);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton historyButton = new JButton("History");
		historyButton.setBounds(278, 72, 112, 35);
		frame.getContentPane().add(historyButton);
		
		reportButton = new JButton("Report");
		reportButton.setBounds(476, 72, 112, 35);
		frame.getContentPane().add(reportButton);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(783, 136, 230, 453);
		frame.getContentPane().add(internalFrame);
		
		JButton printReport = new JButton("PrintReport");
		printReport.setBounds(783, 98, 112, 26);
		frame.getContentPane().add(printReport);
		
		JButton graphPdf = new JButton("Graph");
		graphPdf.setBounds(901, 98, 112, 26);
		frame.getContentPane().add(graphPdf);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 136, 759, 453);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 0, 735, 441);
		panel.add(scrollPane);
		
		 employeeBtn = new JButton("Employee");
		employeeBtn.setBounds(84, 72, 112, 35);
		frame.getContentPane().add(employeeBtn);
		internalFrame.setVisible(true);
	}
}
