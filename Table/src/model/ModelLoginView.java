package model;

import java.util.ArrayList;


public class ModelLoginView
{

	static String password;
	static String username;
	static String userText;
	static String passwordText;
	
	public static String getUserText() {
		return userText;
	}

	public static void setUserText(String string) {
		ModelLoginView.userText = string;
	}

	public static String getPasswordText() {
		return passwordText;
	}

	public static void setPasswordText(String passwordText) {
		ModelLoginView.passwordText = passwordText;
	}

	
	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		ModelLoginView.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		ModelLoginView.password = password;
	}



	

}
