package view;

import javax.swing.table.DefaultTableModel;

import controller.ProductEditController;

import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ProductStorageEditView extends javax.swing.JFrame 
{
	private static final long serialVersionUID = 1L;
	public ProductStorageEditView() 
    {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	setResizable(false);
        initComponents();
    }
    protected void retrieve()
    {
     DefaultTableModel dm = new ProductEditController().getData();
        jTable1.setModel(dm);   
    }
    
                             
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        retrieveBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        dateTxt = new javax.swing.JTextField();
        costTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setText("Products Storage");
        jLabel4.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        jPanel1.setBackground(SystemColor.inactiveCaptionBorder);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
      
        
        quantityLabel = new JLabel();
        quantityLabel.setText("Quantity");
        
        quantityTxt = new JTextField();
        
        categoryLabel = new JLabel();
        categoryLabel.setText("Category");
        
        categoryTxt = new JTextField();
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(dateTxt, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
        						.addComponent(quantityTxt, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
        						.addComponent(costTxt, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(addBtn, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(quantityLabel)
        									.addComponent(categoryLabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
        									.addComponent(jLabel1)
        									.addComponent(costLabel)
        									.addComponent(dateLabel))
        								.addComponent(updateBtn, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(Delete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(retrieveBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(categoryTxt, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED, 715, Short.MAX_VALUE)
        							.addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
        					.addContainerGap())
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        					.addGap(73))))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(costTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(costLabel))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(dateTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(dateLabel))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(quantityTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(quantityLabel))
        			.addGap(21)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(categoryTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(categoryLabel))
        			.addGap(50)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(retrieveBtn)
        				.addComponent(addBtn))
        			.addGap(51)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(Delete)
        				.addComponent(updateBtn))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(clearBtn)
        			.addGap(12))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(38)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);
        
        backBtn = new JButton();
        backBtn.setText("Back");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(19)
        					.addComponent(backBtn, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        					.addGap(245)
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(11)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(backBtn)
        				.addComponent(jLabel4))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 865, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);
        pack();
    }                    
    public javax.swing.JButton Delete;
    public javax.swing.JButton addBtn;
    public javax.swing.JButton clearBtn;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel costLabel;
    public javax.swing.JLabel dateLabel;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTable1;
    protected javax.swing.JTextField nameTxt;
    protected javax.swing.JTextField costTxt;
    public javax.swing.JButton retrieveBtn;
    protected javax.swing.JTextField dateTxt;
    public javax.swing.JButton updateBtn;
    public JLabel quantityLabel;
    protected JTextField quantityTxt;
    public JLabel categoryLabel;
    protected JTextField categoryTxt; 
    private JButton backBtn;
}
