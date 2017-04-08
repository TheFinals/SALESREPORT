package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import database.MySQLAccess;
import model.ModelEmployeeList;
import model.ModelLoginView;
import model.ModelPosView;
import view.GraphTableView;
import view.PosView;

public class PostViewController extends PosView
{
	public PostViewController()
	{
		
		category();
		btnProceed.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Admin Proceed");
				new GraphTableContoller();
			}
		});
	
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				
				
				try {
					frame.dispose();	
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		minQty.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				long millis=System.currentTimeMillis();  
				java.sql.Date date=new java.sql.Date(millis);  
				String item  =  chosenItem.getSelectedItem().trim();
				int qty = Integer.parseInt( txtQty.getText());
				
				
				QueryTransferTrans("INSERT INTO transaction_item (transaction_name,transaction_quantity,transaction_cost,transaction_date)"
						+ "VALUES('"+item+"','"+qty+"','"+20+"','"+date+"')");
			}
		});
		storageBtn.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				new ProductEditController().setVisible(true);
			}
		});
		choiceCategory.addItemListener(new ItemListener()
		{
			@Override
			public void itemStateChanged(ItemEvent e) {
				ArrayList<String> list = new ArrayList<String>();
				String item2 = "";
				String categoryChoose =  choiceCategory.getSelectedItem();
				String dataPass = categoryChoose.trim();
				item(dataPass, list );
				chosenItem.removeAll();
				
				for(String item : list)
				{
					chosenItem.addItem(item);
				}
				
			}
		});
		
	}
	
	 public ArrayList<ModelPosView> category()
	 {
		
    	 ArrayList<ModelPosView> category = new ArrayList<ModelPosView>();
    	 try {
    		 
    		 
    		 Connection connection = MySQLAccess.getConnection();
    		 String query = "select distinct products_category from products";
  //  String query = "SELECT products_id, products_cost,product_quantity,products_category, GROUP_CONCAT(products_name SEPARATOR ', ') FROM products  GROUP BY products_category";
    		 Statement st = connection.createStatement();
    		 ResultSet rs = st.executeQuery(query); 
    		 ModelPosView access;
    		 while(rs.next())
    	        {
    			 String category1 = rs.getString("products_category");
    			 choiceCategory.addItem(category1);
    			 
    	        }
    		 
		} catch (Exception e) {
			// TODO: handle exception
		}
    	 return category;
     }
	
	 public ArrayList<ModelPosView> item(String dataPass, ArrayList  lists)
	 {
		System.out.println(dataPass);
    	 ArrayList<ModelPosView> category = new ArrayList<ModelPosView>();
    	 try {
    		 Connection connection = MySQLAccess.getConnection();
    String query = "select * from products where products_category = '"+dataPass+"'";
    		 Statement st = connection.createStatement();
    		 ResultSet rs = st.executeQuery(query); 
    		 while(rs.next())
    	        {
    			 
    			  String list = rs.getString("products_name");
    			  lists.add(list);
    			  
    	        }
    		 
		} catch (Exception e) {
			e.getMessage();
		}
    	 return category;
     }
	 public void QueryTransferTrans(String query_selec_trans) 
		{
			
			Connection conn=null;
			Statement st1= null;
			ResultSet rs;
		
		try{
			
			conn = MySQLAccess.getConnection();
			st1=conn.createStatement();
			
			rs= st1.executeQuery(query_selec_trans);
			st1.addBatch(query_selec_trans);
			
			}
		catch(Exception e)
			{
				System.out.println(e);
			   e.printStackTrace();
			}
			

		}
	 
}
