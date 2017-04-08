package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.ModelEmployeeList;
import view.AddData;
import view.EmployeeListTableView;

public class EmployeeTableController extends EmployeeListTableView{

	private static final long serialVersionUID = 1L;
	long millis=System.currentTimeMillis();  
	java.sql.Date date=new java.sql.Date(millis);  
	
	public EmployeeTableController()
	{
		btnProceed.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			dispose();
				
			}
		});
		
			btnBack.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                try {
						jButton_CancelActionPerformed(evt);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        });
			
			addBtn.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                try {
						jButton_AddActionPerformed(evt);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        });
			
		 jButton_Search.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_SearchActionPerformed(evt);
	            }
	        });
			
		
	}
	 protected void jButton_CancelActionPerformed(ActionEvent evt) throws Exception {
		
		new LoginViewController().frame.setVisible(true);
		
	}
	private void jButton_AddActionPerformed(ActionEvent evt) throws SQLException {
		new AddDataController();
	}
	public static void  nimbusFormat(){
	        try
	        {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
	            {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        }
	        catch (ClassNotFoundException ex)
	        {
	            java.util.logging.Logger.getLogger(EmployeeListTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (InstantiationException ex) 
	        {
	            java.util.logging.Logger.getLogger(EmployeeListTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (IllegalAccessException ex)
	        {
	            java.util.logging.Logger.getLogger(EmployeeListTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex)
	        {
	            java.util.logging.Logger.getLogger(EmployeeListTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        
	       
	    }
	public static Connection getConnection()
    {
        Connection con = null;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/se?","root","user");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
    public static ArrayList<ModelEmployeeList> ListUsers(String ValToSearch)
    {
        ArrayList<ModelEmployeeList> usersList = new ArrayList<ModelEmployeeList>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT pos_id,pos_fname,pos_surname,pos_contacts,pos_address,date_registered,pos_role FROM pos_emp  WHERE CONCAT(pos_id,pos_fname,pos_surname,pos_contacts,pos_address,date_registered,pos_role) LIKE '%"+ValToSearch+"%'" ;
            rs = st.executeQuery(searchQuery);
            
            ModelEmployeeList access;
            
            while(rs.next())
            {
                access = new ModelEmployeeList(
						   rs.getInt("pos_id"),
						   rs.getString("pos_fname"),
						   rs.getString("pos_surname"),
						   rs.getString("pos_contacts"),
						   rs.getString("pos_address"),
						   rs.getDate("date_registered"),
						   rs.getString("pos_role"));
                usersList.add(access);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return usersList;
    }
    
	private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {                                               
     
      findUsers();
       
    }       
    // function to display data in jtable
    public static void findUsers()
    {
        ArrayList<ModelEmployeeList> list = ListUsers(jText_Search.getText()); 
        DefaultTableModel model = new DefaultTableModel();
		   model.setColumnIdentifiers(new Object[]{"Employee ID"," FName","Surname","Contacts","Address","Date","Role"});
		   Object[] row = new Object[7];
        
        for(int count = 0; count < list.size(); count++)
        {
        	   row[0] = list.get(count).getId();
    		   row[1] = list.get(count).getFname();
    		   row[2] = list.get(count).getSurname();
    		   row[3] = list.get(count).getContacts();
    		   row[4] = list.get(count).getAddress();
    		   row[5] = list.get(count).getDate();
    		   row[6] = list.get(count).getRole();
    		   model.addRow( row);
        }
       jTable_Users.setModel(model);
       
    }

}
