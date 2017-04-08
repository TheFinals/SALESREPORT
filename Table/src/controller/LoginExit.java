package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.LoginView;


public class LoginExit implements ActionListener 
{
	public void actionPerformed(ActionEvent e) 
	{
		
		int dialogButton=JOptionPane.YES_NO_OPTION;
		
		int dialogResult=JOptionPane.showConfirmDialog(null,"\nWould you like to continue?","Message to Admin", dialogButton);
		
		if(dialogResult==JOptionPane.YES_OPTION){
			
			try {
				LoginView s=new LoginView();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
		}
		else {
			try {
				LoginView s=new LoginView();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.exit(0);
		}
		
	}



	



}
