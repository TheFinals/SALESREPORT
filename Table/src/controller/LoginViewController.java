package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import database.MySQLAccess;
import model.ModelLoginView;
import view.LoginView;


public  class LoginViewController extends LoginView
{
	
	public LoginViewController() throws Exception

	{
		employeeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					new EmployeeTableController().setVisible(true);
			}
		});
		
		
		loginBar.addActionListener(new ActionListener()
		{
		
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				ModelLoginView.setUserText(String.valueOf(userText.getText()));
				ModelLoginView.setPasswordText(String.valueOf(passwordText.getText()));
				
				MySQLAccess s = new MySQLAccess();
				s.adminList();
				
				System.out.println(ModelLoginView.getUserText());
				System.out.println(ModelLoginView.getUsername());
				if(ModelLoginView.getUserText().equals(ModelLoginView.getUsername()) && (ModelLoginView.getPasswordText().equals(ModelLoginView.getPassword())))
				{
					
					JOptionPane.showMessageDialog(null, "Click to proceed");
					frame.setVisible(false);
					  new PostViewController();
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Username | Password invalid");
				}
			}
		} );
		
		
	/*	userText.addKeyListener(new KeyListener()
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
		passwordText.addKeyListener(new KeyListener()
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
*/
		//Optional For getting the exact date and time 
		/*loginBar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	Calendar cal = new GregorianCalendar();
				int second=cal.get(Calendar.SECOND);
				int minute = cal.get(Calendar.MINUTE);
				int hour =cal.get(Calendar.HOUR);
				int AM_PM = cal.get(Calendar.AM_PM);
				
				int month = cal.get(Calendar.MONTH);
				int day= cal.get(Calendar.DAY_OF_MONTH);
				int year =cal.get(Calendar.YEAR);
				String time=hour+":"+minute+":"+second;
				String date =month+"-"+day+"-"+year;
				
			
			});
		}*/
	
		
		}
	}