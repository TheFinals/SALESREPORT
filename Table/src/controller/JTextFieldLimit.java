package controller;


import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


 public class JTextFieldLimit extends PlainDocument {
	
	public int  limit;
	
	 public JTextFieldLimit(int i) 
	{
		super();
		this.limit=i;
	}

	JTextFieldLimit(int limit,boolean upper){
		super();
		this.limit=limit;
		
	}
	public void insertString(int offset,String str,AttributeSet attr)throws BadLocationException{
		
		if(str==null)
			return;
		
		if((getLength()+str.length())<=limit)
		{
			super.insertString(offset,str,attr);
		}
	}
	
}
