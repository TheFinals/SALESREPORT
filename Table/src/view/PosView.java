package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import controller.JTextFieldLimit;
import controller.PostViewController;

import javax.swing.JTextArea;
import javax.swing.JSlider;
import java.awt.Label;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Choice;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Button;
import javax.swing.JScrollPane;
import java.awt.Window.Type;
import javax.swing.JLabel;

public class PosView {

	public JFrame frame;
	public JTextArea transactionInputField;
	public JTextField txtQty;
	private JTable transactionTable;
	protected Choice choiceCategory;
	protected Choice chosenItem;
	private JButton btnConfirm ;
	private JLabel lblQty;
	protected JButton btnCancel;
	private JLabel entitiesLabel;
	private JLabel lblCategory;
	private JScrollPane scrollPane_1;
	private JLabel receiptLabel;
	protected JButton storageBtn;
	protected JButton btnProceed;
	Button button;
	protected Button minQty;
	private JButton btnTransaction ;
	
	public PosView() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 730, 475);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		btnConfirm = new JButton("Confirm");
		btnConfirm.setFocusTraversalKeysEnabled(false);
		btnConfirm.setRolloverEnabled(false);
		btnConfirm.setRequestFocusEnabled(false);
		btnConfirm.setVerifyInputWhenFocusTarget(false);
		btnConfirm.setBounds(7, 396, 90, 30);
		frame.getContentPane().add(btnConfirm);
		
		btnCancel = new JButton("Cancel");
		
		btnCancel.setBounds(114, 396, 90, 30);
		frame.getContentPane().add(btnCancel);
		
		 btnTransaction = new JButton("Transaction History");
		btnTransaction.setBounds(235, 396, 151, 30);
		frame.getContentPane().add(btnTransaction);
		
		choiceCategory = new Choice();
		choiceCategory.setFocusable(false);
		choiceCategory.setFocusTraversalKeysEnabled(false);
		choiceCategory.setBounds(7, 48, 313, 32);
		frame.getContentPane().add(choiceCategory);
		
		chosenItem = new Choice();
		choiceCategory.setFocusable(false);
		choiceCategory.setFocusTraversalKeysEnabled(false);
		chosenItem.setBounds(7, 121, 165, 36);
		frame.getContentPane().add(chosenItem);
		
		txtQty = new JTextField();
		txtQty.setBounds(181, 121, 23, 21);
		frame.getContentPane().add(txtQty);
		txtQty.setDocument(new JTextFieldLimit(2));
		txtQty.setColumns(10);
		
		 minQty = new Button("Buy");
		minQty.setBounds(210, 121, 53, 20);
		frame.getContentPane().add(minQty);
		
		
		
		transactionTable = new JTable();
		transactionTable.setBounds(0, 0, 1, 1);
		
		frame.getContentPane().add(transactionTable);
		
		JScrollPane scrollPane = new JScrollPane(transactionTable);
		scrollPane.setBounds(326, 73, 378, 311);
		frame.getContentPane().add(scrollPane);
		
		lblQty = new JLabel("Qty");
		lblQty.setBounds(181, 93, 23, 16);
		frame.getContentPane().add(lblQty);
		
		button = new Button("Clear");
		button.setBounds(267, 121, 53, 20);
		frame.getContentPane().add(button);
		
		entitiesLabel = new JLabel("");
		entitiesLabel.setBounds(10, 93, 165, 16);
		frame.getContentPane().add(entitiesLabel);
		
		lblCategory = new JLabel("Category");
		lblCategory.setBounds(122, 12, 129, 30);
		frame.getContentPane().add(lblCategory);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 148, 314, 236);
		frame.getContentPane().add(scrollPane_1);
		
		transactionInputField = new JTextArea();
		scrollPane_1.setViewportView(transactionInputField);
		transactionInputField.setEditable(false);
		transactionInputField.setLineWrap(true);
		transactionInputField.setWrapStyleWord(true);
		transactionInputField.setColumns(10);
		
		receiptLabel = new JLabel("Receipt");
		receiptLabel.setBounds(483, 12, 165, 47);
		frame.getContentPane().add(receiptLabel);
		
		storageBtn = new JButton("Product Storage");
		storageBtn.setBounds(442, 396, 160, 30);
		frame.getContentPane().add(storageBtn);
		
		btnProceed = new JButton("Proceed");
		btnProceed.setBounds(614, 396, 90, 30);
		frame.getContentPane().add(btnProceed);
		
		
		frame.setVisible(true);
	}
}