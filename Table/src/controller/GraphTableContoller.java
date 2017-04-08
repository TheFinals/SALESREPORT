package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.GraphTableView;

public class GraphTableContoller extends GraphTableView{

	
	public GraphTableContoller()
	{
		employeeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			 new EmployeeTableController().setVisible(true);
				
			}
		});
	}
}
