package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


import view.ProductStorageEditView;

public class ProductEditController extends ProductStorageEditView {

	private static final long serialVersionUID = 1L;
	String conString = "jdbc:mysql://127.0.0.1/se?";
    String username = "root";
    String password = "user";
    
    
    public ProductEditController()
    {
    	  jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
              public void mouseClicked(java.awt.event.MouseEvent evt) {
                  jTable1MouseClicked(evt);
              }
          });
          jScrollPane1.setViewportView(jTable1);
          jLabel1.setText("Name");
          costLabel.setText("Cost");
          dateLabel.setText("Date");

          retrieveBtn.setText("Retrieve");
          retrieveBtn.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
                  retrieveBtnActionPerformed(evt);
              }
          });
          addBtn.setText("Add");
          addBtn.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
                  addBtnActionPerformed(evt);
              }
          });
          updateBtn.setText("Update");
          updateBtn.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
                  updateBtnActionPerformed(evt);
              }
          });
          Delete.setText("Delete");
          Delete.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
                  DeleteActionPerformed(evt);
              }
          });
          clearBtn.setText("Clear");
          clearBtn.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
                  clearBtnActionPerformed(evt);
              }
          });
          
          costTxt.addKeyListener(new KeyListener()
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
    }
    public Boolean add(String name, float cost, Date date, int quantity, String category) {
     
        String sql = "INSERT INTO products(products_id,products_name,products_cost,date_modified,product_quantity,products_category) VALUES(false,'" + name + "','" + cost + "','" + date + "','" + quantity + "','" + category + "')";
        try {
         
            java.sql.Connection con = DriverManager.getConnection(conString, username, password);
       
            PreparedStatement s = con.prepareStatement(sql);
            s.execute(sql);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    //RETRIEVE BUTTON CLICKED
    public void retrieveBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        retrieve();
    }                                           
    //ADD OR SAVE
    public void addBtnActionPerformed(java.awt.event.ActionEvent evt) {  
    	long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  
		dateTxt.setText(String.valueOf(date));
        if (new ProductEditController().add(nameTxt.getText(), Float.parseFloat(costTxt.getText()), Date.valueOf(dateTxt.getText()),Integer.parseInt(quantityTxt.getText()),categoryTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Inserted");
            //CLEAR TXT
            nameTxt.setText("");
            costTxt.setText("");
            dateTxt.setText("");
            quantityTxt.setText("");
            categoryTxt.setText("");
            
            retrieve();
        } else {
            JOptionPane.showMessageDialog(null, "Not Saved");
        }
    }                                      
    //SET SELECTED VALUE TO TEXTFIELDS
    public void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        String name = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String cost = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String date = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String quantity = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();

        String category = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
        nameTxt.setText(name.toString());
        costTxt.setText(cost.toString());
        dateTxt.setText(date.toString());
        quantityTxt.setText(quantity.toString());
        categoryTxt.setText(category.toString());
    }       
    public void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int index = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(index, 0).toString();
        if (new ProductEditController().update(id,nameTxt.getText(), costTxt.getText(), dateTxt.getText(),quantityTxt.getText(),categoryTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            //CLEAR TXT
            nameTxt.setText("");
            costTxt.setText("");
            dateTxt.setText("");
            quantityTxt.setText("");
            categoryTxt.setText("");
            
            retrieve();
        } else {
            JOptionPane.showMessageDialog(null, "Not Updated");
        }
    }                                         
    //DELETE
    public void DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Sure To Delete??", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (answ == 0) {
            int index = jTable1.getSelectedRow();
            String id = jTable1.getValueAt(index, 0).toString();
            if (new ProductEditController().delete(id)) {
                JOptionPane.showMessageDialog(null, "Deleted Updated");
                //CLEAR TXT
                nameTxt.setText("");
                costTxt.setText("");
                dateTxt.setText("");
                quantityTxt.setText("");
                costTxt.setText("");
           retrieve();
            } else 
            {
                JOptionPane.showMessageDialog(null, "Not Deleted");
            }
        }
    }                                      
//CLEAR BUTTON CLICKED
    public void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
          jTable1.setModel(new DefaultTableModel());
    }                                        
    public DefaultTableModel getData() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Prod. ID");
        dm.addColumn("Prod. Name");
        dm.addColumn("Prod. Cost");
        dm.addColumn("Date");
        dm.addColumn("Quantity");
        dm.addColumn("Category");
        
        String sql = "SELECT * FROM products";
        try {
            java.sql.Connection con = DriverManager.getConnection(conString, username, password);
          
            PreparedStatement s = con.prepareStatement(sql);
            java.sql.ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                //GET VALUES
                int id = rs.getInt(1);
                String name = rs.getString(2);
                float cost = rs.getFloat(3);
                Date date = rs.getDate(4);
                int quantity = rs.getInt(5);
                String category = rs.getString(6);
                dm.addRow(new Object[]{id, name, cost, date, quantity, category});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Boolean update(String id, String name, String cost, String date, String quantity, String category) {
    
        @SuppressWarnings("deprecation")
		String sql = "UPDATE products SET products_name ='" + name + "',products_cost='" + Float.parseFloat(cost) + "',date_modified='" + Date.parse(date) 
        		+ "',product_quantity ='"+Integer.parseInt(quantity)+ "',products_category ='"+category+"' WHERE products_id='" +Integer.parseInt(id) + "'";
        try {
            java.sql.Connection con = DriverManager.getConnection(conString, username, password);
         
            PreparedStatement s = con.prepareStatement(sql);
            
            s.execute(sql);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    //DELETE DATA
    public Boolean delete(String id)
    {
     
        String sql="DELETE FROM products WHERE products_id ='"+id+"'";
        
        
        try
        {
            java.sql.Connection con=DriverManager.getConnection(conString, username, password);
            
           
            PreparedStatement s=con.prepareStatement(sql);
            
            s.execute(sql);
            
            return true;
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
}