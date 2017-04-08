package model;

import java.sql.Date;

import javax.swing.JTable;
import javax.swing.JTextField;

public class ModelEmployeeList
{
	public int id;
	

	public String fname;
	public String surname;
	public String  contacts;
	public String address;
	public Date date;
	public String role;
	

	public ModelEmployeeList(int id , String fname, String surname, String contacts, String address,Date date,String role)
	{
		this.id=id;
		this.fname = fname;
		
		this.surname = surname;
		this.contacts=contacts;
		this.address=address;
		this.date=date;
		this.role=role;

	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getContacts() {
		return contacts;
	}


	public void setContacts(String contacts) {
		this.contacts = contacts;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

}
