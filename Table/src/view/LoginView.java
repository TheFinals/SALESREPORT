package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import controller.JTextFieldLimit;
import controller.LoginStartKey;


public class LoginView {

	public JFrame frame;
	private static int WIDTH = 445,HEIGHT = 270; 
	public JTextField userText;
	public JPasswordField passwordText;
	private JLabel employee = new JLabel();
	private JLabel password = new JLabel();
	public static JButton loginBar;
	public static JButton employeeBtn;
	public static JButton storageButton;
	public JButton exitBar;
	
	private Exit quit = new Exit();
	
	public String db_tablename = "pos_temp";

	public String userresult;
	public String passresult;

	
	public int admin_id;
	
	
	@SuppressWarnings("deprecation")
	public LoginView() throws Exception 
	{
		 
		frame = new JFrame();
		frame.setSize(WIDTH,HEIGHT);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.DEFAULT_CURSOR);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(createImage("/resources/toolkitbar.png").getImage());
		frame.add(employee);
	

		password.setIcon(createImage("/resources/CaIecwqUAAIV5S9.png"));
		password.setBounds(370,10,60,60);
		employee.add(password);
		
		
		employee.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(253, 120 , 20)));
		employee.setBounds(0, 0, 445, 271);
		employee.setLayout(null);
		
		//////////////Title Label
		JLabel label = new JLabel("EMPLOYEE");
		label.setFont(new Font("Felix Titling", Font.BOLD, 12));
		label.setForeground(Color.gray);
		label.setBounds(80, 100, 70, 16);
		employee.add(label);
		
		//////////////Password Label 
		JLabel label1 = new JLabel("Password");
		label1.setFont(new Font("Felix Titling", Font.BOLD, 12));
		label1.setBounds(80, 146, 78, 16);
		label1.setForeground(Color.gray);
		employee.add(label1);
		
		userText = new JTextField();
		userText.setBounds(170, 95, 210, 28);
		employee.add(userText);
		userText.setColumns(10);
		userText.setDocument(new JTextFieldLimit(11));
		userText.addKeyListener(new LoginStartKey());
		
		passwordText = new JPasswordField();
		passwordText.setBounds(170, 140, 210, 28);
		employee.add(passwordText);
		
		passwordText.setColumns(10);
		passwordText.setDocument(new JTextFieldLimit(11));
		passwordText.addKeyListener(new LoginStartKey());
		
		
		
		loginBar = new JButton("Login");
		loginBar.setBounds(80, 190, 95, 28);
		employee.add(loginBar);
		
		
		
		
		
		 employeeBtn = new JButton("Register");
		employeeBtn.setBounds(185, 190, 95, 28);
		employee.add(employeeBtn);
		

		 
		 
		 exitBar = new JButton("Exit");
			exitBar.setBounds(290, 190, 95, 28);
			employee.add(exitBar);
		exitBar.addActionListener(quit);
		employee.validate();
		
		employee.setIcon( createImage("/resources/loginframe.png"));
		

	}

	private ImageIcon createImage(String string) {
		return new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getClass().getResource(string));
	}

	public static void doClick() {
		
		loginBar.doClick();
		
	}

	public class Exit implements java.awt.event.ActionListener 
	{

		public void actionPerformed(ActionEvent e) {
			int dialogButton=JOptionPane.YES_NO_OPTION;
			
			int dialogResult=JOptionPane.showConfirmDialog(null,"\nWould you like to quit?","Message to Admin", dialogButton);
			
			if(dialogResult==JOptionPane.YES_OPTION){
				try {
					
					System.exit(0);
					
					} 	catch (Exception e1) {
						e1.printStackTrace();
				}
	
			}
		}
	
	}
}
	



	

		
	
	

