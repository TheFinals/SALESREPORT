package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import model.ModelAddDeleteUpdateFrame;
import model.ModelLoginView;

public class MySQLAccess {
      
		
 		
 	    static String url = "jdbc:mysql://127.0.0.1/se?";
        static String userid = "root";
        static String password = "user";
        static String sql = "SELECT pos_username, pos_password from pos_emp";
       public MySQLAccess()
       {
            
            Calendar calendar = Calendar.getInstance();
            @SuppressWarnings("unused")
			java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
            @SuppressWarnings("unused")
			Connection connection = getConnection();
            
            
       }
       public static Connection getConnection()
       {
    	   Connection con;
    	   try {
			con = DriverManager.getConnection(url,userid,password);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
       }
     

       public ArrayList<MySQLAccess> insertProducts() 
       {
	       System.out.println("A new user was inserted successfully!");
    	   ArrayList<MySQLAccess> insertProduct = new ArrayList<MySQLAccess>();
    	   try {
    	   Connection connection = getConnection();
    	  
    	   String sql = "INSERT INTO products (products_id, products_name, products_cost, date_modified,product_quantity,products_category) VALUES "
    	   		+ "('"+false+"', '"+ModelAddDeleteUpdateFrame.getProductNameField()+"','"+Float.parseFloat(ModelAddDeleteUpdateFrame.getCostField())
    	   		+"', '"+ModelAddDeleteUpdateFrame.getDate()+"', '"+Integer.parseInt(ModelAddDeleteUpdateFrame.getQuantityField())+"',"
    	   				+ " '"+ModelAddDeleteUpdateFrame.getCategoryField()+"')";
    	  
    	   Statement stmt = connection.createStatement();
    	   stmt.executeUpdate(sql);

    	   connection.close(); 
    	      
    	   } catch (Exception e) {
   			// TODO: handle exception
   		}
    	   return insertProduct;
       }
    
       public ArrayList<MySQLAccess> adminList()
       {
    	   
    	   ArrayList<MySQLAccess> adminList = new ArrayList<MySQLAccess>();
    	   
    	   try {
    		
        	   Connection  connection = getConnection();
        	  
        	   String query = "Select pos_username,pos_password FROM pos_emp WHERE pos_username = '"
        			   +ModelLoginView.getUserText()
    		   +"' && pos_password = '"+ModelLoginView.getPasswordText()+"'";
    		    String user = "";
    			 String pass = "";
    			 Statement st = connection.createStatement();
    			 ResultSet rs = st.executeQuery(query);
        	
        	   
    		   while(rs.next())
    		   {
    			    user = rs.getString("pos_username");
    			    pass= rs.getString("pos_password");
    			    ModelLoginView.setUsername(user);
    			    ModelLoginView.setPassword(pass);
    		   }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	   return adminList;
       }
	
			
			
}
