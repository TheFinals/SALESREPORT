package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.LoginView;


public class LoginStartKey implements KeyListener
{


	public void keyTyped(KeyEvent e) 
	{}
	
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode()==KeyEvent.VK_ENTER)    
				{
					LoginView.doClick();
					
				}	    
			}
		
	
	public void keyReleased(KeyEvent e)
	{}
	

}
