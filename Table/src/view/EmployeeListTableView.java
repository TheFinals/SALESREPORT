package view;

import controller.EmployeeTableController;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;


public class EmployeeListTableView extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	public EmployeeListTableView() {
		setResizable(false);
		setTitle("Employee Register");
        initComponents();
        EmployeeTableController.nimbusFormat();
        EmployeeTableController.findUsers();
        
    }
                     
    public void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton_Search = new javax.swing.JButton();
        jButton_Search.setRolloverEnabled(false);
        jButton_Search.setRequestFocusEnabled(false);
        jText_Search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        jTable_Users = new javax.swing.JTable();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jButton_Search.setText("Search");
       

        jText_Search.setFont(new java.awt.Font("Calibri", 1, 14)); 
        
        jTable_Users.setFont(new java.awt.Font("Calibri", 1, 12)); 
        jTable_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Users);
        
        addBtn = new JButton();
        addBtn.setRequestFocusEnabled(false);
        addBtn.setText("Add");
        
        btnDelete = new JButton();
        btnDelete.setRequestFocusEnabled(false);
        btnDelete.setText("Delete");
        
        btnBack = new JButton();
        btnBack.setFocusable(false);
        btnBack.setFocusPainted(false);
        btnBack.setSelected(true);
        btnBack.setRequestFocusEnabled(false);
        btnBack.setFocusTraversalKeysEnabled(false);
        btnBack.setText("back");
        
        btnProceed = new JButton();
        btnProceed.setFocusPainted(false);
        btnProceed.setFocusTraversalKeysEnabled(false);
        btnProceed.setFocusable(false);
        btnProceed.setText("Proceed");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jText_Search, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton_Search, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(addBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
        			.addComponent(btnProceed, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
        			.addGap(32))
        		.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(35)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton_Search)
        				.addComponent(jText_Search, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnBack)
        				.addComponent(addBtn)
        				.addComponent(btnDelete)
        				.addComponent(btnProceed))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
    }            

   
              
    protected static javax.swing.JButton jButton_Search;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    protected static  javax.swing.JTable jTable_Users;
    protected static javax.swing.JTextField jText_Search;                
    protected static JButton addBtn;
    protected static JButton btnDelete;
    protected static JButton btnBack;
    protected static JButton btnProceed;
}