package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import database.MySQLAccess;
import model.ModelEmployeeList;
import model.ModelPosView;
import oracle.sql.DATE;
import view.AddData;

public class AddDataController extends AddData
{
public AddDataController() throws SQLException
{
	role.addKeyListener(new KeyListener()
	{
		public void keyTyped(KeyEvent evt) {

			char c= evt.getKeyChar();
			
			if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
				
			
				evt.consume();
			}
		}
		public void keyPressed(KeyEvent e) {}
		public void keyReleased(KeyEvent e) {}
	});
	fname.addKeyListener(new KeyListener()
	{
		public void keyTyped(KeyEvent evt) {

			char c= evt.getKeyChar();
			
			if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
				
				evt.consume();
			}
		}
		public void keyPressed(KeyEvent e) {}
		public void keyReleased(KeyEvent e) {}
	});
	surname.addKeyListener(new KeyListener()
	{
		public void keyTyped(KeyEvent evt) {

			char c= evt.getKeyChar();
			
			if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
				
				evt.consume();
			}
		}
		public void keyPressed(KeyEvent e) {}
		public void keyReleased(KeyEvent e) {}
	});
	contacts.addKeyListener(new KeyListener()
	{
		public void keyTyped(KeyEvent evt) {

			char c= evt.getKeyChar();
			
			if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
				
				evt.consume();
			}
		}
		public void keyPressed(KeyEvent e) {}
		public void keyReleased(KeyEvent e) {}
	});
btnAdd.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			addEmp();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			e1.getMessage();
		}
	}
});
	
	
}
	public  void addEmp() throws SQLException
	{
		
		ResultSet rs;
		Statement st;

		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  
	
			String sql = "INSERT INTO pos_emp(pos_fname, pos_surname,pos_contacts,pos_address,date_registered,pos_username,pos_password,pos_role) VALUES ('"
					 + fname.getText() + "','" + surname.getText() + "','" +  contacts.getText()
					+ "','" + address.getText() + "','" + date + "','" + username.getText() 
					+ "','" + password.getText() + "','" + role.getText() + "')";
		
	        try {
	         
	            java.sql.Connection con = MySQLAccess.getConnection();
	            PreparedStatement s = con.prepareStatement(sql);
	            s.execute(sql);
	           
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
			
	       
	}
}
