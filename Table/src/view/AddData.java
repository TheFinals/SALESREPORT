package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.JTextFieldLimit;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddData {

	protected JFrame frame;
	protected JTextField fname;
	protected JTextField surname;
	protected JTextField contacts;
	protected JTextField username;
	protected JTextField password;
	protected JTextField role;
	protected JTextArea address;
	protected JButton btnAdd;
	public AddData() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 332, 420);
		frame.getContentPane().setLayout(null);
		
		JLabel adminFname = new JLabel("First Name");
		adminFname.setBounds(32, 23, 78, 22);
		frame.getContentPane().add(adminFname);
		
		JLabel lblProductCost = new JLabel("Surname");
		lblProductCost.setBounds(32, 56, 78, 22);
		frame.getContentPane().add(lblProductCost);
		
		JLabel lblProductQuantity = new JLabel("Contacts");
		lblProductQuantity.setBounds(32, 89, 89, 22);
		frame.getContentPane().add(lblProductQuantity);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(32, 122, 78, 22);
		frame.getContentPane().add(lblDate);
		
		fname = new JTextField();
		fname.setBounds(120, 24, 132, 28);
		frame.getContentPane().add(fname);
		fname.setColumns(10);
		
		surname = new JTextField();
		surname.setColumns(10);
		surname.setBounds(120, 57, 132, 28);
		frame.getContentPane().add(surname);
		
		contacts = new JTextField();
		contacts.setColumns(10);
		contacts.setDocument(new JTextFieldLimit(13));
		
		contacts.setBounds(120, 90, 132, 28);
		frame.getContentPane().add(contacts);
		
		btnAdd = new JButton("Add");
		btnAdd.setBounds(32, 335, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JLabel dateinput = new JLabel("");
		dateinput.setBounds(120, 122, 132, 22);
		frame.getContentPane().add(dateinput);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnCancel.setBounds(186, 335, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(120, 155, 132, 28);
		frame.getContentPane().add(username);
		
		JLabel userlabel = new JLabel("Username");
		userlabel.setBounds(32, 155, 78, 22);
		frame.getContentPane().add(userlabel);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(120, 192, 132, 28);
		frame.getContentPane().add(password);
		
		role = new JTextField();
		role.setColumns(10);
		role.setBounds(120, 223, 132, 28);
		
		frame.getContentPane().add(role);
		
		JLabel passLabel = new JLabel("Password");
		passLabel.setBounds(32, 188, 78, 22);
		frame.getContentPane().add(passLabel);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setBounds(32, 225, 78, 22);
		frame.getContentPane().add(lblRole);
		
		JLabel address1 = new JLabel("Address");
		address1.setBounds(32, 265, 78, 22);
		frame.getContentPane().add(address1);
		
		address = new JTextArea();
		address.setBounds(120, 255, 132, 54);
		frame.getContentPane().add(address);
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  
		
		dateinput.setText(String.valueOf(date));
		
		frame.setVisible(true);
	}
}
